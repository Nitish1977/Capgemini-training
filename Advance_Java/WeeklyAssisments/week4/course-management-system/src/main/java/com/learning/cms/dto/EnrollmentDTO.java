package com.learning.cms.dto;

import com.learning.cms.entity.EnrollmentStatus;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

public class EnrollmentDTO {

    @Data
    public static class EnrollmentRequestDTO {
        @NotNull(message = "Course ID is required")
        private Long courseId;

        @NotNull(message = "Student ID is required")
        private Long studentId;
    }

    @Data
    public static class EnrollmentResponseDTO {
        private Long id;
        private String courseTitle;
        private String studentName;
        private EnrollmentStatus status;
        private Double progressPercentage;
        private LocalDateTime enrollmentDate;
    }

    @Data
    public static class UpdateProgressDTO {
        @NotNull(message = "Progress is required")
        private Double progressPercentage;
    }
}
