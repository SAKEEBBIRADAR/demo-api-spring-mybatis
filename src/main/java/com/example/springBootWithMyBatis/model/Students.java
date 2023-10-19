package com.example.springBootWithMyBatis.model;

public class Students {
    private Integer studId;
    private String name;
    private String email;

    public Students() {
    }

    public Students(Integer studId, String name, String email) {
        this.studId = studId;
        this.name = name;
        this.email = email;
    }

    public Integer getStudId() {
        return studId;
    }

    public void setStudId(Integer studId) {
        this.studId = studId;
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

    @Override
    public String toString() {
        return "Student{" +
                "studId=" + studId +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
