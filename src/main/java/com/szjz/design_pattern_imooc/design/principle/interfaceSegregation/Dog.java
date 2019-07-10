package com.szjz.design_pattern_imooc.design.principle.interfaceSegregation;


/**
 * author:szjz
 * date:2019/7/8
 * 接口隔离原则
 */
public class Dog implements IEatInterface,ISwimInterface {
    @Override
    public void eat() {
        System.out.println("吃东西");
    }

    @Override
    public void swim() {
        System.out.println("游泳");
    }

}
