package com.szjz.design_pattern_imooc.design.creational.builder;

import org.springframework.scripting.groovy.GroovyObjectCustomizer;

/**
 * author:szjz
 * date:2019/7/11
 * 课程经理
 */
public class Coach {
    private CourseBuilder courseBuilder;

    public void setCourseBuilder(CourseBuilder courseBuilder) {
        this.courseBuilder = courseBuilder;
    }

    public Course makeCourse(String name,String PPT,String video,String article,String QA){
        courseBuilder.buildName(name);
        courseBuilder.buildPPT(PPT);
        courseBuilder.buildVideo(video);
        courseBuilder.buildArticle(article);
        courseBuilder.buildQA(QA);
        return courseBuilder.makeCourse();
    }
}
