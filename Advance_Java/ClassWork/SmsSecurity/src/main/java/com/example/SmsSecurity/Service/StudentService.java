package com.example.SmsSecurity.Service;



import com.example.SmsSecurity.Entity.Student;
import com.example.SmsSecurity.Repository.StudentRepository;
import org.hibernate.query.Page;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;
@Service
public class StudentService {

    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    @PreAuthorize("hasRole('ADMIN')")
    public Student createStudent(Student student) {
        return repo.save(student);
    }

    @Cacheable("students")
    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    public Optional<Student> getStudentById(Long id) {
        return repo.findById(id);
    }

    @PreAuthorize("hasAnyRole('ADMIN','USER')")
    public Page<Student> getAllStudents(Pageable pageable) {
        return repo.findAll(pageable);
    }

    @PreAuthorize("hasRole('ADMIN')")
    public Student updateStudent(Long id, Student updated) {
        return repo.findById(id)
                .map(s -> {
                    s.setName(updated.getName());
                    s.setEmail(updated.getEmail());
                    s.setCourse(updated.getCourse());
                    s.setMarks(updated.getMarks());
                    s.setProfileImage(updated.getProfileImage());
                    s.setAssignmentFile(updated.getAssignmentFile());
                    return repo.save(s);
                })
                .orElseThrow(() -> new RuntimeException("Student not found"));
    }

    @PreAuthorize("hasRole('ADMIN')")
    public void deleteStudent(Long id) {
        repo.deleteById(id);
    }
}