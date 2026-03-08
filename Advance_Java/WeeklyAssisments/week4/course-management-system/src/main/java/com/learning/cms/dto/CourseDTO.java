package com.learning.cms.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

import java.time.LocalDateTime;

public class CourseDTO {

    @Data
    public static class CourseRequestDTO {
        @NotBlank(message = "Title is required")
        private String title;

        private String description;

        @NotNull(message = "Price is required")
        @Positive(message = "Price must be positive")
        private Double price;

        private Integer duration;

        private String level;

        @NotNull(message = "Instructor ID is required")
        private Long instructorId;
    }

    @Data
    public static class CourseResponseDTO {
        private Long id;
        private String title;
        private String description;
        private Double price;
        private Integer duration;
        private String level;
        private String instructorName;
        private LocalDateTime createdAt;
    }
}
