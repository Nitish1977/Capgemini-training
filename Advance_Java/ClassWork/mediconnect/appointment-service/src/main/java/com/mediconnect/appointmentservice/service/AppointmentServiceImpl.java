package com.mediconnect.appointmentservice.service;

import com.mediconnect.appointmentservice.dto.AppointmentRequestDTO;
import com.mediconnect.appointmentservice.dto.AppointmentResponseDTO;
import com.mediconnect.appointmentservice.dto.DoctorResponseDTO;
import com.mediconnect.appointmentservice.entity.Appointment;
import com.mediconnect.appointmentservice.feign.DoctorServiceClient;
import com.mediconnect.appointmentservice.repository.AppointmentRepository;
import feign.FeignException;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Slf4j
public class AppointmentServiceImpl implements AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final DoctorServiceClient doctorServiceClient;

    @Override
    public AppointmentResponseDTO createAppointment(AppointmentRequestDTO requestDTO) {
        // Validate doctor exists via Feign Client
        log.info("Validating doctor with id: {}", requestDTO.getDoctorId());
        try {
            DoctorResponseDTO doctor = doctorServiceClient.getDoctorById(requestDTO.getDoctorId());
            log.info("Doctor found: {} from {}", doctor.getName(), doctor.getHospitalName());
        } catch (FeignException.NotFound e) {
            throw new RuntimeException("Doctor not found with id: " + requestDTO.getDoctorId());
        } catch (Exception e) {
            throw new RuntimeException("Failed to validate doctor. Doctor Service may be unavailable. Error: " + e.getMessage());
        }

        Appointment appointment = Appointment.builder()
                .patientName(requestDTO.getPatientName())
                .doctorId(requestDTO.getDoctorId())
                .appointmentDate(requestDTO.getAppointmentDate())
                .status("SCHEDULED")
                .build();

        Appointment saved = appointmentRepository.save(appointment);
        log.info("Appointment created with id: {}", saved.getAppointmentId());
        return mapToResponse(saved);
    }

    @Override
    public List<AppointmentResponseDTO> getAllAppointments() {
        return appointmentRepository.findAll()
                .stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public AppointmentResponseDTO getAppointmentById(Long id) {
        Appointment appointment = appointmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Appointment not found with id: " + id));
        return mapToResponse(appointment);
    }

    @Override
    public void cancelAppointment(Long id) {
        Appointment appointment = appointmentRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Appointment not found with id: " + id));
        appointment.setStatus("CANCELLED");
        appointmentRepository.save(appointment);
        log.info("Appointment cancelled with id: {}", id);
    }

    private AppointmentResponseDTO mapToResponse(Appointment appointment) {
        return AppointmentResponseDTO.builder()
                .appointmentId(appointment.getAppointmentId())
                .patientName(appointment.getPatientName())
                .doctorId(appointment.getDoctorId())
                .appointmentDate(appointment.getAppointmentDate())
                .status(appointment.getStatus())
                .build();
    }
}
