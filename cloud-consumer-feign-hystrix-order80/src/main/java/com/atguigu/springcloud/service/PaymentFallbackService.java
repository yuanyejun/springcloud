package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author 原野
 * @DATE 2023/7/11 15:24
 * @Description:
 * @Version 1.0
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "------ PaymentFallbackService fall back-paymentInfo_OK ,呜呜呜";
    }

    @Override
    public String paymentInfo_TimeOut(Integer id) {
        return "------ PaymentFallbackService fall back- paymentInfo_TimeOut ,呜呜呜";
    }
}
