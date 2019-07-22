package com.szjz.design_pattern_imooc.design.principle.openClose;

/**
 * author:szjz
 * date:2019/7/5
 * <p>
 * 对原来的类进行扩展
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    /**
     * 原价
     */
    public Double getOriginPrice() {
        return super.getPrice();
    }

    /**
     * 折扣价
     */
    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}
