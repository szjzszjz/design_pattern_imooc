package com.szjz.design_pattern_imooc.design.structural.proxy.dynamicProxy;

import com.szjz.design_pattern_imooc.design.structural.proxy.Order;
import com.szjz.design_pattern_imooc.design.structural.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * author:szjz
 * date:2019/7/22
 * 动态代理
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Class<?> aClass = target.getClass();
        return Proxy.newProxyInstance(aClass.getClassLoader(), aClass.getInterfaces(), this::invoke);
    }

    /**
     * @param proxy  代理类
     * @param method 要被增强的方法
     * @param args   被增强的方法参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = args[0];
        beforeMethod(object);
        //result 被调用方法的返回值
        Object result = method.invoke(target, args);
        afterMethod(object);
        return result;
    }

    private void beforeMethod(Object object) {
        System.out.println("动态代理 before code");

        if (object instanceof Order) {
            Order order = (Order) object;
            int dbRouter = order.getUserId() % 2;
            System.out.println("动态代理分配到【db" + dbRouter + "】处理数据");

            //根据userId 的不同将数据分别插入到不同的库中 实现分库的功能
            DataSourceContextHolder.setDBType("db" + dbRouter);

        }
    }

    private void afterMethod(Object object) {
        System.out.println("动态代理 after code");
    }
}
