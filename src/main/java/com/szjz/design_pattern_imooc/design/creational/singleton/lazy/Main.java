package com.szjz.design_pattern_imooc.design.creational.singleton.lazy;

/**
 * author:szjz
 * date:2019/7/11
 */
public class Main {

    public static void main(String[] args) {

        Thread thread = new Thread(new T());
        Thread thread1 = new Thread(new T());
        thread.start();
        thread1.start();
        System.err.println("program end");

    }
}
