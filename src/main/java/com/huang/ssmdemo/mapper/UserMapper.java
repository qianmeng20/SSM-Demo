package com.huang.ssmdemo.mapper;

import com.huang.ssmdemo.pojo.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
@Repository
public interface UserMapper {
    ArrayList<User> showAll();
    void delete(@Param("id") int id);
    void add(@Param("name") String name, @Param("password") String password,@Param("type") String type);
}