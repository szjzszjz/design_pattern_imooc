package com.szjz.design_pattern_imooc.design.principle.dependenceInversion;

/**
 * author:szjz
 * date:2019/7/5
 * <p>
 * 实现层 依赖 接口层
 */
public class JavaCourse implements ICourse {

    /**
     * grade
     */
//    private String grade;
//
//    public JavaCourse() {
//    }
//
//    public JavaCourse(String grade) {
//        this.grade = grade;
//    }

    @Override
    public void studyCourse() {
        System.out.println("学习Java课程");
    }
}
