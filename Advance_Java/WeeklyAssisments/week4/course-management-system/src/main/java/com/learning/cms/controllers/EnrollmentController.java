package com.learning.cms.controllers;

import com.learning.cms.dto.EnrollmentDTO;
import com.learning.cms.service.EnrollmentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/enrollments")
@RequiredArgsConstructor
@Tag(name = "Enrollment Management", description = "APIs for managing student enrollments")
public class EnrollmentController {

    private final EnrollmentService enrollmentService;

    @PostMapping
    @Operation(summary = "Enroll a student in a course")
    public ResponseEntity<EnrollmentDTO.EnrollmentResponseDTO> enrollStudent(
            @Valid @RequestBody EnrollmentDTO.EnrollmentRequestDTO dto) {
        return ResponseEntity.status(HttpStatus.CREATED).body(enrollmentService.enrollStudent(dto));
    }

    @GetMapping("/student/{studentId}")
    @Operation(summary = "Get all enrollments for a student")
    public ResponseEntity<List<EnrollmentDTO.EnrollmentResponseDTO>> getEnrollmentsByStudent(
            @PathVariable Long studentId) {
        return ResponseEntity.ok(enrollmentService.getEnrollmentsByStudent(studentId));
    }

    @GetMapping("/course/{courseId}")
    @Operation(summary = "Get all enrollments for a course")
    public ResponseEntity<List<EnrollmentDTO.EnrollmentResponseDTO>> getEnrollmentsByCourse(
            @PathVariable Long courseId) {
        return ResponseEntity.ok(enrollmentService.getEnrollmentsByCourse(courseId));
    }

    @PatchMapping("/{enrollmentId}/progress")
    @Operation(summary = "Update enrollment progress")
    public ResponseEntity<EnrollmentDTO.EnrollmentResponseDTO> updateProgress(
            @PathVariable Long enrollmentId,
            @Valid @RequestBody EnrollmentDTO.UpdateProgressDTO dto) {
        return ResponseEntity.ok(enrollmentService.updateProgress(enrollmentId, dto.getProgressPercentage()));
    }
}
