package com.example.restapi.StudentManagemment.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties({"depertment","emailId"})
public class Student {

    private String studentId;
    private String firstName;
    private String lastName;
    private String emailId;
    private String depertment;

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
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

    public String getEmailId() {
        return emailId;
    }

    // @JsonIgnore
    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

   // @JsonIgnore
    public String getDepertment() {
        return depertment;
    }

    public void setDepertment(String depertment) {
        this.depertment = depertment;
    }
}
