package com.example.demo.dao;


import com.example.demo.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
public interface UserMapper {
    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> selectAll();
}