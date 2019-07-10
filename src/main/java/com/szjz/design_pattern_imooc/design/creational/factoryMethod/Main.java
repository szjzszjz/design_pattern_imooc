package com.szjz.design_pattern_imooc.design.creational.factoryMethod;


/**
 * author:szjz
 * date:2019/7/5
 * 测试
 */

public class Main {

    public static void main(String[] args) {

        VideoFactory javaVideoFactory = new JavaVideoFactory();
        VideoFactory pythonVideoFactory = new PythonVideoFactory();
        pythonVideoFactory.getVideo().product();
        Video video = javaVideoFactory.getVideo();
        video.product();
    }
}
