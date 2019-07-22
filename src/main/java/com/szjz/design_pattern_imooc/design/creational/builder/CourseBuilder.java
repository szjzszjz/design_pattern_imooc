package com.szjz.design_pattern_imooc.design.creational.builder;

/**
 * author:szjz
 * date:2019/7/11
 * 课程创建者
 */
public abstract class CourseBuilder {

    public abstract void buildName(String name);

    public abstract void buildPPT(String PPT);

    public abstract void buildVideo(String video);

    public abstract void buildArticle(String article);

    public abstract void buildQA(String QA);

    public abstract Course makeCourse();


}
