package com.spike.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //将服务注册到eureka服务端
public class DeptProviderRun {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderRun.class, args);
    }
}
