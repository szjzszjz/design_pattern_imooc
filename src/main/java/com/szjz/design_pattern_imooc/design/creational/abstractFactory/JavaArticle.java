package com.szjz.design_pattern_imooc.design.creational.abstractFactory;

import javax.swing.tree.TreeNode;
import java.util.PriorityQueue;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * author:szjz
 * date:2019/7/10
 */
public class JavaArticle extends Article {

    @Override
    public void product() {
        System.out.println("编写java手记");
    }
}
