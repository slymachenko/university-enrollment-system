package com.dnu.edu.ua.app.repositories;

import com.dnu.edu.ua.app.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
