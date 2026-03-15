package com.mediconnect.doctorservice.service;

import com.mediconnect.doctorservice.dto.DoctorRequestDTO;
import com.mediconnect.doctorservice.dto.DoctorResponseDTO;
import com.mediconnect.doctorservice.entity.Doctor;
import com.mediconnect.doctorservice.repository.DoctorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class DoctorServiceImpl implements DoctorService {

    private final DoctorRepository doctorRepository;

    @Override
    public DoctorResponseDTO createDoctor(DoctorRequestDTO requestDTO) {
        Doctor doctor = Doctor.builder()
                .name(requestDTO.getName())
                .specialization(requestDTO.getSpecialization())
                .experience(requestDTO.getExperience())
                .hospitalName(requestDTO.getHospitalName())
                .availability(requestDTO.getAvailability())
                .build();

        Doctor saved = doctorRepository.save(doctor);
        return mapToResponse(saved);
    }

    @Override
    public List<DoctorResponseDTO> getAllDoctors() {
        return doctorRepository.findAll()
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public DoctorResponseDTO getDoctorById(Long id) {
        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor not found with id: " + id));
        return mapToResponse(doctor);
    }

    @Override
    public DoctorResponseDTO updateDoctor(Long id, DoctorRequestDTO requestDTO) {
        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor not found with id: " + id));

        doctor.setName(requestDTO.getName());
        doctor.setSpecialization(requestDTO.getSpecialization());
        doctor.setExperience(requestDTO.getExperience());
        doctor.setHospitalName(requestDTO.getHospitalName());
        doctor.setAvailability(requestDTO.getAvailability());

        Doctor updated = doctorRepository.save(doctor);
        return mapToResponse(updated);
    }

    @Override
    public void deleteDoctor(Long id) {
        Doctor doctor = doctorRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Doctor not found with id: " + id));
        doctorRepository.delete(doctor);
    }

    private DoctorResponseDTO mapToResponse(Doctor doctor) {
        return DoctorResponseDTO.builder()
                .doctorId(doctor.getDoctorId())
                .name(doctor.getName())
                .specialization(doctor.getSpecialization())
                .experience(doctor.getExperience())
                .hospitalName(doctor.getHospitalName())
                .availability(doctor.getAvailability())
                .build();
    }
}
