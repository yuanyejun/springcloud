package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author 原野
 * @DATE 2023/7/7 15:26
 * @Description:
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient //注解用于使用consul或者zookeeper作为注册中心时注册服务
public class PaymentMain8004 {
    public static void main(String[] args) {

        SpringApplication.run(PaymentMain8004.class,args);

    }
}
