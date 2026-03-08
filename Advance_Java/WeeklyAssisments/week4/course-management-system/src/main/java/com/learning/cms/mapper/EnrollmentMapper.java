package com.learning.cms.mapper;

import com.learning.cms.dto.EnrollmentDTO;
import com.learning.cms.entity.Enrollment;
import org.springframework.stereotype.Component;

@Component
public class EnrollmentMapper {

    public EnrollmentDTO.EnrollmentResponseDTO toResponseDTO(Enrollment enrollment) {
        EnrollmentDTO.EnrollmentResponseDTO dto = new EnrollmentDTO.EnrollmentResponseDTO();
        dto.setId(enrollment.getId());
        dto.setCourseTitle(enrollment.getCourse().getTitle());
        dto.setStudentName(enrollment.getStudent().getFullName());
        dto.setStatus(enrollment.getStatus());
        dto.setProgressPercentage(enrollment.getProgressPercentage());
        dto.setEnrollmentDate(enrollment.getEnrollmentDate());
        return dto;
    }
}
