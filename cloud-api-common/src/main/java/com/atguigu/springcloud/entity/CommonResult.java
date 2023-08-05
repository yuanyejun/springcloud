package com.atguigu.springcloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author 原野
 * @DATE 2023/7/6 18:56
 * @Description:
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T>{

    private Integer code;
    private String msg;
    private T data;

    public CommonResult(Integer code,String message){
        this(code,message,null);
    }
}
