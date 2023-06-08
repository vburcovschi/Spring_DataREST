package com.vburcovschi.spring.springboot.spring_datarest.dao;


import com.vburcovschi.spring.springboot.spring_datarest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
