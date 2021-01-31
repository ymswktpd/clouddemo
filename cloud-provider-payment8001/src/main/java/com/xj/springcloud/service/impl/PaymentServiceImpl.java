package com.xj.springcloud.service.impl;

import com.xj.springcloud.dao.PaymentDao;
import com.xj.springcloud.entities.Payment;
import com.xj.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author xijie
 * @version V1.0
 * Date 2021/1/31 23:25
 * @Description:
 */
@Service
@Slf4j
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }
}
