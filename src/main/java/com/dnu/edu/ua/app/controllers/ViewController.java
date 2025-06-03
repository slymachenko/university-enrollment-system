package com.dnu.edu.ua.app.controllers;

import com.dnu.edu.ua.app.services.CourseService;
import com.dnu.edu.ua.app.services.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class ViewController {
    private final StudentService studentService;
    private final CourseService courseService;

    @GetMapping("/")
    public String homePage() {
        return "home";
    }

    @GetMapping("/signup")
    public String signupPage() {
        return "signup";
    }

    @GetMapping("/login")
    public String loginPage() {
        return "login";
    }

    @GetMapping("/students")
    public String studentsPage(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/courses")
    public String coursesPage(Model model) {
        model.addAttribute("courses", courseService.getAllCourses());
        return "courses";
    }
}
