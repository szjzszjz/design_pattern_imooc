package com.szjz.design_pattern_imooc.design.creational.singleton.threadLocalSingleton;

/**
 * author:szjz
 * date:2019/7/12
 * 线程单例模式  多线程的情况下 每个线程持有一个唯一的单例
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalSingletonThreadLocal
            = ThreadLocal.withInitial(() -> new ThreadLocalSingleton());

    private ThreadLocalSingleton(){

    }

    public static ThreadLocalSingleton getInstance(){
        return threadLocalSingletonThreadLocal.get();
    }
}
