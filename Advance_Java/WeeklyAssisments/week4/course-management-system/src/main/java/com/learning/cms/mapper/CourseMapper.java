package com.learning.cms.mapper;

import com.learning.cms.dto.CourseDTO;
import com.learning.cms.entity.Course;
import org.springframework.stereotype.Component;

@Component
public class CourseMapper {

    public CourseDTO.CourseResponseDTO toResponseDTO(Course course) {
        CourseDTO.CourseResponseDTO dto = new CourseDTO.CourseResponseDTO();
        dto.setId(course.getId());
        dto.setTitle(course.getTitle());
        dto.setDescription(course.getDescription());
        dto.setPrice(course.getPrice());
        dto.setDuration(course.getDuration());
        dto.setLevel(course.getLevel());
        dto.setInstructorName(course.getInstructor().getFullName());
        dto.setCreatedAt(course.getCreatedAt());
        return dto;
    }
}
