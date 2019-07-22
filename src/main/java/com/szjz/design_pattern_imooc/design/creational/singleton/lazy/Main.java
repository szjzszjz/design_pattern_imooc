package com.szjz.design_pattern_imooc.design.creational.singleton.lazy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * author:szjz
 * date:2019/7/11
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        /*Thread thread = new Thread(new T());
        Thread thread1 = new Thread(new T());
        thread.start();
        thread1.start();
        System.err.println("program end");*/

        //测试懒汉式抵御反射攻击（调用顺序不一样则结果不一样）

        //LazyDoubleCheckSingleton.getInstance(); 在反射之前调用的时候是可以抵御反射攻击的，如果在其后面则无法抵御反射攻击
        //原因：懒汉式是在用到的时候才创建实例，如果通过反射创建实例在前 则不会将创建的实例赋值成员变量，所以正常调用的时候还会再创建实例
        Class<?> aClass = Class.forName(LazyDoubleCheckSingleton.class.getName());
        Constructor<?> con = aClass.getDeclaredConstructor();
        con.setAccessible(true);
        LazyDoubleCheckSingleton newInstance = (LazyDoubleCheckSingleton) con.newInstance();

        //放在反射调用后面无法抵御反射攻击
        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();

        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance == newInstance);
    }
}
