package com.ericpractice.springbootcrud02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBootCrud02Application class
 *
 * @author lighao
 * @date 2019/06/25
 */

@MapperScan(value = "com.ericpractice.springbootcrud02.Dao")
@SpringBootApplication
public class SpringBootCrud02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootCrud02Application.class, args);
    }
}
