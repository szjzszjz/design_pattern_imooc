package com.szjz.design_pattern_imooc.design.behavioral.templateMethod;

/**
 * author:szjz
 * date:2019/7/22
 */
public abstract class ACourse {

    protected final void makeCourse(){
        makePPT();
        makeVideo();
        if (needWriteArticle()){
            writeArticle();
        }
        packageCourse();

    }

    final void makePPT(){
        System.out.println("制作PPT");
    }

    final void makeVideo(){
        System.out.println("制作视频");
    }

    final void writeArticle(){
        System.err.println("编写手记");
    }

    //钩子方法可以留给子类实现
    protected Boolean needWriteArticle(){
        return false;
    }

    //完全留给子类去实现
    abstract void packageCourse();
}

