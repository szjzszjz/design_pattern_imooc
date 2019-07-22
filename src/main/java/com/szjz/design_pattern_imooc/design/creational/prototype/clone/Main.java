package com.szjz.design_pattern_imooc.design.creational.prototype.clone;

import com.szjz.design_pattern_imooc.design.creational.singleton.hungry.HungarySingleton;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Date;

/**
 * author:szjz
 * date:2019/7/12
 */
public class Main {

    public static void main(String[] args) throws CloneNotSupportedException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Pig pig = new Pig("佩奇", new Date(0l));
        Pig clonePig = (Pig) pig.clone();


        System.out.println("0" + pig);
        System.out.println("1" + clonePig);

        //不需要重写属性克隆
//        pig.setBirthday(new Date(66666666666666l));
//        pig.setName("哈士奇");

        //需要再实体类内部重写属性clone
        pig.getBirthday().setTime(66666666666666l);
        pig.setName("哈士奇");

        System.out.println("0" + pig);
        System.out.println("1" + clonePig);


        //测试通过反射实现克隆对单例的破坏 前提是单例类实现了Cloneable接口
        //解决办法：1，不实现Cloneable接口 2，对clone方法进行修改
        HungarySingleton instance = HungarySingleton.getInstance();
        Class<?> aClass = Class.forName(HungarySingleton.class.getName());
        Method cloneMethod = aClass.getDeclaredMethod("clone");
        cloneMethod.setAccessible(true);
        HungarySingleton newInstance = (HungarySingleton) cloneMethod.invoke(instance);

        System.out.println(instance);
        System.out.println(newInstance);

    }
}
