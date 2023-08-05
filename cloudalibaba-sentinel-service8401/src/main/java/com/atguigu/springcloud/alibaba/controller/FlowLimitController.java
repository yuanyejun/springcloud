package com.atguigu.springcloud.alibaba.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @Author 原野
 * @DATE 2023/7/19 17:10
 * @Description:
 * @Version 1.0
 */
@RestController
@Slf4j
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA(){
        try {
            TimeUnit.MILLISECONDS.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "-----------testA";
    }

    @GetMapping("/testB")
    public String testB(){
        log.info(Thread.currentThread().getName() + "\t" + ".....Testb");
        return "-----------testB";
    }

    @GetMapping("/testD")
    public String testD(){
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        log.info("testd 测试 RT");
        return "-----------testD";
    }

    @GetMapping("/testE")
    public String testE(){
        log.info("testE 测试 异常数");
        int age = 10 / 0;
        return "-----------testE 测试 异常数";
    }

    @GetMapping("/testHotkey")
    @SentinelResource(value = "testHotkey",blockHandler = "deal_testHotkey")
    public String testHotkey(@RequestParam(value = "p1",required = false) String p1,
                             @RequestParam(value = "p2",required = false) String p2){

//        int age = 10 / 0;
        return "-----------testHotkey";
    }

    public String deal_testHotkey(String p1, String p2, BlockException blockException){

        return "-----------testHotkey,呜呜呜"; //默认 Blocked by Sentinel (flow limiting)

    }

}
