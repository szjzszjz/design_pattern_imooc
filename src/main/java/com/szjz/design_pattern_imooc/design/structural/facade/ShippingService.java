package com.szjz.design_pattern_imooc.design.structural.facade;

/**
 * author:szjz
 * date:2019/7/15
 * 物流系统
 */
public class ShippingService {

    public String shipGift(PointsGift gift){
        System.out.println(gift.getName() + "进入物流");
        long shipNo = System.currentTimeMillis();
        return String.valueOf(shipNo);
    }
}
