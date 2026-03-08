package com.learning.cms.service.impl;

import com.learning.cms.dto.CourseMaterialDTO;
import com.learning.cms.entity.Course;
import com.learning.cms.entity.CourseMaterial;
import com.learning.cms.exception.ResourceNotFoundException;
import com.learning.cms.mapper.CourseMaterialMapper;
import com.learning.cms.repository.CourseMaterialRepository;
import com.learning.cms.repository.CourseRepository;
import com.learning.cms.service.CourseMaterialService;
import com.learning.cms.util.FileStorageUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CourseMaterialServiceImpl implements CourseMaterialService {

    private final CourseMaterialRepository courseMaterialRepository;
    private final CourseRepository courseRepository;
    private final CourseMaterialMapper courseMaterialMapper;
    private final FileStorageUtil fileStorageUtil;

    @Override
    public CourseMaterialDTO.MaterialResponseDTO uploadMaterial(String title, Long courseId, MultipartFile file) {
        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new ResourceNotFoundException("Course not found with id: " + courseId));

        String fileName = fileStorageUtil.storeFile(file);

        CourseMaterial material = CourseMaterial.builder()
                .title(title)
                .fileName(fileName)
                .fileType(file.getContentType())
                .fileUrl("/api/materials/" + fileName + "/download")
                .course(course)
                .build();

        return courseMaterialMapper.toResponseDTO(courseMaterialRepository.save(material));
    }

    @Override
    public Resource downloadMaterial(Long materialId) {
        CourseMaterial material = courseMaterialRepository.findById(materialId)
                .orElseThrow(() -> new ResourceNotFoundException("Material not found with id: " + materialId));

        return fileStorageUtil.loadFileAsResource(material.getFileName());
    }

    @Override
    public List<CourseMaterialDTO.MaterialResponseDTO> getMaterialsByCourse(Long courseId) {
        return courseMaterialRepository.findByCourseId(courseId)
                .stream()
                .map(courseMaterialMapper::toResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public String getFileNameByMaterialId(Long materialId) {
        CourseMaterial material = courseMaterialRepository.findById(materialId)
                .orElseThrow(() -> new ResourceNotFoundException("Material not found with id: " + materialId));
        return material.getFileName();
    }
}
