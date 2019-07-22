package com.szjz.design_pattern_imooc.design.structural.facade;

/**
 * author:szjz
 * date:2019/7/15
 * <p>
 * 外观模式测试
 */
public class Main {


    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("mac pro ");
        ExchangeGiftService exchangeGiftService = new ExchangeGiftService();
        exchangeGiftService.exChangeGift(pointsGift);
    }
}
