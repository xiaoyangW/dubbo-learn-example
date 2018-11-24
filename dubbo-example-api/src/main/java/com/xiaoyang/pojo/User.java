package com.xiaoyang.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author WXY
 * @date 2018/11/19 21:03
 */
@Setter
@Getter
@ToString
public class User implements Serializable {

    private Integer id;

    private String name;

    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
    }
}
