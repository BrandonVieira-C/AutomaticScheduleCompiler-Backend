package com.gcgc.repository;

import java.util.List;

import com.gcgc.entity.Employee;
import com.gcgc.exception.SchedulerException;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

    @Query("select e.* from Employee e where e.fullTime = 1 group by e.firstName order by e.hireDate asc;")
    public List<Employee> getEmployeesInOrderOfSeniority() throws SchedulerException;

    
}
