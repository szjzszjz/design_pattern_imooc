package com.szjz.design_pattern_imooc.design.principle.interfaceSegregation;

import org.omg.CORBA.NO_PERMISSION;

/**
 * author:szjz
 * date:2019/7/8
 */
public class Duck implements IEatInterface,IFlyInterface, ISwimInterface {
    @Override
    public void eat() {
        System.out.println("吃");
    }

    @Override
    public void fly() {
        System.out.println("飞");
    }

    @Override
    public void swim() {
        System.out.println("游");
    }
}
