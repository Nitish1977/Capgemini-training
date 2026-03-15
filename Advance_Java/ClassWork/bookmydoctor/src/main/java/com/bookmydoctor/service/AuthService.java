package com.bookmydoctor.service;

import com.bookmydoctor.dto.*;
import com.bookmydoctor.entity.Role;
import com.bookmydoctor.entity.User;
import com.bookmydoctor.exception.BadRequestException;
import com.bookmydoctor.repository.RoleRepository;
import com.bookmydoctor.repository.UserRepository;
import com.bookmydoctor.security.CustomUserDetailsService;
import com.bookmydoctor.util.JwtUtil;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AuthService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final JwtUtil jwtUtil;
    private final CustomUserDetailsService userDetailsService;

    public AuthService(UserRepository userRepository, RoleRepository roleRepository,
                       PasswordEncoder passwordEncoder, AuthenticationManager authenticationManager,
                       JwtUtil jwtUtil, CustomUserDetailsService userDetailsService) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
        this.passwordEncoder = passwordEncoder;
        this.authenticationManager = authenticationManager;
        this.jwtUtil = jwtUtil;
        this.userDetailsService = userDetailsService;
    }

    // Register as USER role
    public ApiResponse<String> register(RegisterRequestDTO dto) {
        return registerWithRole(dto, "USER");
    }

    // Register as ADMIN role
    public ApiResponse<String> registerAdmin(RegisterRequestDTO dto) {
        return registerWithRole(dto, "ADMIN");
    }

    private ApiResponse<String> registerWithRole(RegisterRequestDTO dto, String roleName) {
        if (userRepository.existsByEmail(dto.getEmail())) {
            throw new BadRequestException("Email already registered: " + dto.getEmail());
        }

        Role role = roleRepository.findByRoleName(roleName)
                .orElseThrow(() -> new RuntimeException("Role not found: " + roleName));

        User user = new User();
        user.setName(dto.getName());
        user.setEmail(dto.getEmail());
        user.setPassword(passwordEncoder.encode(dto.getPassword()));
        user.setPhoneNumber(dto.getPhoneNumber());
        user.setRole(role);

        userRepository.save(user);
        return ApiResponse.success(roleName + " registered successfully", null);
    }

    public ApiResponse<AuthResponseDTO> login(LoginRequestDTO dto) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(dto.getEmail(), dto.getPassword())
        );

        UserDetails userDetails = userDetailsService.loadUserByUsername(dto.getEmail());

        User user = userRepository.findByEmail(dto.getEmail())
                .orElseThrow(() -> new BadRequestException("User not found"));

        Map<String, Object> claims = new HashMap<>();
        claims.put("role", user.getRole().getRoleName());
        claims.put("name", user.getName());

        String token = jwtUtil.generateToken(userDetails, claims);

        AuthResponseDTO authResponse = new AuthResponseDTO(
                token, "Login successful", user.getRole().getRoleName(), user.getEmail());

        return ApiResponse.success("Login successful", authResponse);
    }
}
