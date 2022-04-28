package com.gcgc.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;

@Entity
public class Shift {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer shiftId;
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="emp_no")
    private List<Employee> employeeList;
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
    public List<Employee> getEmployee() {
        return employeeList;
    }
    public void setEmployee(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    public void addEmployee(Employee employee) {
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
