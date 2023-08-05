package com.atguigu.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author 原野
 * @DATE 2023/7/7 16:11
 * @Description:
 * @Version 1.0
 */
@RestController
@Slf4j
public class OrderZkController {


    @Resource
    private RestTemplate restTemplate;

    public static final String INVOKE_URL="http://cloud-provider-payment";

    @GetMapping("/consumer/payment/zk")
    public String paymentInfo(){
        String result = restTemplate.getForObject(INVOKE_URL + "/payment/zk",String.class);

        return  result;
    }

}
