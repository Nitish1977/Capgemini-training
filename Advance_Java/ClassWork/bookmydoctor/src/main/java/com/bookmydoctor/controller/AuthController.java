package com.bookmydoctor.controller;

import com.bookmydoctor.dto.*;
import com.bookmydoctor.service.AuthService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@Tag(name = "Authentication", description = "Register and login APIs")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/register")
    @Operation(
        summary = "Register as User",
        description = "Creates a new account with USER role. Use this for patient registration."
    )
    public ResponseEntity<ApiResponse<String>> register(@Valid @RequestBody RegisterRequestDTO dto) {
        return ResponseEntity.ok(authService.register(dto));
    }

    @PostMapping("/register/admin")
    @Operation(
        summary = "Register as Admin",
        description = "Creates a new account with ADMIN role. Admin can add/update/delete doctors and view all appointments."
    )
    public ResponseEntity<ApiResponse<String>> registerAdmin(@Valid @RequestBody RegisterRequestDTO dto) {
        return ResponseEntity.ok(authService.registerAdmin(dto));
    }

    @PostMapping("/login")
    @Operation(
        summary = "Login",
        description = "Login with email and password. Copy the 'token' from response, click Authorize at the top and paste: Bearer {token}"
    )
    public ResponseEntity<ApiResponse<AuthResponseDTO>> login(@Valid @RequestBody LoginRequestDTO dto) {
        return ResponseEntity.ok(authService.login(dto));
    }
}
