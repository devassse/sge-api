package com.keomagroup.sgs.repositories;

import com.keomagroup.sgs.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {



}
