package com.polina.spring.springboot.spring_course_springboot_data_rest.repository;


import com.polina.spring.springboot.spring_course_springboot_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    //employee + s
}
