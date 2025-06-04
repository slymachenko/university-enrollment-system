# University Enrollment System

## Overview
A web application for managing student enrollments and user authentication, built with Spring Boot. Users can register, log in, and access protected routes, with support for both session-based web authentication and JWT-based API authentication.
Project is available at the following [Link](https://university-enrollment-system-g36u.onrender.com)

## Description
The system allows users to manage university enrollments. It includes:
- Public Routes:
    - /: Home page
    - /auth: Login and signup page
- Protected Routes:
    - /profile: User profile (requires login)
    - /courses: List of all courses (requires login)
    - /students: List of all students (requires login)
- Logout: /logout (ends session)

API routes:
- Public Routes:
  - /api/auth/register: API user registration
  - /api/auth/login: API user login
- Protected Routes:
  - /api/students: Create/Get All students
  - /api/students/{id}: Get Student by ID
  - /api/courses: Create/Get All courses
  - /api/courses/{id}: Get Course by ID
  - /api/enrollments: Create enrollment
  - /api/enrollments/by-student/{id}: Get enrollments by student ID
  - /api/enrollments/{ID}: Delete enrollment by ID 

## Setup
1. Clone the repository.
2. Configure PostgreSQL in application.properties.
3. Run mvn spring-boot:run.
4. Access at http://localhost:8081.

## Technologies
- Backend: Spring Boot, Spring Security, Spring Data JPA
- Frontend: Thymeleaf, HTML, Bootstrap
- Database: PostgreSQL
- Authentication: JWT (API), BCrypt (password hashing)
- Build Tool: Maven

## Implemented Features
- User registration and login (web and API)
- Automatic login after signup
- Session-based web authentication
- JWT-based API authentication
- Database persistence for users
- Basic enrollment management (students, courses)