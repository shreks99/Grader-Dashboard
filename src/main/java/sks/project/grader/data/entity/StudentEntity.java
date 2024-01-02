package sks.project.grader.data.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import sks.project.grader.data.model.Student;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.Objects;

@Entity
@Table(name = "students")
public class StudentEntity {

    @Id
    private Long studentID;
    @Column(nullable = false, unique = true)
    private String netID;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false, unique = true)
    private String email;
    // other fields

    @Column(nullable = false)
    private LocalDate dob;
    @Column(nullable = false)
    private String gender;

    @Column(nullable = false)
    private String branch;

    // getters and setters

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

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentEntity that)) return false;
        return Objects.equals(getStudentID(), that.getStudentID()) && Objects.equals(getNetID(), that.getNetID()) && Objects.equals(getFullName(), that.getFullName()) && Objects.equals(getEmail(), that.getEmail()) && Objects.equals(getDob(), that.getDob()) && Objects.equals(getGender(), that.getGender()) && Objects.equals(getBranch(), that.getBranch());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStudentID(), getNetID(), getFullName(), getEmail(), getDob(), getGender(), getBranch());
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "studentID=" + studentID +
                ", netID='" + netID + '\'' +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", gender='" + gender + '\'' +
                ", branch='" + branch + '\'' +
                '}';
    }


    public static StudentEntity fromStudent(Student studentResponse) {
        StudentEntity studentEntity = new StudentEntity();
        studentEntity.setStudentID(studentResponse.getStudentID());
        studentEntity.setNetID(studentResponse.getNetID());
        studentEntity.setFullName(studentResponse.getFullName());
        studentEntity.setEmail(studentResponse.getEmail());

        // Assuming dob is stored as LocalDate in the Student entity
        // Convert the String back to LocalDate. Handle any potential parsing errors.
        try {
            studentEntity.setDob(LocalDate.parse(studentResponse.getDob()));
        } catch (DateTimeParseException e) {
            // Handle the error appropriately
        }

        studentEntity.setGender(studentResponse.getGender());
        studentEntity.setBranch(studentResponse.getBranch());
        return studentEntity;
    }


}

