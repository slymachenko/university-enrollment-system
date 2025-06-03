    package com.dnu.edu.ua.app.controllers;

    import com.dnu.edu.ua.app.entities.Enrollment;
    import com.dnu.edu.ua.app.services.EnrollmentService;
    import lombok.RequiredArgsConstructor;
    import org.springframework.http.ResponseEntity;
    import org.springframework.web.bind.annotation.*;

    import java.util.List;
    import java.util.Optional;

    @RestController
    @RequestMapping("/api/enrollments")
    @RequiredArgsConstructor
    public class EnrollmentRestController {
        private final EnrollmentService enrollmentService;

        @PostMapping
        public ResponseEntity<Enrollment> createEnrollment(@RequestBody Enrollment enrollment) {
            Enrollment savedEnrollment = enrollmentService.createEnrollment(enrollment);
            return ResponseEntity.ok(savedEnrollment);
        }

        @GetMapping("/by-student/{student_id}")
        public ResponseEntity<List<Enrollment>> getEnrollmentsByStudent(@PathVariable Long student_id) {
            List<Enrollment> enrollments = enrollmentService.getEnrollmentsByStudentId(student_id);
            return ResponseEntity.ok(enrollments);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteEnrollment(@PathVariable Long id) {
            Optional<Enrollment> enrollmentOpt = enrollmentService.deleteEnrollment(id);
            return enrollmentOpt.isPresent() ?
                    ResponseEntity.noContent().build() :
                    ResponseEntity.notFound().build();
        }
    }
