package sks.project.grader.data.model;

import sks.project.grader.data.entity.StudentEntity;

public class Student {

    private Long sid;
    private String netId;
    private String name;
    private String email;

    // Constructors
    public Student() {
        // Default constructor
    }

    public Student(Long sid, String netId, String name, String email) {
        this.sid = sid;
        this.netId = netId;
        this.name = name;
        this.email = email;
    }



    // Getters and setters
    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public String getNetId() {
        return netId;
    }

    public void setNetId(String netId) {
        this.netId = netId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Static method to convert entity to DTO
    public static Student fromEntity(StudentEntity student) {
        return new Student(
                student.getSid(),
                student.getNetId(),
                student.getName(),
                student.getEmail()
        );
    }

    // Override toString method if necessary
    @Override
    public String toString() {
        return "Student{" +
                "id=" + sid +
                ", netId='" + netId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}