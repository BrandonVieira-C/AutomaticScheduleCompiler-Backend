package com.gcgc.service;

import java.util.List;

import com.gcgc.dto.ShiftDTO;
import com.gcgc.exception.SchedulerException;

public interface ShiftService {

    public String addShift(ShiftDTO shiftDTO) throws SchedulerException;

    public List<ShiftDTO> getAllShifts() throws SchedulerException;

    
}
