package com.szjz.design_pattern_imooc.design.structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * author:szjz
 * date:2019/7/16
 */
public class CatalogCourse extends CatalogComponent {

    /**
     * name
     */
    private String name;

    /**
     * level
     */
    private Integer level;

    List<CatalogComponent> items = new ArrayList<>();

    public CatalogCourse(String name,Integer level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(CatalogComponent catalogComponent) {
        items.add(catalogComponent);
    }

    @Override
    public void remove(CatalogComponent catalogComponent) {
        items.remove(catalogComponent);
    }

    @Override
    public void print() {
        System.out.println(this.name);

        for (CatalogComponent catalogComponent : items) {
            if (this.level != null) {
                for (int i = 0; i < level; i++) {
                    System.out.print("--");
                }
            }
            catalogComponent.print();
        }
    }
}
