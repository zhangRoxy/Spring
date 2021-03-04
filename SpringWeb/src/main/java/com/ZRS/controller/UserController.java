package com.ZRS.controller;

import com.ZRS.bean.User;
import com.ZRS.service.UserService;
import lombok.Data;

import java.util.List;


@Data
public class UserController {

    UserService userService=null;

    public void list(){
        List<User> users = userService.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
    }
}
