package com.example.demo.service.impl;

import com.example.demo.dao.UserMapper;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lyh on 2017/7/17.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        List<User> userList = userMapper.selectAll();
        return userList;
    }

    @Override
    public int insert(User user) {
        return userMapper.insert(user);
    }
}
