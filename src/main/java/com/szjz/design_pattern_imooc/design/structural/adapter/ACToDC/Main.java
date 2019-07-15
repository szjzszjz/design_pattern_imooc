package com.szjz.design_pattern_imooc.design.structural.adapter.ACToDC;

/**
 * author:szjz
 * date:2019/7/15
 */
public class Main {

    public static void main(String[] args) {
        int dc5 = new PowerAdapter().outputDC5();
        System.out.println("输出："+dc5+"V的直流电");
    }
}
