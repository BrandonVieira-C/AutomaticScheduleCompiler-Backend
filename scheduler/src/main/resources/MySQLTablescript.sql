DROP DATABASE IF EXISTS scheduler;
CREATE DATABASE scheduler;
use scheduler;

CREATE TABLE Employee (
    emp_no INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(25) NOT NULL,
    last_name VARCHAR(25) NOT NULL,
    hire_date DATE NOT NULL,
    full_time BOOLEAN NOT NULL,
    CONSTRAINT pk_employee PRIMARY KEY (emp_no)
   );

CREATE TABLE PreferredShifts (
    emp_no INT NOT NULL,
    day VARCHAR(25) NOT NULL,
    timeslot VARCHAR(25) NOT NULL,
    pref_level INT NOT NULL,
    shifts_given INT,
    CONSTRAINT fk_employee_shifts FOREIGN KEY (emp_no) REFERENCES Employee(emp_no)
);

CREATE TABLE PreferredTimeslot (
    emp_no INT NOT NULL,
    timeslot VARCHAR(25) NOT NULL,
    pref_level INT NOT NULL,
    CONSTRAINT fk_employee_timeslot FOREIGN KEY (emp_no) REFERENCES Employee(emp_no)
);

CREATE TABLE Shifts (
    shift_id INT NOT NULL AUTO_INCREMENT,
    emp_no INT NOT NULL,
    day VARCHAR(15) NOT NULL,
    timeslot VARCHAR(15) NOT NULL,
    CONSTRAINT pk_shift PRIMARY KEY (shift_id),
    CONSTRAINT fk_shift_employee FOREIGN KEY (emp_no) REFERENCES Employee(emp_no)
);




