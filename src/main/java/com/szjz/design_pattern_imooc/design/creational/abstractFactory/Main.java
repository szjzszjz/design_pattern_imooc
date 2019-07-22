package com.szjz.design_pattern_imooc.design.creational.abstractFactory;

/**
 * author:szjz
 * date:2019/7/10
 */
public class Main {

    public static void main(String[] args) {
        CourseFactory pythonFactory = new PythonFactory();
        pythonFactory.getArticle().product();
        pythonFactory.getVideo().product();

        CourseFactory javaFactory = new JavaFactory();
        javaFactory.getArticle().product();
        javaFactory.getVideo().product();
    }
}
