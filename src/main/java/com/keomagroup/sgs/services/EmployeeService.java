package com.keomagroup.sgs.services;

import com.keomagroup.sgs.entities.Employee;
import com.keomagroup.sgs.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public List<Employee> listAll(){
        return employeeRepository.findAll();
    }

    public void save(Employee employee){
        employeeRepository.save(employee);
    }

    public Employee get(int id){
        return employeeRepository.findById(id).get();
    }

    public void delete(int id){
        employeeRepository.deleteById(id);
    }
}
