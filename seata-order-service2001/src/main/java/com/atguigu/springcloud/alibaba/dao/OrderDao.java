package com.atguigu.springcloud.alibaba.dao;

import com.atguigu.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author 原野
 * @DATE 2023/7/24 11:02
 * @Description:
 * @Version 1.0
 */
@Mapper
public interface OrderDao
{
    //1 新建订单
    void create(Order order);

    //2 修改订单状态，从零改为1
    void update(@Param("userId") Long userId,@Param("status") Integer status);
}