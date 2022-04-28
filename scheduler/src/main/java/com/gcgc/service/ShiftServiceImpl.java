package com.gcgc.service;

import java.util.LinkedList;
import java.util.List;

import com.gcgc.dto.ShiftDTO;
import com.gcgc.entity.Shift;
import com.gcgc.exception.SchedulerException;
import com.gcgc.repository.ShiftRepository;

import org.springframework.beans.factory.annotation.Autowired;

public class ShiftServiceImpl {

    @Autowired
    ShiftRepository shiftRepo;

    public String addShift(ShiftDTO shiftDTO) throws SchedulerException {
        for (Shift a : shiftRepo.findAll()){
            if (a.getDay() == shiftDTO.getDay() && a.getTimeslot() == shiftDTO.getTimeslot()) {
                return "This shift already exists. It requires "+ a.getStaffNeeded()+" staff. Would you like to update this shift?";
            }
        }
        Shift shift = new Shift();
        shift.setDay(shiftDTO.getDay());
        shift.setTimeslot(shiftDTO.getTimeslot());
        shift.setStaffNeeded(shiftDTO.getStaffNeeded());
        shift.setCurrStaffed(0);
        shift = shiftRepo.save(shift);
        String message = "Shift created. "+shift.getDay()+", "+shift.getTimeslot()+", "+ shift.getStaffNeeded()+" staff needed.";
        return message;
    }

    public List<ShiftDTO> getAllShifts() throws SchedulerException {

        List<Shift> shiftEntityList = (List<Shift>) shiftRepo.findAll();
        if (shiftEntityList.isEmpty()) {
            throw new SchedulerException("No shifts were retrieved");
        }
        List<ShiftDTO> shiftDTOList = new LinkedList<>();
        for (Shift shiftEntity : shiftEntityList) {
            ShiftDTO shiftDTO = new ShiftDTO();
            shiftDTO.setDay(shiftEntity.getDay());
            shiftDTO.setTimeslot(shiftEntity.getTimeslot());
            shiftDTO.setStaffNeeded(shiftEntity.getStaffNeeded());
            shiftDTO.setCurrStaffed(shiftEntity.getCurrStaffed());
            shiftDTOList.add(shiftDTO);
        }

        return shiftDTOList;
    }
    
}
