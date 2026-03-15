package com.educommerce.studentservice.service;

import com.educommerce.studentservice.entity.Course;
import com.educommerce.studentservice.entity.Enrollment;
import com.educommerce.studentservice.repository.CourseRepository;
import com.educommerce.studentservice.repository.EnrollmentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;
    private final EnrollmentRepository enrollmentRepository;

    public Course createCourse(Course course) {
        return courseRepository.save(course);
    }

    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    public Course updateCourse(Long id, Course updatedCourse) {
        Course existing = courseRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Course not found: " + id));
        existing.setCourseName(updatedCourse.getCourseName());
        existing.setCourseCode(updatedCourse.getCourseCode());
        existing.setInstructor(updatedCourse.getInstructor());
        existing.setCredits(updatedCourse.getCredits());
        return courseRepository.save(existing);
    }

    public void deleteCourse(Long id) {
        courseRepository.deleteById(id);
    }

    public Enrollment enrollStudent(Long studentId, Long courseId) {
        Enrollment enrollment = Enrollment.builder()
                .studentId(studentId)
                .courseId(courseId)
                .build();
        return enrollmentRepository.save(enrollment);
    }

    public List<Enrollment> getStudentCourses(Long studentId) {
        return enrollmentRepository.findByStudentId(studentId);
    }
}
