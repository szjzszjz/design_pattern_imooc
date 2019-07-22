package com.szjz.design_pattern_imooc.design.structural.adapter.objectAdapter;


/**
 * author:szjz
 * date:2019/7/15
 * 对象适配器
 */
public class Adapter implements Target {
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        adaptee.adapteeRequest();
    }
}
