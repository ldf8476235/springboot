package com.lee.photo.controller;

import com.lee.photo.pojo.Result;
import com.lee.photo.pojo.User;
import com.lee.photo.service.MailService;
import com.lee.photo.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    MailService mailService;

    @Autowired
    SmsService smsService;

    @GetMapping("/test")
    public Result show(){
//        return ResultUtil.success(null,new User(1,"Lee","123456"));
//        mailService.sendSimpleMail("8476235@qq.com","test","请测试");
        smsService.sendSimpleMail("15811502984","您的验证码为:4588");
        return new Result(1,null,new User(1,"Lee","123456"));
    }
}
