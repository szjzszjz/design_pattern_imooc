package com.szjz.design_pattern_imooc.design.creational.singleton.enumSingleton;

/**
 * author:szjz
 * date:2019/7/12
 */
public class Main {

    public static void main(String[] args) {
        EnumSingleton instance = EnumSingleton.getInstance();
        instance.testPrint();
    }
}
