package com.szjz.design_pattern_imooc.design.structural.proxy;

import org.springframework.stereotype.Repository;

/**
 * author:szjz
 * date:2019/7/22
 */

@Repository
public class OrderDaoImpl implements IOrderDao {
    @Override
    public int insert(Order order) {

        System.out.println("dao层添加order成功！");
        return 1;
    }
}
