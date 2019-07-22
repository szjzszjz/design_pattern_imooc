package com.szjz.design_pattern_imooc.design.behavioral.templateMethod;

/**
 * author:szjz
 * date:2019/7/22
 */
public class DesignPatternCourse extends ACourse {

    private Boolean needPageAgeCourse = false;

    //通过构造方法对外暴露钩子方法
    public DesignPatternCourse(Boolean needPageAgeCourse) {
        this.needPageAgeCourse = needPageAgeCourse;
    }

    @Override
    void packageCourse() {
        System.out.println("打包源码");
    }

    @Override
    protected Boolean needWriteArticle() {
        return needPageAgeCourse;
    }
}
