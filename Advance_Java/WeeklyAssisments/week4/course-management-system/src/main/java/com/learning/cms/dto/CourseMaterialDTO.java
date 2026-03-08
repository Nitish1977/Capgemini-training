package com.learning.cms.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDateTime;

public class CourseMaterialDTO {

    @Data
    public static class MaterialResponseDTO {
        private Long id;
        private String title;
        private String fileName;
        private String fileType;
        private String fileUrl;
        private LocalDateTime uploadDate;
    }
}
