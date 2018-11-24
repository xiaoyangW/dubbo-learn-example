package com.xiaoyang.dubboclient.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xiaoyang.consumer.IUserService;
import com.xiaoyang.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author WXY
 * @date 2018/11/24 21:09
 */
@RestController
public class UserController {
    @Reference(version = "${example.service.version}",
            application = "${dubbo.application.id}",
            url = "dubbo://169.254.1.7:12345")
    private IUserService userService;

    @GetMapping("/get-user/{name}")
    public User getUser(@PathVariable("name") String name){
        return  userService.getUser(name);
    }
}
