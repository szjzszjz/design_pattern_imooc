package com.szjz.design_pattern_imooc.design.principle.singleResponsibility;

/**
 * author:szjz
 * date:2019/7/5
 */
public class Student {


    public Student(ICourse iCourse) {
        System.out.println(iCourse.getCourseVideo());
        System.out.println(iCourse.getCourseName());
        iCourse.studyCourse();
        iCourse.refundCourse();
        iCourse.exchangeIntegral();
    }
}
