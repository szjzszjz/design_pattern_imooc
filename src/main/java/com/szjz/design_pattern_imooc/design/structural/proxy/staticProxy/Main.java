package com.szjz.design_pattern_imooc.design.structural.proxy.staticProxy;

import com.szjz.design_pattern_imooc.design.structural.proxy.Order;
import com.szjz.design_pattern_imooc.design.structural.proxy.staticProxy.OrderServiceStaticProxy;

/**
 * author:szjz
 * date:2019/7/22
 * 静态代理测试
 */
public class Main {

    public static void main(String[] args) {
        Order order = new Order();
        order.setUserId(1);

        OrderServiceStaticProxy staticProxy = new OrderServiceStaticProxy();
        staticProxy.saveOrder(order);
    }
}
