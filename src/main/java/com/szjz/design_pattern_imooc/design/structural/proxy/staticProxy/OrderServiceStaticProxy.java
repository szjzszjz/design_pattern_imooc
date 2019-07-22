package com.szjz.design_pattern_imooc.design.structural.proxy.staticProxy;

import com.szjz.design_pattern_imooc.design.structural.proxy.IOrderService;
import com.szjz.design_pattern_imooc.design.structural.proxy.Order;
import com.szjz.design_pattern_imooc.design.structural.proxy.OrderServiceImpl;
import com.szjz.design_pattern_imooc.design.structural.proxy.db.DataSourceContextHolder;

/**
 * author:szjz
 * date:2019/7/22
 * 订单服务静态代理 ，对原服务进行增强
 */

public class OrderServiceStaticProxy {


    private IOrderService iOrderService  = new OrderServiceImpl();

    public int saveOrder(Order order) {
        beforeMethod(order);

        int result = iOrderService.saveOrder(order);

        afterMethod();

        return result;
    }

    //在保存数据之前 选择数据库 对原方法进行增强
    private void beforeMethod(Order order) {
        int dbRouter = order.getUserId() % 2;
        System.out.println("静态代理分配到【db"+dbRouter+"】处理数据");

        //根据userId 的不同将数据分别插入到不同的库中 实现分库的功能
        DataSourceContextHolder.setDBType("db"+dbRouter);
        System.out.println("静态代理 before code");
    }

    private void afterMethod() {
        System.out.println("静态代理 after code");
    }



}
