package com.learning.cms.service;

import com.learning.cms.dto.EnrollmentDTO;

import java.util.List;

public interface EnrollmentService {
    EnrollmentDTO.EnrollmentResponseDTO enrollStudent(EnrollmentDTO.EnrollmentRequestDTO dto);
    List<EnrollmentDTO.EnrollmentResponseDTO> getEnrollmentsByStudent(Long studentId);
    List<EnrollmentDTO.EnrollmentResponseDTO> getEnrollmentsByCourse(Long courseId);
    EnrollmentDTO.EnrollmentResponseDTO updateProgress(Long enrollmentId, Double progressPercentage);
}
