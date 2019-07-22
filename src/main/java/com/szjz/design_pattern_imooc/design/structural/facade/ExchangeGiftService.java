package com.szjz.design_pattern_imooc.design.structural.facade;

/**
 * author:szjz
 * date:2019/7/15
 * <p>
 * 礼物兑换系统
 */
public class ExchangeGiftService {

    private QualifyService qualifyService = new QualifyService();

    private PointsPaymentService pointsPaymentService = new PointsPaymentService();

    private ShippingService shippingService = new ShippingService();

    public void exChangeGift(PointsGift gift) {
        //积分可用
        if (qualifyService.isAvailable(gift)) {
            //积分兑换成功
            if (pointsPaymentService.pay(gift)) {
                //返回订单号
                String orderNO = shippingService.shipGift(gift);
                System.out.println(gift.getName() + "的订单号：" + orderNO);
            }
        }
    }


}
