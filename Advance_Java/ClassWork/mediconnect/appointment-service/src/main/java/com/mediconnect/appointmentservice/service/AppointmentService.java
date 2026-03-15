package com.mediconnect.appointmentservice.service;

import com.mediconnect.appointmentservice.dto.AppointmentRequestDTO;
import com.mediconnect.appointmentservice.dto.AppointmentResponseDTO;

import java.util.List;

public interface AppointmentService {
    AppointmentResponseDTO createAppointment(AppointmentRequestDTO requestDTO);
    List<AppointmentResponseDTO> getAllAppointments();
    AppointmentResponseDTO getAppointmentById(Long id);
    void cancelAppointment(Long id);
}
