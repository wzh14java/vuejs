package com.itheima.service;

import com.itheima.domain.User;

import java.util.List;

/**
 * Author: Mr.Wu
 * 日期：2018/10/18  19:09
 * company：Itheima
 * 业精于勤荒于嬉、行成于思毁于随
 * 加油加油加油
 */
public interface UserService {
    /**
     * 查找所有
     * @return
     */
    List<User> findAll();

    /**
     * 根据id查询
     * @param id
     * @return
     */
    User findOne(Integer id);

    /**
     * 修改用户
     * @param user
     */
    void update(User user);
}
