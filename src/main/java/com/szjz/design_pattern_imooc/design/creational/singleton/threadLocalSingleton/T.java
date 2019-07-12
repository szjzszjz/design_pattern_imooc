package com.szjz.design_pattern_imooc.design.creational.singleton.threadLocalSingleton;

/**
 * author:szjz
 * date:2019/7/12
 */
public class T implements Runnable {
    @Override
    public void run() {
        ThreadLocalSingleton instance = ThreadLocalSingleton.getInstance();
        System.err.println(instance);
    }
}
