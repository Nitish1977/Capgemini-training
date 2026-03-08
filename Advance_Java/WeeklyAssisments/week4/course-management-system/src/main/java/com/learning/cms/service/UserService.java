package com.learning.cms.service;

import com.learning.cms.dto.UserDTO;
import org.springframework.web.multipart.MultipartFile;

public interface UserService {
    UserDTO.UserResponseDTO register(UserDTO.RegisterRequestDTO dto);
    UserDTO.UserResponseDTO login(UserDTO.LoginRequestDTO dto);
    UserDTO.UserResponseDTO getUserById(Long id);
    UserDTO.UserResponseDTO uploadProfilePicture(Long userId, MultipartFile file);
}
