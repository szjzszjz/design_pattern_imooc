package com.szjz.design_pattern_imooc.design.creational.singleton.hungry;

import java.io.Serializable;

/**
 * author:szjz
 * date:2019/7/12
 * 饿汉式单例  类初始化的时候变开始创建
 */
public class HungarySingleton implements Serializable, Cloneable {

    private static final HungarySingleton hungarySingleton;

    static {
        hungarySingleton = new HungarySingleton();
    }

    //一般情况下 外界无法调用私有构造器  但是通过反射可以调用
    private HungarySingleton() {
        //类初始化的时候已经创建了单例，反射可用通过调用私有的构造器创建单例实例，此处的判断防止反射调用
        if (hungarySingleton != null) {
            throw new RuntimeException("防止反射攻击");
        }
    }

    public static HungarySingleton getInstance() {
        return hungarySingleton;
    }

    //解决序列化和反序列化对单例的破坏
    private Object readResolve() {
        return hungarySingleton;
    }

    //单例实现了克隆接口 可以利用反射破坏单例
    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.err.println("through reflect clone hungarySingleton object");
//        return super.clone();
        //解决办法 即使通过反射调用clone方法 获取到的依然是原来的实例对象
        return hungarySingleton;
    }
}
