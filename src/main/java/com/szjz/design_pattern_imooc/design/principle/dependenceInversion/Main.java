package com.szjz.design_pattern_imooc.design.principle.dependenceInversion;

/**
 * author:szjz
 * date:2019/7/5
 */
public class Main {

    public static void main(String[] args) {
        Student student = new Student();
        student.studentStudyCourse(new JavaCourse());
        student.studentStudyCourse(new PythonCourse());
    }
}
