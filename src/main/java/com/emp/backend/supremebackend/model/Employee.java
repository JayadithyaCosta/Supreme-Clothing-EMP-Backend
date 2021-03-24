package com.emp.backend.supremebackend.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table
public class Employee {

    @Id
    @SequenceGenerator( name = "employee_sequence",
                        sequenceName = "employee_sequence",
                        allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee_sequence"
    )
    private long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "address")
    private String address;


    @Column(name = "department")
    private String department;

    @Column(name = "email_id")
    private String emailId;

    @Column(name = "start_date")
    private LocalDate startDate;


    public Employee(){

    }

    public Employee(String firstName, String lastName, String address, String department, String emailId, LocalDate startDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.department = department;
        this.emailId = emailId;
        this.startDate = startDate;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setDob(LocalDate startDate) {
        this.startDate = startDate;
    }
}
