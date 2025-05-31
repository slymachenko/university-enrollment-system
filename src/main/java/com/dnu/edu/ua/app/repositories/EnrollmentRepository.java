package com.dnu.edu.ua.app.repositories;

import com.dnu.edu.ua.app.entities.Enrollment;
import com.dnu.edu.ua.app.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EnrollmentRepository extends JpaRepository<Enrollment, Long> {
    List<Enrollment> findByStudent(Student student);
}
