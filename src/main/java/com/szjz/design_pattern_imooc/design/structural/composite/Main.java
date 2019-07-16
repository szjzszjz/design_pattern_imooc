package com.szjz.design_pattern_imooc.design.structural.composite;

/**
 * author:szjz
 * date:2019/7/16
 *
 * 组合模式: 组件之间要有统一的接口或者抽象父类
 */
public class Main {

    public static void main(String[] args) {
        CatalogComponent linuxCourse = new Course("Linux 课程", 11.0);
        CatalogComponent windowsCourse = new Course("windows 课程", 12.0);

        CatalogComponent javaCatalog = new CatalogCourse("java课程目录",2);
        CatalogComponent course1 = new Course("初级知识", 88.0);
        CatalogComponent course2 = new Course("进阶知识", 99.0);
        javaCatalog.add(course1);
        javaCatalog.add(course2);

        CatalogComponent catalogCourse = new CatalogCourse("总目录",1);
        catalogCourse.add(linuxCourse);
        catalogCourse.add(windowsCourse);
        catalogCourse.add(javaCatalog);

        catalogCourse.print();
    }
}
