package com.mediconnect.doctorservice.service;

import com.mediconnect.doctorservice.dto.DoctorRequestDTO;
import com.mediconnect.doctorservice.dto.DoctorResponseDTO;

import java.util.List;

public interface DoctorService {
    DoctorResponseDTO createDoctor(DoctorRequestDTO requestDTO);
    List<DoctorResponseDTO> getAllDoctors();
    DoctorResponseDTO getDoctorById(Long id);
    DoctorResponseDTO updateDoctor(Long id, DoctorRequestDTO requestDTO);
    void deleteDoctor(Long id);
}
