package com.atguigu.springcloud.alibaba.service;


import com.atguigu.springcloud.entity.CommonResult;
import com.atguigu.springcloud.entity.Payment;
import org.springframework.stereotype.Component;

/**
 * @Author 原野
 * @DATE 2023/7/22 11:52
 * @Description:
 * @Version 1.0
 */
@Component
public class PaymentFallbackService implements PaymentService
{
    @Override
    public CommonResult<Payment> paymentSQL(Long id)
    {
        return new CommonResult<>(44444,
                "服务降级返回,---PaymentFallbackService",
                new Payment(id,"errorSerial"));
    }
}
