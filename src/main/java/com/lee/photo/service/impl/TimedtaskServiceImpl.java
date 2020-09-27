package com.lee.photo.service.impl;

import com.lee.photo.service.TimedtaskService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
public class TimedtaskServiceImpl implements TimedtaskService {
    @Override
    @Scheduled(cron = "5/1 * * * * *")
    public void task() {
        System.out.println("hello,你被执行了~");
    }
}
