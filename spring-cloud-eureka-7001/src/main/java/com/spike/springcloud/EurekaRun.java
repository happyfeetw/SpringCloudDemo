package com.spike.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer // 服务端的启动类, 接收client注册进来. 开启eureka服务功能
public class EurekaRun {
    public static void main(String[] args) {
        SpringApplication.run(EurekaRun.class, args);
    }
}