package com.codeforc.microservice.order.controller;

import com.codeforc.microservice.common.entities.Payment;
import com.codeforc.microservice.common.result.CommonResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * Author: Ifan·Huang
 * Description: 订单控制层
 **/
@RestController
@RequestMapping("/order")
public class OrderController {

    public static final String PAYMENT_URL = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/consumer/createPayment")
    public CommonResult createPayment(@RequestBody Payment payment) {
        return restTemplate.postForObject(PAYMENT_URL + "/payment/insert", payment, CommonResult.class);
    }

}