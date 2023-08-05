package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author 原野
 * @DATE 2023/7/7 11:04
 * @Description:
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer //开启eureka的服务注册中心
public class EurekaMain7001 {

    public static void main(String[] args) {

        SpringApplication.run(EurekaMain7001.class,args);

    }
}
