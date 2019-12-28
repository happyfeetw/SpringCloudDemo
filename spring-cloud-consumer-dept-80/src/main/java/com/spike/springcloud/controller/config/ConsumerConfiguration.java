package com.spike.springcloud.controller.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 处理来自客户端的请求的配置类
 * 相当于spring中的 ApplicationContext.xml
 * 创建此类的作用是将spring中的RestTemplate对象注册到当前应用的上下文中
 */
@Configuration
public class ConsumerConfiguration {

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
