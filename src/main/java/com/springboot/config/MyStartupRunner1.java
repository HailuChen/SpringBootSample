package com.springboot.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 可以利用注解Order来使服务器按顺序加载，数值越下越早加载
 */
@Component
@Order(value = 2)
public class MyStartupRunner1 implements CommandLineRunner {
    @Override
    public void run(String... strings) throws Exception {
        System.out.println("服气器启动加载数据等操作11111111111");
    }
}
