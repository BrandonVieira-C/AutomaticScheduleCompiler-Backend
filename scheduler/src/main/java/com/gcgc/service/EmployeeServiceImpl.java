package com.gcgc.service;

import com.gcgc.dto.EmployeeDTO;
import com.gcgc.entity.Employee;
import com.gcgc.exception.SchedulerException;
import com.gcgc.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceImpl {

    @Autowired
    EmployeeRepository employeeRepo;

    public String addEmployee(EmployeeDTO employeeDto) throws SchedulerException {
        Employee employeeEntity = new Employee();
        employeeEntity.setFirstName(employeeDto.getFirstName());
        employeeEntity.setFullTime(employeeDto.getFullTime());
        employeeEntity.setHireDate(employeeDto.getHireDate());
        employeeEntity.setLastName(employeeDto.getLastName());

        employeeEntity = employeeRepo.save(employeeEntity);
        String message = employeeEntity.getFirstName() + " " + employeeEntity.getLastName() + " has been added. Their employee number is " + employeeEntity.getEmpNo();
        return message;
    }
    
}
