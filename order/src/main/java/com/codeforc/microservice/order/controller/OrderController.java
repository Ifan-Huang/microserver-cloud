package com.codeforc.microservice.order.controller;

import com.codeforc.microservice.order.entities.Payment;
import com.codeforc.microservice.order.result.CommonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Author: Ifan·Huang
 * Description: 订单控制层
 **/
@RestController
@RequestMapping("/order")
public class OrderController {

    public static final String PAYMENT_URL = "http://localhost:8081";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/consumer/createPayment")
    public CommonResult createPayment(Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

}