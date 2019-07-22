package com.szjz.design_pattern_imooc.design.structural.facade;

/**
 * author:szjz
 * date:2019/7/15
 */
public class QualifyService {

    public Boolean isAvailable(PointsGift gift) {
        System.out.println("校验" + gift.getName() + "积分资格通过");
        return true;
    }
}
