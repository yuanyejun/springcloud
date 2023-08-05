package com.atguigu.springcloud.controller;

import com.atguigu.springcloud.entity.CommonResult;
import com.atguigu.springcloud.entity.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author 原野
 * @DATE 2023/7/6 20:58
 * @Description:
 * @Version 1.0
 */
@RestController
@Slf4j
public class OrderController {

//    public static final  String PAYMENT_URL = "http://localhost:8001";
    public static final  String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";


    @Resource
    private RestTemplate restTemplate;


    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create/",payment,CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPatment(@PathVariable("id") Long id){
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id,CommonResult.class);
    }

    @GetMapping("/consumer/payment/getentity/{id}")
    public CommonResult<Payment> getPatment2(@PathVariable("id") Long id){

        ResponseEntity<CommonResult> entity = restTemplate
                .getForEntity(PAYMENT_URL + "/payment/get/" + id,CommonResult.class);
        log.info(entity.getStatusCode() + "\t" + entity.getHeaders());
        if (entity.getStatusCode().is2xxSuccessful()){
            return entity.getBody();
        }else {
            return new CommonResult<>(444,"操作失败");
        }
    }

    @GetMapping("/consumer/payment/forentity/create")
    public CommonResult<Payment> create2(Payment payment){

        CommonResult commonResult = restTemplate
                .postForObject(PAYMENT_URL + "/payment/create/", payment, CommonResult.class);

        return commonResult;

    }

    /**
     * zipkin
     * @return
     */
    @GetMapping("/consumer/payment/zipkin")
    public String paymentZipkin(){

        String result = restTemplate.getForObject(PAYMENT_URL +   "/payment/zipkin", String.class);
        return result;

    }

}
