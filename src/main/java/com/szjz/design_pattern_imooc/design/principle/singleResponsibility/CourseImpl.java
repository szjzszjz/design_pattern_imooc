package com.szjz.design_pattern_imooc.design.principle.singleResponsibility;

import org.springframework.stereotype.Service;

/**
 * author:szjz
 * date:2019/7/5
 */

@Service
public class CourseImpl implements ICourseContent, ICourseManager, ICourseIntegral,ICourse {
    @Override
    public String getCourseName() {
        return "课程名称";
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[123];
    }


    @Override
    public void studyCourse() {
        System.out.println("学习课程");
    }

    @Override
    public void refundCourse() {
        System.out.println("管理课程");
    }

    //添加课程积分功能
    @Override
    public void exchangeIntegral() {
        System.out.println("换取课程积分");
    }
}
