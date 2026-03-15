package com.mediconnect.appointmentservice.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DoctorResponseDTO {

    private Long doctorId;
    private String name;
    private String specialization;
    private Integer experience;
    private String hospitalName;
    private String availability;
}
