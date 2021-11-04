package com.company;

import java.util.Comparator;

class StudentNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student st1, Student st2) {
        return st1.getName().compareTo(st2.getName());
    }
}

class StudentCourseComparator implements Comparator<Student> {
    @Override
    public int compare(Student st1, Student st2) {
        if(st1.getCourse()> st2.getCourse())
            return 1;
        else if(st1.getCourse()< st2.getCourse())
            return -1;
        else
            return 0;
    }
}