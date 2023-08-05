package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author 原野
 * @DATE 2023/7/6 18:40
 * @Description:
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient //开启eureka的客户端
@EnableDiscoveryClient
public class PaymentMain8001 {

    public static void main(String[] args) {

        SpringApplication.run(PaymentMain8001.class,args);

    }
}
