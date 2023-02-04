package com.employee.demo.controller;

import com.employee.demo.model.Employee;
import com.employee.demo.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class EmployeeController {
    private final EmployeeService service;
    public EmployeeController(EmployeeService service){

        this.service=service;
    }

    @PostMapping("/employeeAdress")
    public Employee addemployeeAdress(@RequestBody Employee employee) {
        return service.save(employee);
    }
   @GetMapping("/employeeAdress/{employeeID}")
    public Employee getemployeeAdress(@PathVariable int employeeID) {

        return service.getemployeeAdress(employeeID);
   }
   @PutMapping("/update employeeAdress")
    public Employee updateemployeeAdress(@RequestBody Employee employee){
        return service.save(employee);

   }
}
