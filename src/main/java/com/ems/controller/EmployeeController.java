package com.ems.controller;

import com.ems.entity.Employee;
import com.ems.service.EmployeeService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // GET all employees (accessible by USER and ADMIN)
    @GetMapping("/api/employees")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    // POST - add employee (only ADMIN)
    @PostMapping("/api/employees")
    @PreAuthorize("hasRole('ADMIN')")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    // DELETE - delete employee (only ADMIN)
    @DeleteMapping("/api/employees/{id}")
    @PreAuthorize("hasRole('ADMIN')")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }

    // ✅ API to get logged-in user role from session
    @GetMapping("/api/session/role")
    public String getUserRole(HttpSession session) {
        Object role = session.getAttribute("role");
        return role != null ? role.toString() : "GUEST";
    }
}
