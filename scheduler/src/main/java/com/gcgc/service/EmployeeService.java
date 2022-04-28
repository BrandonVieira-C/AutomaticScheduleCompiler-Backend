package com.gcgc.service;

import com.gcgc.dto.EmployeeDTO;
import com.gcgc.exception.SchedulerException;

public interface EmployeeService {

    public String addEmployee(EmployeeDTO employee) throws SchedulerException;
    public String updateEmployee(EmployeeDTO employee) throws SchedulerException;
    public EmployeeDTO getEmployee(Integer empNo) throws SchedulerException;
    
}
