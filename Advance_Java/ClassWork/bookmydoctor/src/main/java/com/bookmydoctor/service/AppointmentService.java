package com.bookmydoctor.service;

import com.bookmydoctor.dto.*;
import com.bookmydoctor.entity.*;
import com.bookmydoctor.entity.Appointment.AppointmentStatus;
import com.bookmydoctor.exception.*;
import com.bookmydoctor.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AppointmentService {

    private final AppointmentRepository appointmentRepository;
    private final DoctorRepository doctorRepository;
    private final UserRepository userRepository;

    public AppointmentService(AppointmentRepository appointmentRepository,
                              DoctorRepository doctorRepository,
                              UserRepository userRepository) {
        this.appointmentRepository = appointmentRepository;
        this.doctorRepository = doctorRepository;
        this.userRepository = userRepository;
    }

    public ApiResponse<AppointmentResponseDTO> bookAppointment(AppointmentRequestDTO dto, String userEmail) {
        User user = userRepository.findByEmail(userEmail)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));
        Doctor doctor = doctorRepository.findById(dto.getDoctorId())
                .orElseThrow(() -> new ResourceNotFoundException("Doctor not found with id: " + dto.getDoctorId()));

        boolean alreadyBooked = appointmentRepository.existsByUserIdAndDoctorIdAndStatus(
                user.getId(), doctor.getId(), AppointmentStatus.BOOKED);
        if (alreadyBooked) {
            throw new BadRequestException("You already have a booked appointment with this doctor");
        }

        Appointment appointment = new Appointment();
        appointment.setUser(user);
        appointment.setDoctor(doctor);
        appointment.setAppointmentDate(dto.getAppointmentDate());
        appointment.setAppointmentTime(dto.getAppointmentTime());
        appointment.setStatus(AppointmentStatus.BOOKED);

        return ApiResponse.success("Appointment booked successfully", mapToResponse(appointmentRepository.save(appointment)));
    }

    public ApiResponse<List<AppointmentResponseDTO>> getMyAppointments(String userEmail) {
        User user = userRepository.findByEmail(userEmail)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));
        List<AppointmentResponseDTO> list = appointmentRepository.findByUserId(user.getId())
                .stream().map(this::mapToResponse).collect(Collectors.toList());
        return ApiResponse.success("Appointments fetched successfully", list);
    }

    public ApiResponse<Void> cancelAppointment(Long appointmentId, String userEmail) {
        User user = userRepository.findByEmail(userEmail)
                .orElseThrow(() -> new ResourceNotFoundException("User not found"));
        Appointment appointment = appointmentRepository.findById(appointmentId)
                .orElseThrow(() -> new ResourceNotFoundException("Appointment not found with id: " + appointmentId));

        if (!appointment.getUser().getId().equals(user.getId())) {
            throw new BadRequestException("You are not authorized to cancel this appointment");
        }
        if (appointment.getStatus() == AppointmentStatus.CANCELLED) {
            throw new BadRequestException("Appointment is already cancelled");
        }

        appointment.setStatus(AppointmentStatus.CANCELLED);
        appointmentRepository.save(appointment);
        return ApiResponse.success("Appointment cancelled successfully", null);
    }

    public ApiResponse<List<AppointmentResponseDTO>> getAllAppointments() {
        List<AppointmentResponseDTO> list = appointmentRepository.findAll()
                .stream().map(this::mapToResponse).collect(Collectors.toList());
        return ApiResponse.success("All appointments fetched successfully", list);
    }

    private AppointmentResponseDTO mapToResponse(Appointment a) {
        AppointmentResponseDTO dto = new AppointmentResponseDTO();
        dto.setId(a.getId());
        dto.setAppointmentDate(a.getAppointmentDate());
        dto.setAppointmentTime(a.getAppointmentTime());
        dto.setStatus(a.getStatus());
        dto.setUserId(a.getUser().getId());
        dto.setUserName(a.getUser().getName());
        dto.setDoctorId(a.getDoctor().getId());
        dto.setDoctorName(a.getDoctor().getDoctorName());
        dto.setSpecialization(a.getDoctor().getSpecialization());
        dto.setCreatedAt(a.getCreatedAt());
        return dto;
    }
}
