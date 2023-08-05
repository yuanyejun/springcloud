package com.atguigu.springcloud.alibaba;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Author 原野
 * @DATE 2023/7/22 11:52
 * @Description:
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderNacos84 {

    public static void main(String[] args) {

        SpringApplication.run(OrderNacos84.class,args);

    }
}
