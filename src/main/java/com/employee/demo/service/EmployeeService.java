package com.employee.demo.service;

import com.employee.demo.model.Employee;
import com.employee.demo.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private final EmployeeRepository repo;

    public EmployeeService(EmployeeRepository repo) {

        this.repo = repo;
    }

    public Employee getemployeeAdress(int employeeID) {

        return repo.findById(employeeID).get();
    }

    public Employee save(Employee employee) {

        return repo.save(employee);
    }
}




