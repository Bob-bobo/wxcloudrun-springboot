package com.cnrmall.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication(scanBasePackages = {"com.cnrmall.springboot"})
@MapperScan("com.cnrmall.springboot.dao")
public class WxCloudRunApplication {

    public static void main(String[] args) {
        SpringApplication.run(WxCloudRunApplication.class, args);
    }
}
