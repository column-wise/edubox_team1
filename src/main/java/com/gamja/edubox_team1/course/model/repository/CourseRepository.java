package com.gamja.edubox_team1.course.model.repository;

import com.gamja.edubox_team1.course.model.dto.CourseDetailResponseDTO;
import com.gamja.edubox_team1.course.model.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    CourseDetailResponseDTO findCourseDetailById(Long id);
}
