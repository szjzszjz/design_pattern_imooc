package com.szjz.design_pattern_imooc.design.creational.singleton.lazy;

/**
 * author:szjz
 * date:2019/7/11
 * <p>
 * 懒汉双重检查单例
 */
public class LazyDoubleCheckSingleton {

    //volatile:防止重排序的问题发生
    //正常初始化对象：
    //1、分配内存空间
    //2、初始化对象
    //3、实例指向分配的内存空间
    //重排序之后：
    //1、分配内存空间
    //3、实例指向分配的内存空间
    //2、初始化对象

    private volatile static LazyDoubleCheckSingleton lazySingleton = null;

    //通过设置标记抵御反射攻击  但是通过反射可以修改属性的值 结果依然失败
//    private Boolean flag = true;

    //构造器私有化 防止外部new 对象
    private LazyDoubleCheckSingleton() {
//        if (flag){
//            flag = false;
//        }else {
//            throw new RuntimeException("懒汉式抵御反射攻击");
//        }
        if (lazySingleton != null) {
            throw new RuntimeException("懒汉式抵御反射攻击");
        }

    }


    public static LazyDoubleCheckSingleton getInstance() {
        //拦截第一批除外的的数据，使其后进来的数据不再加锁操作
        if (lazySingleton == null) {
            //对单例对象加锁，在加锁前后各加一次判断
            synchronized (LazyDoubleCheckSingleton.class) {
                //拦截第一批进来的数据，使其不重复创建对象
                if (lazySingleton == null) {
                    lazySingleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazySingleton;
    }


}
