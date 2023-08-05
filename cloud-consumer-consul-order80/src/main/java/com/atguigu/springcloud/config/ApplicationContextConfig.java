package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author 原野
 * @DATE 2023/7/6 21:00
 * @Description:
 * @Version 1.0
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    @LoadBalanced //赋予resttemplate负载均衡的能力
    public RestTemplate getRestTemplate(){

        return new RestTemplate();

    }
}
