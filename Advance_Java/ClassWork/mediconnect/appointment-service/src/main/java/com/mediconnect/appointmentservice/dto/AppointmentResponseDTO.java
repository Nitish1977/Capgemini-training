package com.mediconnect.appointmentservice.dto;

import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AppointmentResponseDTO {

    private Long appointmentId;
    private String patientName;
    private Long doctorId;
    private LocalDate appointmentDate;
    private String status;
}
