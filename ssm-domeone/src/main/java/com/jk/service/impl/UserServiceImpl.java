package com.jk.service.impl;

import com.jk.dao.UserMapper;
import com.jk.model.User;
import com.jk.service.IUserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by 我？ on 2018/4/3.
 */

@Service("userService")
public class UserServiceImpl implements IUserService{
    @Autowired
    private UserMapper userDao;


    public List<User> queryuser() {
        List<User> userlist = userDao.queryuser();
        System.out.println(userlist);
        return userlist;
    }
}
