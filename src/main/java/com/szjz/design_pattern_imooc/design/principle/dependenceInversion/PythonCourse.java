package com.szjz.design_pattern_imooc.design.principle.dependenceInversion;

/**
 * author:szjz
 * date:2019/7/5
 */
public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学习Python 课程");
    }
}
