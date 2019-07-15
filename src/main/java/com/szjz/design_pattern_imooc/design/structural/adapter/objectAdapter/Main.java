package com.szjz.design_pattern_imooc.design.structural.adapter.objectAdapter;


/**
 * author:szjz
 * date:2019/7/15
 * 通过组合实现适配器模式
 */
public class Main {

    public static void main(String[] args) {
        Target target = new ConcreteTarget();
        target.request();

        //把不匹配的类的方法（Adaptee 的 adapteeRequest()）包装在已有的接口(Target)的实现类(Adapter)的方法(request())中
        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
