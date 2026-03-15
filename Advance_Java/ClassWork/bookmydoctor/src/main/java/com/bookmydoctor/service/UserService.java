package com.bookmydoctor.service;

import com.bookmydoctor.dto.*;
import com.bookmydoctor.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public ApiResponse<List<UserResponseDTO>> getAllUsers() {
        List<UserResponseDTO> users = userRepository.findAll().stream().map(user -> {
            UserResponseDTO dto = new UserResponseDTO();
            dto.setId(user.getId());
            dto.setName(user.getName());
            dto.setEmail(user.getEmail());
            dto.setPhoneNumber(user.getPhoneNumber());
            dto.setRole(user.getRole().getRoleName());
            dto.setCreatedAt(user.getCreatedAt());
            return dto;
        }).collect(Collectors.toList());
        return ApiResponse.success("Users fetched successfully", users);
    }
}
