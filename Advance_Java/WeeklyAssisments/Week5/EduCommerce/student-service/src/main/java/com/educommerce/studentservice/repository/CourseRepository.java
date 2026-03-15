package com.educommerce.studentservice.repository;

import com.educommerce.studentservice.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
