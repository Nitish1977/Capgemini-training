package com.bookmydoctor.service;

import com.bookmydoctor.dto.*;
import com.bookmydoctor.entity.Doctor;
import com.bookmydoctor.exception.ResourceNotFoundException;
import com.bookmydoctor.repository.DoctorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class DoctorService {

    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public ApiResponse<DoctorResponseDTO> addDoctor(DoctorRequestDTO dto) {
        Doctor doctor = new Doctor();
        doctor.setDoctorName(dto.getDoctorName());
        doctor.setSpecialization(dto.getSpecialization());
        doctor.setHospitalName(dto.getHospitalName());
        doctor.setExperienceYears(dto.getExperienceYears());
        doctor.setConsultationFee(dto.getConsultationFee());
        doctor.setAvailableDays(dto.getAvailableDays());
        doctor.setAvailableTime(dto.getAvailableTime());

        return ApiResponse.success("Doctor added successfully", mapToResponse(doctorRepository.save(doctor)));
    }

    public ApiResponse<DoctorResponseDTO> updateDoctor(Long doctorId, DoctorRequestDTO dto) {
        Doctor doctor = doctorRepository.findById(doctorId)
                .orElseThrow(() -> new ResourceNotFoundException("Doctor not found with id: " + doctorId));

        doctor.setDoctorName(dto.getDoctorName());
        doctor.setSpecialization(dto.getSpecialization());
        doctor.setHospitalName(dto.getHospitalName());
        doctor.setExperienceYears(dto.getExperienceYears());
        doctor.setConsultationFee(dto.getConsultationFee());
        doctor.setAvailableDays(dto.getAvailableDays());
        doctor.setAvailableTime(dto.getAvailableTime());

        return ApiResponse.success("Doctor updated successfully", mapToResponse(doctorRepository.save(doctor)));
    }

    public ApiResponse<Void> deleteDoctor(Long doctorId) {
        Doctor doctor = doctorRepository.findById(doctorId)
                .orElseThrow(() -> new ResourceNotFoundException("Doctor not found with id: " + doctorId));
        doctorRepository.delete(doctor);
        return ApiResponse.success("Doctor deleted successfully", null);
    }

    public ApiResponse<List<DoctorResponseDTO>> getAllDoctors() {
        List<DoctorResponseDTO> doctors = doctorRepository.findAll()
                .stream().map(this::mapToResponse).collect(Collectors.toList());
        return ApiResponse.success("Doctors fetched successfully", doctors);
    }

    public ApiResponse<DoctorResponseDTO> getDoctorById(Long doctorId) {
        Doctor doctor = doctorRepository.findById(doctorId)
                .orElseThrow(() -> new ResourceNotFoundException("Doctor not found with id: " + doctorId));
        return ApiResponse.success("Doctor fetched successfully", mapToResponse(doctor));
    }

    private DoctorResponseDTO mapToResponse(Doctor doctor) {
        DoctorResponseDTO dto = new DoctorResponseDTO();
        dto.setId(doctor.getId());
        dto.setDoctorName(doctor.getDoctorName());
        dto.setSpecialization(doctor.getSpecialization());
        dto.setHospitalName(doctor.getHospitalName());
        dto.setExperienceYears(doctor.getExperienceYears());
        dto.setConsultationFee(doctor.getConsultationFee());
        dto.setAvailableDays(doctor.getAvailableDays());
        dto.setAvailableTime(doctor.getAvailableTime());
        dto.setCreatedAt(doctor.getCreatedAt());
        return dto;
    }
}
