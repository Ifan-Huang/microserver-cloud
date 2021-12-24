package com.codeforc.microservice.payment.service.impl;

import com.codeforc.microservice.common.entities.Payment;
import com.codeforc.microservice.payment.mapper.PaymentMapper;
import com.codeforc.microservice.payment.service.IPaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Author: Ifan·Huang
 * Description: payment service层
 **/
@Service
public class PaymentService implements IPaymentService  {

    @Resource
    private PaymentMapper paymentMapper;

    @Override
    public Payment selectOne(Integer id) {
        return paymentMapper.selectOne(id);
    }

    @Override
    public void insert(Payment payment) {
        paymentMapper.insert(payment);
    }
}
