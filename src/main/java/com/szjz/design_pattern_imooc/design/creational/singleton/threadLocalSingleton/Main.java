package com.szjz.design_pattern_imooc.design.creational.singleton.threadLocalSingleton;

/**
 * author:szjz
 * date:2019/7/12
 */
public class Main {
    public static void main(String[] args) {

        //主线程 同一个线程下的实例是一样的
        //多线程为每个线程提供一个单例
        System.err.println(ThreadLocalSingleton.getInstance());
        System.err.println(ThreadLocalSingleton.getInstance());
        System.err.println(ThreadLocalSingleton.getInstance());
        System.err.println(ThreadLocalSingleton.getInstance());

        Thread thread = new Thread(new T());
        Thread thread1 = new Thread(new T());
        thread.start();
        thread1.start();

    }
}
