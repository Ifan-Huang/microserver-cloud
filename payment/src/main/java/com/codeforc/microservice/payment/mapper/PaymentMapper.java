package com.codeforc.microservice.payment.mapper;

import com.codeforc.microservice.common.entities.Payment;
import org.apache.ibatis.annotations.Mapper;

/**
 * payment 持久层代码
 */
@Mapper
public interface PaymentMapper {

    void insert(Payment payment);

    Payment selectOne(Integer id);

}
