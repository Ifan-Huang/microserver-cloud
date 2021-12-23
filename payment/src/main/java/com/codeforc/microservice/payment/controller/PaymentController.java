package com.codeforc.microservice.payment.controller;

import com.codeforc.microservice.payment.entities.Payment;
import com.codeforc.microservice.payment.result.CommonResult;
import com.codeforc.microservice.payment.service.IPaymentService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Author: Ifan·Huang
 * Description: 支付核心主模块controller,主要接口
 **/
@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private IPaymentService paymentService;

    @GetMapping("/selectOne/{id}")
    public CommonResult selectOne(@PathVariable Integer id) {
        Payment payment = paymentService.selectOne(id);
        System.out.println("this 12");
        return CommonResult.ok(payment);
    }

    @PostMapping("/insert")
    public CommonResult insert(@RequestBody Payment payment) {
        paymentService.insert(payment);
        return CommonResult.ok();
    }

}
