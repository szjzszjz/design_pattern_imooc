package com.szjz.design_pattern_imooc.design.creational.factoryMethod;

/**
 * author:szjz
 * date:2019/7/10
 */
public class JavaVideoFactory extends VideoFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
