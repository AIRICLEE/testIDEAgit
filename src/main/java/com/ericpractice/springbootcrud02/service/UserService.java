package com.ericpractice.springbootcrud02.service;

import com.ericpractice.springbootcrud02.bean.User;

import java.util.List;

/**
 * UserService interface
 *
 * @author lighao
 * @date 2019/06/25
 */

public interface UserService {

    /**
     * get user data by age
     *
     * @param age user age
     * @return User
     */
    List<User> getUserByAge(Integer age);

    /**
     * get user data by age or name
     *
     * @param user user data
     * @return User
     */
    List<User> getUserByAgeName(User user);

    /**
     * insert user data
     *
     * @param user user data
     * @return void
     */
    void insertUser(User user);

    /**
     * update user data
     *
     * @param user
     * @return void
     */
    void updateUser(User user);

    /**
     * delete user data by id
     *
     * @param id user id
     * @return void
     */
    void deleteUser(Integer id);
}
