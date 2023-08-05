package com.atguigu.springcloud.alibaba.domain;

import lombok.Data;
/**
 * @Author 原野
 * @DATE 2023/7/24 11:04
 * @Description:
 * @Version 1.0
 */
@Data
public class Storage {

    private Long id;

    /**
     * 产品id
     */
    private Long productId;

    /**
     * 总库存
     */
    private Integer total;

    /**
     * 已用库存
     */
    private Integer used;

    /**
     * 剩余库存
     */
    private Integer residue;
}
