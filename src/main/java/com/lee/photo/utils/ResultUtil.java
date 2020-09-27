package com.lee.photo.utils;

import com.lee.photo.pojo.Result;
import com.lee.photo.utils.enums.StatusCode;

public class ResultUtil {
    public static Result success(String desc, Object object){
        return new Result(StatusCode.SUCCESS.getStatus(),StatusCode.SUCCESS.getDesc() == null? "操作成功":StatusCode.SUCCESS.getDesc(),object);
    }
}
