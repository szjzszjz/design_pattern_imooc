package com.szjz.design_pattern_imooc.design.creational.singleton.lazy;

/**
 * author:szjz
 * date:2019/7/11
 * <p>
 * 懒汉单例
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    //构造器私有化 防止外部new 对象
    private LazySingleton() {

    }

    //解决多线程下懒汉式单例出现的问题  可用synchronized 修饰  但是synchronized 修饰static锁的是整个类，
    //而且开锁加锁 比较消耗性能
    //所以 能解决问题 但是一般不用
    public synchronized static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
