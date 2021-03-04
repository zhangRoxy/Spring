package com.ZRS.service.impl;

import com.ZRS.bean.User;
import com.ZRS.dao.UserDao;
import com.ZRS.service.UserService;
import lombok.Data;

import java.util.List;


@Data
public class UserServiceImpl implements UserService {

    UserDao userDao=null;

    public List<User> getUsers() {
        return userDao.getUsers();
    }
}
