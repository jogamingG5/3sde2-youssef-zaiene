package tn.esprit.studentmanagement.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeController {
    
    @GetMapping("/")
    public Map<String, Object> home() {
        Map<String, Object> response = new HashMap<>();
        response.put("message", "Student Management API is running!");
        response.put("status", "OK");
        
        Map<String, String> endpoints = new HashMap<>();
        endpoints.put("students", "/student/students/getAllStudents");
        endpoints.put("student_by_id", "/student/students/getStudent/{id}");
        endpoints.put("departments", "/student/Depatment/getAllDepartment");
        endpoints.put("enrollments", "/student/Enrollment/getAllEnrollment");
        
        response.put("endpoints", endpoints);
        return response;
    }
}
