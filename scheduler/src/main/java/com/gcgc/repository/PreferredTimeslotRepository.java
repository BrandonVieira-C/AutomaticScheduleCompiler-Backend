package com.gcgc.repository;

import java.util.List;

import com.gcgc.entity.PreferredTimeslot;
import com.gcgc.exception.SchedulerException;

import org.springframework.data.jpa.repository.Query;

public interface PreferredTimeslotRepository {

    @Query("select pt.* from PreferredTimeslot pt where pt.empNo = :empNo order by pt.prefLevel")
    public List<PreferredTimeslot> getEmployeesPreferredTimeslotsInOrder(Integer empNo) throws SchedulerException;
    
    
}
