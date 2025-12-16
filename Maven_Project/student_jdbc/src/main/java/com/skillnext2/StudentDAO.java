package com.skillnext2;

import java.sql.*;
import java.util.*;

class StudentDAO {

    private static final String URL = "jdbc:mysql://localhost:3306/skillnext2_db";
    private static final String USER = "root";
    private static final String PASSWORD = "harini18";

    // Add Student
    public void addStudent(Student stu) throws Exception {
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        String sql = "INSERT INTO student (name, email, course, marks, city) VALUES (?, ?, ?, ?, ?)";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, stu.getName());
        stmt.setString(2, stu.getEmail());
        stmt.setString(3, stu.getCourse());
        stmt.setDouble(4, stu.getMarks());
        stmt.setString(5, stu.getCity());

        stmt.executeUpdate();
        conn.close();
    }

    // Fetch all students
    public List<Student> getAllStudents() throws Exception {
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM student");

        List<Student> list = new ArrayList<>();

        while (rs.next()) {
            Student s = new Student();
            s.setId(rs.getInt("id"));
            s.setName(rs.getString("name"));
            s.setEmail(rs.getString("email"));
            s.setCourse(rs.getString("course"));
            s.setMarks(rs.getDouble("marks"));
            s.setCity(rs.getString("city"));

            list.add(s);
        }

        conn.close();
        return list;
    }

    // Delete student
    public void deleteStudent(int id) throws Exception {
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        String sql = "DELETE FROM student WHERE id=?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.executeUpdate();
        conn.close();
    }

    // Update student
    public void updateStudent(Student stu) throws Exception {
        Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
        String sql = "UPDATE student SET name=?, email=?, course=?, marks=?, city=? WHERE id=?";

        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, stu.getName());
        stmt.setString(2, stu.getEmail());
        stmt.setString(3, stu.getCourse());
        stmt.setDouble(4, stu.getMarks());
        stmt.setString(5, stu.getCity());
        stmt.setInt(6, stu.getId());

        stmt.executeUpdate();
        conn.close();
    }
}