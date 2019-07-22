package com.szjz.design_pattern_imooc.design.structural.proxy.dynamicProxy;

import com.szjz.design_pattern_imooc.design.structural.proxy.IOrderService;
import com.szjz.design_pattern_imooc.design.structural.proxy.Order;
import com.szjz.design_pattern_imooc.design.structural.proxy.OrderServiceImpl;
import com.szjz.design_pattern_imooc.design.structural.proxy.staticProxy.OrderServiceStaticProxy;

/**
 * author:szjz
 * date:2019/7/22
 * 动态代理测试
 */
public class Main {
    public static void main(String[] args) {

        Order order = new Order();
        order.setUserId(4);

        IOrderService dynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        dynamicProxy.saveOrder(order);
        dynamicProxy.delete(order);
    }
}
