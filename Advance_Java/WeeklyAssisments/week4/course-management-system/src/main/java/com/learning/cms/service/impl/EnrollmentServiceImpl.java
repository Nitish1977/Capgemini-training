package com.learning.cms.service.impl;

import com.learning.cms.dto.EnrollmentDTO;
import com.learning.cms.entity.Course;
import com.learning.cms.entity.Enrollment;
import com.learning.cms.entity.User;
import com.learning.cms.exception.InvalidRequestException;
import com.learning.cms.exception.ResourceNotFoundException;
import com.learning.cms.mapper.EnrollmentMapper;
import com.learning.cms.repository.CourseRepository;
import com.learning.cms.repository.EnrollmentRepository;
import com.learning.cms.repository.UserRepository;
import com.learning.cms.service.EnrollmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class EnrollmentServiceImpl implements EnrollmentService {

    private final EnrollmentRepository enrollmentRepository;
    private final UserRepository userRepository;
    private final CourseRepository courseRepository;
    private final EnrollmentMapper enrollmentMapper;

    @Override
    public EnrollmentDTO.EnrollmentResponseDTO enrollStudent(EnrollmentDTO.EnrollmentRequestDTO dto) {
        if (enrollmentRepository.existsByStudentIdAndCourseId(dto.getStudentId(), dto.getCourseId())) {
            throw new InvalidRequestException("Student is already enrolled in this course");
        }

        User student = userRepository.findById(dto.getStudentId())
                .orElseThrow(() -> new ResourceNotFoundException("Student not found with id: " + dto.getStudentId()));

        Course course = courseRepository.findById(dto.getCourseId())
                .orElseThrow(() -> new ResourceNotFoundException("Course not found with id: " + dto.getCourseId()));

        Enrollment enrollment = Enrollment.builder()
                .student(student)
                .course(course)
                .build();

        return enrollmentMapper.toResponseDTO(enrollmentRepository.save(enrollment));
    }

    @Override
    public List<EnrollmentDTO.EnrollmentResponseDTO> getEnrollmentsByStudent(Long studentId) {
        return enrollmentRepository.findByStudentId(studentId)
                .stream()
                .map(enrollmentMapper::toResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public List<EnrollmentDTO.EnrollmentResponseDTO> getEnrollmentsByCourse(Long courseId) {
        return enrollmentRepository.findByCourseId(courseId)
                .stream()
                .map(enrollmentMapper::toResponseDTO)
                .collect(Collectors.toList());
    }

    @Override
    public EnrollmentDTO.EnrollmentResponseDTO updateProgress(Long enrollmentId, Double progressPercentage) {
        Enrollment enrollment = enrollmentRepository.findById(enrollmentId)
                .orElseThrow(() -> new ResourceNotFoundException("Enrollment not found with id: " + enrollmentId));

        if (progressPercentage < 0 || progressPercentage > 100) {
            throw new InvalidRequestException("Progress percentage must be between 0 and 100");
        }

        enrollment.setProgressPercentage(progressPercentage);

        if (progressPercentage == 100) {
            enrollment.setStatus(com.learning.cms.entity.EnrollmentStatus.COMPLETED);
        }

        return enrollmentMapper.toResponseDTO(enrollmentRepository.save(enrollment));
    }
}
