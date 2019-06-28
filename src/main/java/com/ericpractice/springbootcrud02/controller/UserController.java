package com.ericpractice.springbootcrud02.controller;

import com.ericpractice.springbootcrud02.bean.User;
import com.ericpractice.springbootcrud02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * UserController class
 *
 * @author lighao
 * @date 2019/06/25
 */

@RestController
public class UserController {
    @Autowired
    private UserService userService;


    /**
     * export method getUserById
     *
     * @param age user age
     * @return User
     */
    @GetMapping("/user/{age}")
    public List<User> getUserById(@PathVariable("age") Integer age){
        return userService.getUserByAge(age);

    }


    /**
     * export method getUserByAgeName
     *
     * @param user user data
     * @return User
     */
    @GetMapping("/user/findUser")
    public List<User> getUserByAgeName(User user){
        return userService.getUserByAgeName(user);

    }

    /**
     * export method insertUser
     *
     * @param user user data
     * @return void
     */
    @PostMapping("/user")
    public User insertUser(@RequestBody User user){
        userService.insertUser(user);
        return user;
    }


    /**
     * export method updateUser
     *
     * @param user user data
     * @return void
     */
    @PutMapping("/user/update")
    public String updateUser(@RequestBody User user){
        userService.updateUser(user);
        return "update successfully ！";
    }


    /**
     * export method deleteUser
     *
     * @param id user id
     * @return void
     */
    @DeleteMapping("/user/delete/{id}")
    public String deleteUser(@PathVariable("id") Integer id){
        userService.deleteUser(id);
        return "delete successfully !";
    }

}
