package com.huang.ssmdemo.pojo;

public class UserType {
    private int id;
    private String typeName;

    public UserType(int id, String typeName) {
        this.id = id;
        this.typeName = typeName;
    }

    public UserType() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}