package com.learning.cms.mapper;

import com.learning.cms.dto.UserDTO;
import com.learning.cms.entity.User;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {

    public UserDTO.UserResponseDTO toResponseDTO(User user) {
        UserDTO.UserResponseDTO dto = new UserDTO.UserResponseDTO();
        dto.setId(user.getId());
        dto.setFullName(user.getFullName());
        dto.setEmail(user.getEmail());
        dto.setRole(user.getRole());
        dto.setProfilePicture(user.getProfilePicture());
        dto.setCreatedAt(user.getCreatedAt());
        return dto;
    }
}
