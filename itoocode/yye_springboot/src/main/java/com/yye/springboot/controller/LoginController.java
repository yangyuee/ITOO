package com.yye.springboot.controller;/*
 @auther 杨月娥
 @DESCRIPTION ${DESCRIPTION}
 @create 2019/6/19
*/

import com.dmsdbj.itoo.tool.business.ItooResult;
import com.yye.springboot.entity.VueLoginInfoVo;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Objects;

@RestController
//@RequestMapping(value = "/logi")
public class LoginController {

    @CrossOrigin
    @RequestMapping(value = "/login",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public ItooResult login(@Valid @RequestBody VueLoginInfoVo loginInfoVo, BindingResult bindingResult ){
        if(bindingResult.hasErrors()){
            String message = String.format("登录失败，详细信息[%s]。",bindingResult.getFieldError().getDefaultMessage());
            return ItooResult.build("1111",message);
        }

        if (!loginInfoVo.getUsername().equals("admin") || !loginInfoVo.getPassword().equals("123")){
            String message = String.format("登录失败，详细信息[登录名或密码不正确]");
            return ItooResult.build("1111",message);
        }
        return  ItooResult.build("1000","登录成功");
    }
}
