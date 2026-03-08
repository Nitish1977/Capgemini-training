package com.learning.cms.controllers;

import com.learning.cms.dto.UserDTO;
import com.learning.cms.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@Tag(name = "User Management", description = "APIs for user registration, login and profile")
public class UserController {

    private final UserService userService;

    @PostMapping("/auth/register")
    @Operation(summary = "Register a new user")
    public ResponseEntity<UserDTO.UserResponseDTO> register(@Valid @RequestBody UserDTO.RegisterRequestDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.register(dto));
    }

    @PostMapping("/auth/login")
    @Operation(summary = "Login user")
    public ResponseEntity<UserDTO.UserResponseDTO> login(@Valid @RequestBody UserDTO.LoginRequestDTO dto) {
        return ResponseEntity.ok(userService.login(dto));
    }

    @GetMapping("/users/{id}")
    @Operation(summary = "Get user by ID")
    public ResponseEntity<UserDTO.UserResponseDTO> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.getUserById(id));
    }

    @PostMapping("/users/{id}/profile-picture")
    @Operation(summary = "Upload profile picture")
    public ResponseEntity<UserDTO.UserResponseDTO> uploadProfilePicture(
            @PathVariable Long id,
            @RequestParam("file") MultipartFile file) {
        return ResponseEntity.ok(userService.uploadProfilePicture(id, file));
    }
}
