package com.gcgc.dto;

import java.util.List;

public class ShiftDTO {
    private Integer shiftId;
    private List<EmployeeDTO> employeeList;
    private String day;
    private String timeslot;
    private Integer currStaffed;
    private Integer staffNeeded;

    public Integer getCurrStaffed() {
        return currStaffed;
    }
    public void setCurrStaffed(Integer currStaffed) {
        this.currStaffed = currStaffed;
    }
    public Integer getStaffNeeded() {
        return staffNeeded;
    }
    public void setStaffNeeded(Integer staffNeeded) {
        this.staffNeeded = staffNeeded;
    }
    public Integer getShiftId() {
        return shiftId;
    }
    public void setShiftId(Integer shiftId) {
        this.shiftId = shiftId;
    }
    public List<EmployeeDTO> getEmployeeList() {
        return employeeList;
    }
    public void setEmployeeList(List<EmployeeDTO> employeeList) {
        this.employeeList = employeeList;
    }
    public void addEmployee(EmployeeDTO employee) {
        this.employeeList.add(employee);
    }
    public String getDay() {
        return day;
    }
    public void setDay(String day) {
        this.day = day;
    }
    public String getTimeslot() {
        return timeslot;
    }
    public void setTimeslot(String timeslot) {
        this.timeslot = timeslot;
    }

    
}
