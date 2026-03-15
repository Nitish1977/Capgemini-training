package com.bookmydoctor.dto;

import jakarta.validation.constraints.*;
import java.math.BigDecimal;

public class DoctorRequestDTO {

    @NotBlank(message = "Doctor name is required")
    private String doctorName;

    @NotBlank(message = "Specialization is required")
    private String specialization;

    private String hospitalName;

    @Min(value = 0, message = "Experience years must be non-negative")
    private Integer experienceYears;

    @DecimalMin(value = "0.0", inclusive = false, message = "Consultation fee must be positive")
    private BigDecimal consultationFee;

    private String availableDays;
    private String availableTime;

    public DoctorRequestDTO() {}

    public String getDoctorName() { return doctorName; }
    public void setDoctorName(String doctorName) { this.doctorName = doctorName; }
    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }
    public String getHospitalName() { return hospitalName; }
    public void setHospitalName(String hospitalName) { this.hospitalName = hospitalName; }
    public Integer getExperienceYears() { return experienceYears; }
    public void setExperienceYears(Integer experienceYears) { this.experienceYears = experienceYears; }
    public BigDecimal getConsultationFee() { return consultationFee; }
    public void setConsultationFee(BigDecimal consultationFee) { this.consultationFee = consultationFee; }
    public String getAvailableDays() { return availableDays; }
    public void setAvailableDays(String availableDays) { this.availableDays = availableDays; }
    public String getAvailableTime() { return availableTime; }
    public void setAvailableTime(String availableTime) { this.availableTime = availableTime; }
}
