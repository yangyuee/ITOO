package com.yye.springboot.dao;/*
 @auther 杨月娥
 @DESCRIPTION ${DESCRIPTION}
 @create 2019/6/21
*/

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Repository;

import java.util.concurrent.TimeUnit;

@Repository
public class RedisDao {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    public  void setKey(String key,String value){
        ValueOperations<String,String> ops= stringRedisTemplate.opsForValue();
        ops.set(key,value,1, TimeUnit.MINUTES);

    }
    public String getValue(String key){
        ValueOperations<String,String> ops = this.stringRedisTemplate.opsForValue();
        return ops.get(key);
    }
}
