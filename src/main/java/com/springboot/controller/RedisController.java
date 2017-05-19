package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/redis")
public class RedisController {

    @Autowired
    private RedisTemplate redisTemplate;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/set")
    public String set() {
        stringRedisTemplate.opsForValue().set("hello", "redis");
        String result = stringRedisTemplate.opsForValue().get("hello");
        if ("redis".equals(result)) return "ok";
        return "fail";
    }

    @RequestMapping("/getList")
    public List<Integer> setString() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        redisTemplate.opsForList().rightPush("list", list);
        return (List)redisTemplate.opsForList().rightPop("list");
    }
}
