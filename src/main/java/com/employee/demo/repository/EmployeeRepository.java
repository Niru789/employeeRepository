package com.employee.demo.repository;

import com.employee.demo.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee,Integer>{
    //JPA Repository also i can take here;

}