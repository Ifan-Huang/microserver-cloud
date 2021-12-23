package com.codeforc.microservice.payment.entities;

import java.io.Serializable;

/**
 * Author: Ifan·Huang
 * Description:
 **/
public class Payment implements Serializable {

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
