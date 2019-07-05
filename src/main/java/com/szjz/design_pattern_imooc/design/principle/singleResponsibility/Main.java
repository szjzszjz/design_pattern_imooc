package com.szjz.design_pattern_imooc.design.principle.singleResponsibility;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.PostConstruct;
import javax.swing.*;

/**
 * author:szjz
 * date:2019/7/5
 */

public class Main {
    public static void main(String[] args) {
        new Student(new CourseImpl());
    }
}
