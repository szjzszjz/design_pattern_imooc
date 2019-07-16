package com.szjz.design_pattern_imooc.design.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * author:szjz
 * date:2019/7/16
 */
public class EmployeeFactory {

    private final static Map<String, Employee> EMPLOYEE_MAP = new HashMap<>();

    public static Employee getManager(String department, String name) {
        //根据部门获取部门经理
        Manager manager = (Manager) EMPLOYEE_MAP.get(department);

        //将部门经理放进map池中，创建一次  下次需要的时候可以直接从池中取
        if (manager == null) {
            manager = new Manager(department);
            manager.setName(name);
            manager.setReportContent(department + "部门汇报。。。。");
            EMPLOYEE_MAP.put(department, manager);
            System.out.println("創建" + department + "部門經理");
        } else {
            manager.setName(name);
        }
        return manager;
    }
}
