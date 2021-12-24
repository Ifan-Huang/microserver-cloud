package com.codeforc.microservice.payment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Author: Ifan·Huang
 * Description: 支付服务主程序启动类,该服务旨在为项目提供稳定精确的支付服务。
 **/
@EnableEurekaClient
@SpringBootApplication
public class PaymentApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentApplication.class, args);
    }
}