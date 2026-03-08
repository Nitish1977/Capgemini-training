package com.learning.cms.service;

import com.learning.cms.dto.CourseDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CourseService {
    CourseDTO.CourseResponseDTO createCourse(CourseDTO.CourseRequestDTO dto);
    CourseDTO.CourseResponseDTO updateCourse(Long id, CourseDTO.CourseRequestDTO dto);
    void deleteCourse(Long id);
    Page<CourseDTO.CourseResponseDTO> getAllCourses(Pageable pageable);
    CourseDTO.CourseResponseDTO getCourseById(Long id);
    List<CourseDTO.CourseResponseDTO> getCoursesByInstructor(Long instructorId);
}
