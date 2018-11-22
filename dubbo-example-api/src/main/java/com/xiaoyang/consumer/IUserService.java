package com.xiaoyang.consumer;

import com.xiaoyang.pojo.User;

/**
 * @author WXY
 * @date 2018/11/19 21:01
 */
public interface IUserService {

    User getUser(String name);

    Integer addUser(User user);

}
