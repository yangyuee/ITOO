package com.yye.springboot.dao;/*
 @auther 杨月娥
 @DESCRIPTION ${DESCRIPTION}
 @create 2019/6/23
*/



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;

import java.util.UUID;

public class DistributeLock
{
    @Autowired
    private StringRedisTemplate stringRedisTemplate;
   public  String lociWithTimeout(String lockName,long acquireTimeout,long timeout){

       String retIdentifier = UUID.randomUUID().toString();
       String lockKey ="lock:" + lockName;
       int lockExpire = (int) (timeout/1000);
       long end = System.currentTimeMillis() + acquireTimeout;
       while (System.currentTimeMillis()<end){

       }
       return null;
   }
}
