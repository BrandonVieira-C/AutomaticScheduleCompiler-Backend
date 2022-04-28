package com.gcgc.dto;

import java.time.LocalDate;

public class EmployeeDTO {
    private Integer empNo;
    private String firstName;
    private String lastName;
    private LocalDate hireDate;
    private Boolean fullTime;
    private Integer shiftsGiven = 0;

    public Integer getShiftsGiven() {
        return shiftsGiven;
    }
    public void setShiftsGiven(Integer shiftsGiven) {
        this.shiftsGiven = shiftsGiven;
    }

    public Integer getEmpNo() {
        return empNo;
    }
    public void setEmpNo(Integer empNo) {
        this.empNo = empNo;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getHireDate() {
        return hireDate;
    }
    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }
    public Boolean getFullTime() {
        return fullTime;
    }
    public void setFullTime(Boolean fullTime) {
        this.fullTime = fullTime;
    }

    
    
}
