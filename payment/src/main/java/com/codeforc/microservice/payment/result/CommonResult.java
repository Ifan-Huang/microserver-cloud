package com.codeforc.microservice.payment.result;

/**
 * Author: Ifan·Huang
 * Description: 返回前端响应数据
 **/
public class CommonResult<T> {

    private Integer code;

    private String message;

    private T data;

    public static CommonResult ok() {
        return ok(null);
    }

    public static <T> CommonResult ok(T data) {
        return new CommonResult(200, "OK", data);
    }

    public CommonResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public CommonResult(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
