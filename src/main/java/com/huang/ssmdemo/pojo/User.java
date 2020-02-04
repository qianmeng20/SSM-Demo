package com.huang.ssmdemo.pojo;

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String name;
    private String password;
    private UserType userType;

    public User() {
    }

    public User(int id, String name, String password, UserType userType) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.userType = userType;
    }

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}