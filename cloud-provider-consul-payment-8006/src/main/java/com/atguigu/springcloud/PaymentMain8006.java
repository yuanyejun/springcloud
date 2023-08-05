package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author 原野
 * @DATE 2023/7/8 1:36
 * @Description:
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain8006 {

    public static void main(String[] args) {

        SpringApplication.run(PaymentMain8006.class,args);

    }
}
