package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entity.CommonResult;
import com.atguigu.springcloud.entity.Payment;
import com.atguigu.springcloud.service.PaymentFeignService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Author 原野
 * @DATE 2023/7/10 17:45
 * @Description:
 * @Version 1.0
 */
@RestController
@Slf4j
public class OrderFeignController {

    @Resource
    private PaymentFeignService paymentFeignService;

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){

        return paymentFeignService.getPaymentById(id);

    }

    @GetMapping("/consumer/payment/feign/timeout")
    public String paymentFeignTimeout(){

        return paymentFeignService.paymentFeignTimeout();

    }




}
