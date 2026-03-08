package com.learning.cms.controllers;

import com.learning.cms.dto.CourseMaterialDTO;
import com.learning.cms.service.CourseMaterialService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/api/materials")
@RequiredArgsConstructor
@Tag(name = "Course Material Management", description = "APIs for uploading and downloading course materials")
public class CourseMaterialController {

    private final CourseMaterialService courseMaterialService;

    @PostMapping("/upload")
    @Operation(summary = "Upload course material")
    public ResponseEntity<CourseMaterialDTO.MaterialResponseDTO> uploadMaterial(
            @RequestParam("title") String title,
            @RequestParam("courseId") Long courseId,
            @RequestParam("file") MultipartFile file) {
        return ResponseEntity.ok(courseMaterialService.uploadMaterial(title, courseId, file));
    }

    @GetMapping("/{id}/download")
    @Operation(summary = "Download course material")
    public ResponseEntity<Resource> downloadMaterial(@PathVariable Long id) {
        Resource resource = courseMaterialService.downloadMaterial(id);
        String fileName = courseMaterialService.getFileNameByMaterialId(id);

        return ResponseEntity.ok()
                .contentType(MediaType.APPLICATION_OCTET_STREAM)
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileName + "\"")
                .body(resource);
    }

    @GetMapping("/course/{courseId}")
    @Operation(summary = "Get all materials for a course")
    public ResponseEntity<List<CourseMaterialDTO.MaterialResponseDTO>> getMaterialsByCourse(
            @PathVariable Long courseId) {
        return ResponseEntity.ok(courseMaterialService.getMaterialsByCourse(courseId));
    }
}
