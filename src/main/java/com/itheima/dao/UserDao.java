package com.itheima.dao;

import com.itheima.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author: Mr.Wu
 * 日期：2018/10/18  19:08
 * company：Itheima
 * 业精于勤荒于嬉、行成于思毁于随
 * 加油加油加油
 */
public interface UserDao extends JpaRepository<User,Integer> {
}
