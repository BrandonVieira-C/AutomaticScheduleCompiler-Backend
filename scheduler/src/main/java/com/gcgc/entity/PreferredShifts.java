package com.gcgc.entity;

import javax.persistence.CascadeType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class PreferredShifts {
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="emp_no")
    private Employee employee;
    private String day;
    private String timeslot;
    private Integer prefLevel;

    public Employee getEmployee() {
        return employee;
    }
    public void setEmployee(Employee employee) {
        this.employee = employee;
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
    public Integer getPrefLevel() {
        return prefLevel;
    }
    public void setPrefLevel(Integer prefLevel) {
        this.prefLevel = prefLevel;
    }
    
    
}
