package sks.project.grader.data.entity;


import jakarta.persistence.*;

import java.util.Objects;

@Entity
@Table(name = "students")
public class StudentEntity {

    @Id
    private Long sid;

    private String netId;
    private String name;
    private String email;
    // other fields

    // getters and setters
    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
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

    public String getNetId() {
        return netId;
    }

    public void setNetId(String netId) {
        this.netId = netId;
    }

    public StudentEntity() {
    }

    public StudentEntity(Long sid,String netId, String name, String email) {
        this.sid = sid;
        this.netId = netId;
        this.name = name;
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StudentEntity that)) return false;
        return Objects.equals(getSid(), that.getSid()) && Objects.equals(getNetId(), that.getNetId()) && Objects.equals(getName(), that.getName()) && Objects.equals(getEmail(), that.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSid(), getNetId(), getName(), getEmail());
    }

    @Override
    public String toString() {
        return "StudentEntity{" +
                "sid=" + sid +
                ", netId='" + netId + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

