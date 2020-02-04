package com.huang.ssmdemo.service;

import com.huang.ssmdemo.mapper.UserMapper;
import com.huang.ssmdemo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
     UserMapper userMapper;


    public UserServiceImpl() {
    }

    public ArrayList<User> showAll() {
        return userMapper.showAll();
    }

    public void delete(int id) {
        userMapper.delete(id);
    }

    public void add(String name, String password, String type) {
        userMapper.add(name,password,type);
    }


}