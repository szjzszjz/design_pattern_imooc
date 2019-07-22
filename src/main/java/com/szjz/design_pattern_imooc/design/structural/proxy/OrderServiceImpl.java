package com.szjz.design_pattern_imooc.design.structural.proxy;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * author:szjz
 * date:2019/7/22
 */
@Service
public class OrderServiceImpl implements IOrderService {


    @Resource
    private IOrderDao iOrderDao = new OrderDaoImpl();

    @Override
    public int saveOrder(Order order) {

        System.out.println("service层调用dao层添加order！");
        return iOrderDao.insert(order);

    }

    @Override
    public int delete(Order order) {
        System.out.println("delete order object!");
        return 1;
    }
}
