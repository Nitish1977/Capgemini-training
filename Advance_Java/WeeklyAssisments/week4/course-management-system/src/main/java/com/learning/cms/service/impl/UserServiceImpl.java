package com.learning.cms.service.impl;

import com.learning.cms.dto.UserDTO;
import com.learning.cms.entity.User;
import com.learning.cms.exception.InvalidRequestException;
import com.learning.cms.exception.ResourceNotFoundException;
import com.learning.cms.mapper.UserMapper;
import com.learning.cms.repository.UserRepository;
import com.learning.cms.service.UserService;
import com.learning.cms.util.FileStorageUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;
    private final FileStorageUtil fileStorageUtil;

    @Override
    public UserDTO.UserResponseDTO register(UserDTO.RegisterRequestDTO dto) {
        if (userRepository.existsByEmail(dto.getEmail())) {
            throw new InvalidRequestException("Email already registered: " + dto.getEmail());
        }

        User user = User.builder()
                .fullName(dto.getFullName())
                .email(dto.getEmail())
                .password(dto.getPassword())
                .role(dto.getRole())
                .build();

        return userMapper.toResponseDTO(userRepository.save(user));
    }

    @Override
    public UserDTO.UserResponseDTO login(UserDTO.LoginRequestDTO dto) {
        User user = userRepository.findByEmail(dto.getEmail())
                .orElseThrow(() -> new ResourceNotFoundException("User not found with email: " + dto.getEmail()));

        if (!user.getPassword().equals(dto.getPassword())) {
            throw new InvalidRequestException("Invalid credentials");
        }

        return userMapper.toResponseDTO(user);
    }

    @Override
    public UserDTO.UserResponseDTO getUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + id));
        return userMapper.toResponseDTO(user);
    }

    @Override
    public UserDTO.UserResponseDTO uploadProfilePicture(Long userId, MultipartFile file) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new ResourceNotFoundException("User not found with id: " + userId));

        String fileName = fileStorageUtil.storeFile(file);
        user.setProfilePicture(fileName);

        return userMapper.toResponseDTO(userRepository.save(user));
    }
}
