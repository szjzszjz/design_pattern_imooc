package com.szjz.design_pattern_imooc.design.creational.builder;

import lombok.Data;

/**
 * author:szjz
 * date:2019/7/11
 */

@Data
public class Course {

    /**
     * name
     */
    private String name;

    /**
     * ppt
     */
    private String PPT;

    /**
     * video
     */
    private String video;

    /**
     * article
     */
    private String article;

    /**
     * question && answer
     */
    private String QA;


}
