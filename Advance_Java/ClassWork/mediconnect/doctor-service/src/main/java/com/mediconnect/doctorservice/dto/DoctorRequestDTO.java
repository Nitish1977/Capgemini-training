package com.mediconnect.doctorservice.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DoctorRequestDTO {

    @NotBlank(message = "Name is required")
    private String name;

    @NotBlank(message = "Specialization is required")
    private String specialization;

    @NotNull(message = "Experience is required")
    @Positive(message = "Experience must be positive")
    private Integer experience;

    @NotBlank(message = "Hospital name is required")
    private String hospitalName;

    @NotBlank(message = "Availability is required")
    private String availability;
}
