package com.itheima.service.impl;

import com.itheima.dao.UserDao;
import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Author: Mr.Wu
 * 日期：2018/10/18  19:09
 * company：Itheima
 * 业精于勤荒于嬉、行成于思毁于随
 * 加油加油加油
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {


    @Autowired
    private UserDao userDao;


    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findOne(Integer id) {
        User user = userDao.findById(id).orElse(null);
        return user;
    }


    @Override
    public void update(User user) {
        userDao.save(user);
    }


}
