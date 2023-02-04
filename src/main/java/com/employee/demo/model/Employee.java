package com.employee.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Employee")

public class Employee {
    @Id
    @GeneratedValue
    @Column(name = "employeeId", nullable = false)
    private int employeeId;
    @Column(name = "employeeName")
    private String employeeName;
    @Column(name = "employeeAdress")
    private String employeeAdress;
    @Column(name = "employeeSalary")
    private int employeeSlary;

    @Column(name = "employeeCity")
    private String employeeCity;

}
