package com.szjz.design_pattern_imooc.design.structural.adapter.ACToDC;

/**
 * author:szjz
 * date:2019/7/15
 */
public class PowerAdapter extends AC220 implements DC5 {


    @Override
    public int outputDC5() {
        int ac = super.inputAC();

        //将220V的交流电转为5V的直流电
        int dc = ac/44;
        System.out.println("将"+ac+"V的交流电转为 "+dc+"V的直流电");
        return dc;
    }
}
