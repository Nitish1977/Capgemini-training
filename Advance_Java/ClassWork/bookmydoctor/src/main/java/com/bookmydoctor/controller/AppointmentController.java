package com.bookmydoctor.controller;

import com.bookmydoctor.dto.*;
import com.bookmydoctor.service.AppointmentService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appointments")
@Tag(name = "Appointment Management", description = "Appointment booking APIs")
@SecurityRequirement(name = "Bearer Authentication")
public class AppointmentController {

    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping
    @Operation(summary = "Book an appointment (User only)")
    public ResponseEntity<ApiResponse<AppointmentResponseDTO>> bookAppointment(
            @Valid @RequestBody AppointmentRequestDTO dto,
            @AuthenticationPrincipal UserDetails userDetails) {
        return ResponseEntity.ok(appointmentService.bookAppointment(dto, userDetails.getUsername()));
    }

    @GetMapping("/my")
    @Operation(summary = "View my appointments (User only)")
    public ResponseEntity<ApiResponse<List<AppointmentResponseDTO>>> getMyAppointments(
            @AuthenticationPrincipal UserDetails userDetails) {
        return ResponseEntity.ok(appointmentService.getMyAppointments(userDetails.getUsername()));
    }

    @DeleteMapping("/{appointmentId}")
    @Operation(summary = "Cancel an appointment (User only)")
    public ResponseEntity<ApiResponse<Void>> cancelAppointment(
            @PathVariable Long appointmentId,
            @AuthenticationPrincipal UserDetails userDetails) {
        return ResponseEntity.ok(appointmentService.cancelAppointment(appointmentId, userDetails.getUsername()));
    }

    @GetMapping
    @Operation(summary = "View all appointments (Admin only)")
    public ResponseEntity<ApiResponse<List<AppointmentResponseDTO>>> getAllAppointments() {
        return ResponseEntity.ok(appointmentService.getAllAppointments());
    }
}
