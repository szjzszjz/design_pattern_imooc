package com.szjz.design_pattern_imooc.design.structural.facade;

import lombok.Data;

/**
 * author:szjz
 * date:2019/7/15
 * 积分礼物
 */

@Data
public class PointsGift {

    /** name */
    private String name;

    public PointsGift(String name) {
        this.name = name;
    }
}
