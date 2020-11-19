package com.hyxc.zjsys.test.service.impl;

import com.hyxc.zjsys.test.dao.UserDao;
import com.hyxc.zjsys.test.entity.UserEntity;
import com.hyxc.zjsys.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @Description: TODO
 * @author: scott
 * @date: 2020年11月19日 15:29
 */
public class UserServiceImpl implements UserService {

    @Autowired
    public UserDao userDao;
    @Override
    public UserEntity selectUserById(int id) {
        return null;
    }
}
