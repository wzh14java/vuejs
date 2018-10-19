package com.itheima.controller;

import com.itheima.domain.User;
import com.itheima.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author: Mr.Wu
 * 日期：2018/10/18  19:16
 * company：Itheima
 * 业精于勤荒于嬉、行成于思毁于随
 * 加油加油加油
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {


    @Autowired
    private UserService userService;


    @RequestMapping(value = "/findAll")
    public List<User> findAll(){

      return   userService.findAll();

    }

    @RequestMapping(value = "/findOne/{id}")
    public User findOne(@PathVariable("id") Integer id){
         return userService.findOne(id);
    }

    @RequestMapping(value = "/update")
    public void update(@RequestBody User user){
        userService.update(user);
    }

}

