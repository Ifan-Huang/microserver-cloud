package com.codeforc.microservice.order.entities;

import java.io.Serializable;

/**
 * Author: Ifan·Huang
 * Description: payment client entity
 **/
public class Payment implements Serializable {

    private static final long serialVersionUID = 1L;

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

    public Payment(Integer id, String serialNumber) {
        this.id = id;
        this.serialNumber = serialNumber;
    }

    public Payment() {
    }
}
