package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author 原野
 * @DATE 2023/7/6 18:40
 * @Description:
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient //开启eureka的客户端
public class PaymentMain8002 {

    public static void main(String[] args) {

        SpringApplication.run(PaymentMain8002.class,args);

    }
}
