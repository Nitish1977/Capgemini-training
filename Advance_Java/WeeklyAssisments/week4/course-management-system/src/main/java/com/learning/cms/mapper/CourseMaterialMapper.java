package com.learning.cms.mapper;

import com.learning.cms.dto.CourseMaterialDTO;
import com.learning.cms.entity.CourseMaterial;
import org.springframework.stereotype.Component;

@Component
public class CourseMaterialMapper {

    public CourseMaterialDTO.MaterialResponseDTO toResponseDTO(CourseMaterial material) {
        CourseMaterialDTO.MaterialResponseDTO dto = new CourseMaterialDTO.MaterialResponseDTO();
        dto.setId(material.getId());
        dto.setTitle(material.getTitle());
        dto.setFileName(material.getFileName());
        dto.setFileType(material.getFileType());
        dto.setFileUrl(material.getFileUrl());
        dto.setUploadDate(material.getUploadDate());
        return dto;
    }
}
