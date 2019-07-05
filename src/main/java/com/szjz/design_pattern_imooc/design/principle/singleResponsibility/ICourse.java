package com.szjz.design_pattern_imooc.design.principle.singleResponsibility;


/**
 * author:szjz
 * date:2019/7/5
 * 继承内容和管理两个接口  两个接口分别有着不同的职责
 */


public interface ICourse extends ICourseContent,ICourseManager,ICourseIntegral{

}
