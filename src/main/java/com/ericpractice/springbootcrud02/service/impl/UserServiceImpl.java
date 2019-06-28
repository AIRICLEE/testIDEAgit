package com.ericpractice.springbootcrud02.service.impl;

import com.ericpractice.springbootcrud02.bean.User;
import com.ericpractice.springbootcrud02.dao.UserMapper;
import com.ericpractice.springbootcrud02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * UserServiceImpl class
 *
 * @author lighao
 * @date 2019/06/25
 */

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * override method getUserByAge
     *
     * @param age user age
     * @return User
     */
    @Override
    public List<User> getUserByAge(Integer age) {
        return userMapper.getUserByAge(age);
    }

    /**
     * override method getUserByAgeName
     *
     * @param user user data
     * @return User
     */
    @Override
    public List<User> getUserByAgeName(User user) {
        return userMapper.getUserByAgeName(user);
    }

    /**
     * override method insertUser
     *
     * @param user user data
     * @return void
     */
    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }

    /**
     * override method updateUser
     *
     * @param user user data
     * @return void
     */
    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

    /**
     * override method deleteUser
     *
     * @param id user id
     * @return void
     */
    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteUserById(id);
    }
}
