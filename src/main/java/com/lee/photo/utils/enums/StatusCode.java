package com.lee.photo.utils.enums;

public enum StatusCode {
    FAIL(0,"操作失败"),
    SUCCESS(1,"操作成功"),
    UNKNOW(2,"未知错误");



    private int status;    //类型
    private String desc;    //描述

    private StatusCode(int status,String desc){
        this.status=status;
        this.desc=desc;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
