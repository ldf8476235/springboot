package com.lee.photo.service.impl;

import com.lee.photo.service.SmsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@Async
public class SmsServiceImpl implements SmsService {

    @Autowired
    com.lee.sms.SmsService smsService;

    @Override
    public void sendSimpleMail(String to,String content) {
        smsService.sendSms(to,content);
//        Map maps = new HashMap();
//        maps.put("Uid", "ldf1126");
//        maps.put("Key", "d41d8cd98f00b204e980");
//        maps.put("smsMob", to);
//        maps.put("smsText", content);
//        String result = sendHttpPost("http://utf8.sms.webchinese.cn", maps, "utf-8");
////        return Integer.parseInt(result);
    }
}
