package com.dnu.edu.ua.app.services;

import com.dnu.edu.ua.app.entities.Enrollment;
import com.dnu.edu.ua.app.entities.Student;
import com.dnu.edu.ua.app.repositories.EnrollmentRepository;
import com.dnu.edu.ua.app.repositories.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EnrollmentService {
    private final EnrollmentRepository enrollmentRepository;
    private final StudentRepository studentRepository;

    public Enrollment createEnrollment(Enrollment enrollment) {
        return enrollmentRepository.save(enrollment);
    }

    public List<Enrollment> getEnrollmentsByStudentId(Long student_id) {
        Student student = studentRepository.findById(student_id).orElse(null);
        return enrollmentRepository.findByStudent(student);
    }

    public Optional<Enrollment> deleteEnrollment(Long enrollmentId) {
        Optional<Enrollment> enrollmentOptional = enrollmentRepository.findById(enrollmentId);
        enrollmentOptional.ifPresent(enrollmentRepository::delete);
        return enrollmentOptional;
    }
}
