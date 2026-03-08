package com.learning.cms.service;

import com.learning.cms.dto.CourseMaterialDTO;
import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface CourseMaterialService {
    CourseMaterialDTO.MaterialResponseDTO uploadMaterial(String title, Long courseId, MultipartFile file);
    Resource downloadMaterial(Long materialId);
    List<CourseMaterialDTO.MaterialResponseDTO> getMaterialsByCourse(Long courseId);
    String getFileNameByMaterialId(Long materialId);
}
