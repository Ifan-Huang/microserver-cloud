package com.codeforc.microservice.payment.service;


import com.codeforc.microservice.common.entities.Payment;

public interface IPaymentService {

    Payment selectOne(Integer id);

    void insert(Payment payment);

}
