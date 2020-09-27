package com.lee.photo;

import com.lee.photo.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PhotoApplicationTests {

    @Autowired
    UserDao userDao;

    @Test
    void contextLoads() {
        System.out.println(userDao.findAll());
    }

}
