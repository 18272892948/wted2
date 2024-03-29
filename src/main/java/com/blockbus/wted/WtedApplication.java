package com.blockbus.wted;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.blockbus.wted.core.user.dao")
@EnableSwagger2
public class WtedApplication {

    public static void main(String[] args) {
        SpringApplication.run(WtedApplication.class, args);
    }

}
