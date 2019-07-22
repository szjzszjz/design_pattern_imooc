package com.szjz.design_pattern_imooc.design.structural.flyweight;

/**
 * author:szjz
 * date:2019/7/16
 * 享元对象  ：共享对象
 */
public class Manager implements Employee {

    /**
     * 内部状态 title
     */
    private String title = "2018年度总结大会";

    /**
     * reportContent
     */
    private String reportContent;

    /**
     * 外部状态 department
     */
    private String department;

    /**
     * 外部状态 name
     */
    private String name;

    @Override
    public void report() {
        System.out.println(name + "的汇报标题：" + title + "   内容:" + reportContent);
    }

    public Manager(String department) {
        this.department = department;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public void setName(String name) {
        this.name = name;
    }
}
