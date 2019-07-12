package com.szjz.design_pattern_imooc.design.creational.prototype.clone;

import lombok.Data;

import java.util.Date;

/**
 * author:szjz
 * date:2019/7/12
 */

@Data
public class Pig implements Cloneable{
    
    /** name */
    private String name;
    
    /** birthday */
    private Date birthday;

    
    public Pig(String name, Date birthday) {
        System.out.println("construct pig object");
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}'+ super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //对属性进行深克隆
        System.out.println("clone pig object");
        Pig pig = (Pig) super.clone();
        pig.birthday = (Date) pig.birthday.clone();
        return pig;
    }
}
