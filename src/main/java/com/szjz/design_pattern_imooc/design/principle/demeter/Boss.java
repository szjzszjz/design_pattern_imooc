package com.szjz.design_pattern_imooc.design.principle.demeter;

/**
 * author:szjz
 * date:2019/7/10
 */
public class Boss {

    public void commandCheckNumber() {
        new TeamLeader().checkNumberOfCourses();
    }
}
