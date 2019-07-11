package com.szjz.design_pattern_imooc.design.creational.builder.V2;

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

    public Course(CourseBuilder courseBuilder) {
        this.name = courseBuilder.name;
        this.PPT = courseBuilder.PPT;
        this.article = courseBuilder.article;
        this.video = courseBuilder.video;
        this.QA = courseBuilder.QA;

    }


    /** 静态内部类 */
    public static class CourseBuilder {
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

        //创建链式调用
        public CourseBuilder buildName(String name){
            this.name = name;
            return this;
        }
        public CourseBuilder buildPPT(String PPT){
            this.PPT = PPT;
            return this;
        }
        public CourseBuilder buildVideo(String video){
            this.video = video;
            return this;
        }
        public CourseBuilder buildArticle(String article){
            this.article = article;
            return this;
        }
        public CourseBuilder buildQA(String QA){
            this.QA = QA;
            return this;
        }

        //最终创建课程
        public Course build(){
            return new Course(this);
        }

    }

}
