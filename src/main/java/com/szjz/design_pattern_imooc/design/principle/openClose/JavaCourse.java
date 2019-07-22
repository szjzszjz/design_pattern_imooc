package com.szjz.design_pattern_imooc.design.principle.openClose;

import lombok.Data;
import lombok.Getter;

/**
 * author:szjz
 * date:2019/7/5
 */

@Data
public class JavaCourse implements ICourse {

    /**
     * id
     */
    private Integer id;

    /**
     * name
     */
    private String name;

    /**
     * price
     */
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public JavaCourse() {
    }

    @Override
    public String toString() {
        return "JavaCourse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
