package com.xiaoyang.dubboservice.service;

import com.xiaoyang.consumer.IUserService;
import com.xiaoyang.pojo.User;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author WXY
 * @date 2018/11/22 20:24
 */
@Service
public class UserServiceImpl implements IUserService {

    private final Map<String, User> userMap;

    public UserServiceImpl() {
        this.userMap = new HashMap<>(10);
    }

    @Override
    public User getUser(String name) {
        return userMap.get(name);
    }

    @Override
    public Integer addUser(User user) {
        userMap.put(user.getName(),user);
        return 1;
    }

}
