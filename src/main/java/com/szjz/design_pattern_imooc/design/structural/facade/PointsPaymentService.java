package com.szjz.design_pattern_imooc.design.structural.facade;

/**
 * author:szjz
 * date:2019/7/15
 * 积分支付系统
 */
public class PointsPaymentService {

    public Boolean pay(PointsGift gift){
        System.out.println("积分支付"+gift.getName()+"成功!");
        return true;
    }
}
