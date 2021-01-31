package com.xj.springcloud.dao;

import com.xj.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author xijie
 * @version V1.0
 * Date 2021/1/31 23:13
 * @Description:
 */

@Mapper
public interface PaymentDao {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id")Long id);
}
