package com.yye.springboot.redisdemo;/*
 @auther 杨月娥
 @DESCRIPTION ${DESCRIPTION}
 @create 2019/6/23
*/

import org.omg.CORBA.portable.ValueOutputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.nio.channels.NetworkChannel;
import java.util.Enumeration;

@Service
public class LockNxExJob {
    private static final Logger logger = LoggerFactory.getLogger(LockNxExJob.class);

    @Autowired
    private RedisTemplate redisTemplate;
    private static String LOCK_PREFIX = "prefix_";

    @Scheduled(cron = "0/10 * * * *")
    public void lockJob() {
        String lock = LOCK_PREFIX + "LockNxExJob";
        boolean nxRet = false;
        nxRet = redisTemplate.opsForValue().setIfAbsent(lock, getHostIp());
       // Object lockValue =

    }


    public static String getHostIp() {

        try {
            Enumeration<NetworkInterface> allNetInterface = NetworkInterface.getNetworkInterfaces();
            while (allNetInterface.hasMoreElements()) {
                NetworkInterface networkInterface = (NetworkInterface) allNetInterface.nextElement();
                Enumeration<InetAddress> address = networkInterface.getInetAddresses();
                while (address.hasMoreElements()) {
                    InetAddress ip = (InetAddress) address.nextElement();
                    if (ip != null
                            && ip instanceof Inet4Address
                            && !ip.isLoopbackAddress()
                            && ip.getHostAddress().indexOf(":") == -1) {
                        return ip.getHostAddress();
                    }
                }
            }
        } catch (SocketException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static Object genValue(final String key){
        Object result = null;
        //ValueOperations<String, String> operations = redisTemplate.opsForValue();
       // result = operations.get(key);
        return null;
    }
}
