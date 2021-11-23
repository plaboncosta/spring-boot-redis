package com.personaljavaproject.springbootredis.model;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash("users")
public class UsersModel {
    private Integer id;
    private String login;
    private Integer Age;
}
