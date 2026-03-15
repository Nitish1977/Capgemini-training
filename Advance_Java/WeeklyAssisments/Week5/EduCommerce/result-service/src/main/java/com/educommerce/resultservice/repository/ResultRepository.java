package com.educommerce.resultservice.repository;

import com.educommerce.resultservice.entity.Result;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ResultRepository extends JpaRepository<Result, Long> {
    List<Result> findByStudentId(Long studentId);
    List<Result> findByCourseId(Long courseId);
}
