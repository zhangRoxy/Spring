package com.ZRS.dao.impl;

import com.ZRS.bean.User;
import com.ZRS.dao.UserDao;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class UserDaoImpl implements UserDao {

    DataSources ds=null;

    public List<User> getUsers() {
        System.out.println("模拟查询数据库,连接的数据库是:"+ds);
        User u1=new User(111,"刘备","男","小乔");
        User u2=new User(222,"关羽","男","耍大刀");
        User u3=new User(333,"张飞","男","卖猪肉");
        User u4=new User(444,"诸葛亮","男","装逼");
        List<User> list=new ArrayList<User>();
        list.add(u1);
        list.add(u2);
        list.add(u3);
        list.add(u4);
        return list;
    }
}
