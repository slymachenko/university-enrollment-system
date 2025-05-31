package com.dnu.edu.ua.app.repositories;

import com.dnu.edu.ua.app.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
