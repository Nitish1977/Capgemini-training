package com.educommerce.attendanceservice.service;

import com.educommerce.attendanceservice.client.StudentClient;
import com.educommerce.attendanceservice.entity.Attendance;
import com.educommerce.attendanceservice.repository.AttendanceRepository;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Slf4j
public class AttendanceService {

    private final AttendanceRepository attendanceRepository;
    private final StudentClient studentClient;

    @CircuitBreaker(name = "studentService", fallbackMethod = "markAttendanceFallback")
    public Attendance markAttendance(Attendance attendance) {
        // Verify student exists via Feign Client
        StudentClient.StudentResponse student = studentClient.getStudentById(attendance.getStudentId());
        log.info("Marking attendance for student: {}", student.getName());
        return attendanceRepository.save(attendance);
    }

    public Attendance markAttendanceFallback(Attendance attendance, Exception ex) {
        log.warn("Circuit breaker triggered for student service. Saving attendance without validation.");
        return attendanceRepository.save(attendance);
    }

    public List<Attendance> getAttendanceByStudent(Long studentId) {
        return attendanceRepository.findByStudentId(studentId);
    }

    public List<Attendance> getAttendanceByCourse(Long courseId) {
        return attendanceRepository.findByCourseId(courseId);
    }

    public Attendance updateAttendance(Long id, Attendance updated) {
        Attendance existing = attendanceRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Attendance record not found: " + id));
        existing.setStatus(updated.getStatus());
        existing.setDate(updated.getDate());
        return attendanceRepository.save(existing);
    }

    public void deleteAttendance(Long id) {
        attendanceRepository.deleteById(id);
    }

    public Map<String, Object> getAttendancePercentage(Long studentId, Long courseId) {
        List<Attendance> records = attendanceRepository.findByStudentIdAndCourseId(studentId, courseId);
        long total = records.size();
        long present = records.stream()
                .filter(a -> a.getStatus() == Attendance.AttendanceStatus.PRESENT)
                .count();
        double percentage = total == 0 ? 0.0 : (present * 100.0 / total);
        return Map.of(
                "studentId", studentId,
                "courseId", courseId,
                "totalClasses", total,
                "attended", present,
                "percentage", String.format("%.2f%%", percentage)
        );
    }
}
