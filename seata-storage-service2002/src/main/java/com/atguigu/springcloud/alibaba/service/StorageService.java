package com.atguigu.springcloud.alibaba.service;

/**
 * @Author 原野
 * @DATE 2023/7/24 11:04
 * @Description:
 * @Version 1.0
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
