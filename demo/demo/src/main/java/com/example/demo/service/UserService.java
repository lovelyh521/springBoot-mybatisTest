package com.example.demo.service;

import com.example.demo.entity.User;

import java.util.List;

/**
 * Created by lyh on 2017/7/17.
 */
public interface UserService {

    List<User> findAll();

    int insert(User user);
}
