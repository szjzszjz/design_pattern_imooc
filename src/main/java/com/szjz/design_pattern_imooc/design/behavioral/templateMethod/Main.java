package com.szjz.design_pattern_imooc.design.behavioral.templateMethod;

/**
 * author:szjz
 * date:2019/7/22
 * 模板方法模式测试
 */
public class Main {

    public static void main(String[] args) {
        DesignPatternCourse designPatternCourse = new DesignPatternCourse(true);
        designPatternCourse.makeCourse();

        PECourse peCourse = new PECourse();
        peCourse.makeCourse();
    }
}
