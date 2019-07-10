package com.szjz.design_pattern_imooc.design.creational.abstractFactory;

/**
 * author:szjz
 * date:2019/7/10
 */
public class JavaFactory extends CourseFactory {

    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
