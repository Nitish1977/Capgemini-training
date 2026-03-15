package com.bookmydoctor.repository;

import com.bookmydoctor.entity.Appointment;
import com.bookmydoctor.entity.Appointment.AppointmentStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {
    List<Appointment> findByUserId(Long userId);
    List<Appointment> findByDoctorId(Long doctorId);
    List<Appointment> findByUserIdAndStatus(Long userId, AppointmentStatus status);
    boolean existsByUserIdAndDoctorIdAndStatus(Long userId, Long doctorId, AppointmentStatus status);
}
