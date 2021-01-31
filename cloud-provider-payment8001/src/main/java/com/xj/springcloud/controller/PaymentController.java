package com.xj.springcloud.controller;

import com.xj.springcloud.entities.CommonResult;
import com.xj.springcloud.entities.Payment;
import com.xj.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author xijie
 * @version V1.0
 * Date 2021/1/31 23:29
 * @Description:
 */
@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping("/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int res = paymentService.create(payment);
        if(res>0){
            return new CommonResult(200,"success",res);
        }else{
            return new CommonResult(444,"fail",null);
        }
    }

    @GetMapping("/payment/getPaymentById/{id}")
    public CommonResult getPaymentById(@PathVariable("id") Long  id){
        Payment payment = paymentService.getPaymentById(id);
        if(payment != null){
            return new CommonResult(200,"success",payment);
        }else{
            return new CommonResult(200,"no result",null);
        }
    }

}
