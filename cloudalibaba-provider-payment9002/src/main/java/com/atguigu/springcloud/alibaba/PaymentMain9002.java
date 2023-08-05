package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author 原野
 * @DATE 2023/7/17 17:38
 * @Description:
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class PaymentMain9002 {

    public static void main(String[] args) {

        SpringApplication.run(PaymentMain9002.class,args);

    }
}
