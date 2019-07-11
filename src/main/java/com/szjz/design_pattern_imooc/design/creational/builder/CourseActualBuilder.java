package com.szjz.design_pattern_imooc.design.creational.builder;

/**
 * author:szjz
 * date:2019/7/11
 * 课程真实建造者
 */
public class CourseActualBuilder extends CourseBuilder {

    private Course course = new Course();
    @Override
    public void buildName(String name) {
        this.course.setName(name);
    }

    @Override
    public void buildPPT(String PPT) {
        this.course.setPPT(PPT);
    }

    @Override
    public void buildVideo(String video) {
        this.course.setVideo(video);
    }

    @Override
    public void buildArticle(String article) {
        this.course.setArticle(article);
    }

    @Override
    public void buildQA(String QA) {
        this.course.setQA(QA);
    }

    @Override
    public Course makeCourse(){
        return this.course;
    }
}
