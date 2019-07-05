package com.szjz.design_pattern_imooc.design.principle.dependenceInversion;

/**
 * author:szjz
 * date:2019/7/5
 * 高层依赖接口层 不面向实现层
 */
public class Student {

//    private ICourse iCourse;

    public void studentStudyCourse(ICourse iCourse) {
        iCourse.studyCourse();
    }
}
