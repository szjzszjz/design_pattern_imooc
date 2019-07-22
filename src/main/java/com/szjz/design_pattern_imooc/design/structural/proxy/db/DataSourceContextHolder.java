package com.szjz.design_pattern_imooc.design.structural.proxy.db;

import org.springframework.stereotype.Component;

/**
 * author:szjz
 * date:2019/7/22
 */
@Component
public class DataSourceContextHolder {
    private static final ThreadLocal<String> CONTEXT_HOLDER  = new ThreadLocal<>();

    public static void setDBType(String dbType){
        CONTEXT_HOLDER.set(dbType);
    }

    public static String getDBType(){
        return CONTEXT_HOLDER.get();
    }

    public static void clearDBType(){
        CONTEXT_HOLDER.remove();
    }
}
