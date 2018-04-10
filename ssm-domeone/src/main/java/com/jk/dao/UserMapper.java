package com.jk.dao;

import com.jk.model.User;

import java.util.List;

public interface UserMapper {
/*    int insert(User record);

    int insertSelective(User record);*/

    List<User> queryuser();
}