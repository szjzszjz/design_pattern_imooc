package com.szjz.design_pattern_imooc.design.structural.adapter.objectAdapter;



/**
 * author:szjz
 * date:2019/7/15
 */
public class ConcreteTarget implements Target {

    @Override
    public void request() {
        System.out.println("concrete target");
    }
}
