package com.gcgc.repository;

import java.util.List;

import com.gcgc.entity.PreferredShifts;
import com.gcgc.exception.SchedulerException;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PreferredShiftsRepository extends CrudRepository<PreferredShifts, Integer> {

    @Query("select ps.* from PreferredShifts ps where ps.empNo = :empNo order by ps.prefLevel")
    public List<PreferredShifts> getEmployeesPreferredShiftsInOrder(Integer empNo) throws SchedulerException;
    
}
