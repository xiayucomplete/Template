package com.xiayu.oauth2.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
////@SpringBootTest
public class ServerApplicationTests {

    @Test
    public void contextLoads() {
    }

    public static void main(String[] args) {
        System.out.println( new BCryptPasswordEncoder().encode("123456"));
    }

}