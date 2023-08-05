package com.atguigu.springcloud.alibaba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author 原野
 * @DATE 2023/7/19 10:16
 * @Description:
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosConfigClientMain3377 {
    public static void main(String[] args) {

        SpringApplication.run(NacosConfigClientMain3377.class,args);

    }
}
