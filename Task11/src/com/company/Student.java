package com.company;

import java.util.Iterator;
import java.util.List;

public class Student{
    private String name;
    private int course;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public void printStudents(List<Student> students, Integer course) {
        Iterator<Student> item = students.iterator();
        while (item.hasNext()) {
            Student student = item.next();
            if (student.getCourse() == course) {
                System.out.println(student.getName());
            }
        }
    }

    @Override
    public String toString() {
        return "\nStudent {" +
                "name: " + name +
                ", course: " + course +
                "}";
    }
}