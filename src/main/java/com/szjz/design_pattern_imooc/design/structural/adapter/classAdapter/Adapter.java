package com.szjz.design_pattern_imooc.design.structural.adapter.classAdapter;

/**
 * author:szjz
 * date:2019/7/15
 * 类适配器
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void request() {
        super.adapteeRequest();
    }
}
