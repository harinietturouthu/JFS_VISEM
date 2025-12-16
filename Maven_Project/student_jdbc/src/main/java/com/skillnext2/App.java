package com.skillnext2;

import java.util.*;

class App {
    public static void main(String[] args) {
        try {
            StudentDAO dao = new StudentDAO();
            Scanner sc = new Scanner(System.in);

            // ---- USER INPUT SECTION ----
            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Email: ");
            String email = sc.nextLine();

            System.out.print("Enter Course: ");
            String course = sc.nextLine();

            System.out.print("Enter Marks: ");
            Double marks = sc.nextDouble(); 
sc.nextLine();			// keeping marks as String because your Student has String marks

            System.out.print("Enter City: ");
            String city = sc.nextLine();

            // Creating Student object with user input
            Student s1 = new Student(name, email, course, marks, city);

            // Add student to DB
            dao.addStudent(s1);
            System.out.println("Student added successfully!");

            // ---- FETCH AND PRINT ALL STUDENTS ----
            List<Student> students = dao.getAllStudents();
            for (Student s : students) {
                System.out.println(s);
            }

        } catch (Exception s) {
            s.printStackTrace();
        }
    }
}