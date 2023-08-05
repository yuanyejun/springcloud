package com.atguigu.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entity.CommonResult;
import com.atguigu.springcloud.entity.Payment;

/**
 * @Author 原野
 * @DATE 2023/7/22 11:31
 * @Description:
 * @Version 1.0
 */
public class CustomerBlockHandler {


    public static CommonResult handlerException(BlockException exception){
        return new CommonResult(4444,"按客户自定义，global handlerException ",new Payment(2023L,"serial003---------------1"));
    }


    public static CommonResult handlerException2(BlockException exception){
        return new CommonResult(4444,"按客户自定义，global handlerException ",new Payment(2023L,"serial003----------------2"));
    }
}
