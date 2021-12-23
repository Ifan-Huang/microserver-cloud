package com.codeforc.microservice.order.entities;

/**
 * Author: Ifan·Huang
 * Description: payment client entity
 **/
public class Payment {

    private Integer id;

    private String serialNumber;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
