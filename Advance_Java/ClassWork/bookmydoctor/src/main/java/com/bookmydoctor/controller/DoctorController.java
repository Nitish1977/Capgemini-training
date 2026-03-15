package com.bookmydoctor.controller;

import com.bookmydoctor.dto.*;
import com.bookmydoctor.service.DoctorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doctors")
@Tag(name = "Doctor Management", description = "Doctor CRUD APIs")
@SecurityRequirement(name = "Bearer Authentication")
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @PostMapping
    @Operation(summary = "Add a new doctor (Admin only)")
    public ResponseEntity<ApiResponse<DoctorResponseDTO>> addDoctor(@Valid @RequestBody DoctorRequestDTO dto) {
        return ResponseEntity.ok(doctorService.addDoctor(dto));
    }

    @PutMapping("/{doctorId}")
    @Operation(summary = "Update doctor details (Admin only)")
    public ResponseEntity<ApiResponse<DoctorResponseDTO>> updateDoctor(
            @PathVariable Long doctorId, @Valid @RequestBody DoctorRequestDTO dto) {
        return ResponseEntity.ok(doctorService.updateDoctor(doctorId, dto));
    }

    @DeleteMapping("/{doctorId}")
    @Operation(summary = "Delete a doctor (Admin only)")
    public ResponseEntity<ApiResponse<Void>> deleteDoctor(@PathVariable Long doctorId) {
        return ResponseEntity.ok(doctorService.deleteDoctor(doctorId));
    }

    @GetMapping
    @Operation(summary = "Get all doctors")
    public ResponseEntity<ApiResponse<List<DoctorResponseDTO>>> getAllDoctors() {
        return ResponseEntity.ok(doctorService.getAllDoctors());
    }

    @GetMapping("/{doctorId}")
    @Operation(summary = "Get doctor by ID")
    public ResponseEntity<ApiResponse<DoctorResponseDTO>> getDoctorById(@PathVariable Long doctorId) {
        return ResponseEntity.ok(doctorService.getDoctorById(doctorId));
    }
}
