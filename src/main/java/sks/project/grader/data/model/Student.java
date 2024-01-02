package sks.project.grader.data.model;

import sks.project.grader.data.entity.StudentEntity;

public class Student {

    private Long studentID;
    private String netID;
    private String fullName;
    private String email;
    private String dob;  // Format date as a String for response, if needed
    private String gender;
    private String branch;

    // Constructors
    public Student() {
        // Default constructor
    }

    public Student(Long studentID, String netID, String fullName, String email, String dob, String gender, String branch) {
        this.studentID = studentID;
        this.netID = netID;
        this.fullName = fullName;
        this.email = email;
        this.dob = dob;
        this.gender = gender;
        this.branch = branch;
    }

    // Getters and Setters
    public Long getStudentID() {
        return studentID;
    }

    public void setStudentID(Long studentID) {
        this.studentID = studentID;
    }

    public String getNetID() {
        return netID;
    }

    public void setNetID(String netID) {
        this.netID = netID;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    // Optionally, add a method to transform a Student entity to a Student
    public static Student fromStudentEntity(StudentEntity studentEntity) {
        return new Student(
                studentEntity.getStudentID(),
                studentEntity.getNetID(),
                studentEntity.getFullName(),
                studentEntity.getEmail(),
                studentEntity.getDob().toString(), // assuming dob is stored as LocalDate
                studentEntity.getGender(),
                studentEntity.getBranch()
        );
    }
}