package com.learning.cms.service.impl;

import com.learning.cms.dto.CourseDTO;
import com.learning.cms.entity.Course;
import com.learning.cms.entity.User;
import com.learning.cms.exception.ResourceNotFoundException;
import com.learning.cms.mapper.CourseMapper;
import com.learning.cms.repository.CourseRepository;
import com.learning.cms.repository.UserRepository;
import com.learning.cms.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CourseServiceImpl implements CourseService {

    private final CourseRepository courseRepository;
    private final UserRepository userRepository;
    private final CourseMapper courseMapper;

    @Override
    @CacheEvict(value = "courses", allEntries = true)
    public CourseDTO.CourseResponseDTO createCourse(CourseDTO.CourseRequestDTO dto) {
        User instructor = userRepository.findById(dto.getInstructorId())
                .orElseThrow(() -> new ResourceNotFoundException("Instructor not found with id: " + dto.getInstructorId()));

        Course course = Course.builder()
                .title(dto.getTitle())
                .description(dto.getDescription())
                .price(dto.getPrice())
                .duration(dto.getDuration())
                .level(dto.getLevel())
                .instructor(instructor)
                .build();

        return courseMapper.toResponseDTO(courseRepository.save(course));
    }

    @Override
    @CacheEvict(value = "courses", allEntries = true)
    public CourseDTO.CourseResponseDTO updateCourse(Long id, CourseDTO.CourseRequestDTO dto) {
        Course course = courseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Course not found with id: " + id));

        course.setTitle(dto.getTitle());
        course.setDescription(dto.getDescription());
        course.setPrice(dto.getPrice());
        course.setDuration(dto.getDuration());
        course.setLevel(dto.getLevel());

        return courseMapper.toResponseDTO(courseRepository.save(course));
    }

    @Override
    @CacheEvict(value = "courses", allEntries = true)
    public void deleteCourse(Long id) {
        if (!courseRepository.existsById(id)) {
            throw new ResourceNotFoundException("Course not found with id: " + id);
        }
        courseRepository.deleteById(id);
    }

    @Override
    @Cacheable("courses")
    public Page<CourseDTO.CourseResponseDTO> getAllCourses(Pageable pageable) {
        return courseRepository.findAll(pageable).map(courseMapper::toResponseDTO);
    }

    @Override
    public CourseDTO.CourseResponseDTO getCourseById(Long id) {
        Course course = courseRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Course not found with id: " + id));
        return courseMapper.toResponseDTO(course);
    }

    @Override
    public List<CourseDTO.CourseResponseDTO> getCoursesByInstructor(Long instructorId) {
        return courseRepository.findByInstructorId(instructorId)
                .stream()
                .map(courseMapper::toResponseDTO)
                .collect(Collectors.toList());
    }
}
