package com.keomagroup.sgs.controllers;

import com.keomagroup.sgs.entities.Employee;
import com.keomagroup.sgs.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> list(){
        return employeeService.listAll();
    }
}
