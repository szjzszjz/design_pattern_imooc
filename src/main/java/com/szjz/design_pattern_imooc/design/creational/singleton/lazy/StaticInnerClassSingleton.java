package com.szjz.design_pattern_imooc.design.creational.singleton.lazy;

/**
 * author:szjz
 * date:2019/7/11
 * <p>
 * 静态内部类单例
 * 利用class对象的初始化锁，解决多线程下重排序引起的问题
 */
public class StaticInnerClassSingleton {

    //5种类被初始化的情况
    //1、类A被创建
    //2、A类中声明的静态方法被调用
    //3、A类中声明的静态成员被赋值
    //4、A类中声明的静态成员被使用 并且不是常量
    //5、A类是顶级类

    //私有静态内部类
    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.staticInnerClassSingleton;
    }

    //私有化构造函数
    private StaticInnerClassSingleton() {

    }
}
