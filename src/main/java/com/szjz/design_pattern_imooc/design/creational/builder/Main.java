package com.szjz.design_pattern_imooc.design.creational.builder;

/**
 * author:szjz
 * date:2019/7/11
 */
public class Main {

    public static void main(String[] args) {
        Coach coach = new Coach();
        coach.setCourseBuilder(new CourseActualBuilder());
        Course course = coach.makeCourse("java", "java PPT", "java Video", "java article", "QA");
        System.out.println(course);
    }
}
