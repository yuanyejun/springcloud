package com.atguigu.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.alibaba.myhandler.CustomerBlockHandler;
import com.atguigu.springcloud.entity.CommonResult;
import com.atguigu.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author 原野
 * @DATE 2023/7/22 11:16
 * @Description:
 * @Version 1.0
 */
@RestController
@Slf4j
public class RateLimitController {



    @GetMapping("/byResource")
    @SentinelResource(value = "byResource",blockHandler = "handleException")
    public CommonResult byResource(){

        return new CommonResult(200,"按资源名称限流测试ok",new Payment(2023L,"serial001"));

    }


    public CommonResult handleException(BlockException exception){
        return new CommonResult(444,exception.getClass().getCanonicalName() + "\t" + "服务不可以");
    }

    @GetMapping("/rateLimit/byUrl")
    @SentinelResource(value = "byUrl")
    public CommonResult byUrl(){

        return new CommonResult(200,"按Url限流测试ok",new Payment(2023L,"serial002"));

    }

    @GetMapping("/rateLimit/customerBlockHandler")
    @SentinelResource(value = "customerBlockHandler",
            blockHandlerClass = CustomerBlockHandler.class,
            blockHandler = "handlerException2")
    public CommonResult customerBlockHandler(){

        return new CommonResult(200,"按客户自定义限流测试ok",
                new Payment(2023L,"serial003"));

    }
}
