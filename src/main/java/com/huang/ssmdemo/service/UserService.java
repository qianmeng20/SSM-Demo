package com.huang.ssmdemo.service;

import com.huang.ssmdemo.pojo.User;

import java.util.ArrayList;

public interface UserService {
    ArrayList<User> showAll();
    void delete(int id);
    void add(String name, String password, String type);
}