package com.szjz.design_pattern_imooc.design.behavioral.templateMethod;

/**
 * author:szjz
 * date:2019/7/22
 */
public class PECourse extends ACourse {
    @Override
    void packageCourse() {
        System.out.println("打包图片");
    }

    //在子类中定义钩子方法
    @Override
    protected Boolean needWriteArticle() {
        return true;
    }
}
