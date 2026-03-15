package com.mediconnect.appointmentservice.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "appointments")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Appointment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long appointmentId;

    @Column(nullable = false)
    private String patientName;

    @Column(nullable = false)
    private Long doctorId;

    @Column(nullable = false)
    private LocalDate appointmentDate;

    @Column(nullable = false)
    private String status;
}
