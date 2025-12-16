package com.skillnext2;

public class Student {

    private int id;
    private String name;
    private String email;
    private String course;
    private Double marks;
    private String city;

    public Student() {}

    public Student(String name, String email, String course, double marks, String city) {
        this.name = name;
        this.email = email;
        this.course = course;
        this.marks = marks;
        this.city = city;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getCourse() { return course; }
    public void setCourse(String course) { this.course = course; }

    public Double getMarks() { return marks; }
    public void setMarks(Double marks) { this.marks = marks; }

    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }

    @Override
    public String toString() {
        return "Student [id=" + id +
                ", name=" + name +
                ", email=" + email +
                ", course=" + course +
                ", marks=" + marks +
                ", city=" + city + "]";
    }
}