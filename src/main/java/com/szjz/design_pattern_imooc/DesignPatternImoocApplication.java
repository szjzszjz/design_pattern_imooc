package com.szjz.design_pattern_imooc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;

import javax.sql.DataSource;

@SpringBootApplication
public class DesignPatternImoocApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPatternImoocApplication.class, args);
    }

}
