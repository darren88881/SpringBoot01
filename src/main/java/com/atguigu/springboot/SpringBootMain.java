package com.atguigu.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author darren
 * @create 2020-11-22 13:19
 */
@SpringBootApplication
@MapperScan(basePackages = "com.atguigu.springboot.mapper")
public class SpringBootMain {

    public static void main(String[] args){
        SpringApplication.run(SpringBootMain.class,args);
    }
}
