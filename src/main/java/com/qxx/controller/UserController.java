package com.qxx.controller;


import com.qxx.common.lang.Result;
import com.qxx.entity.User;
import com.qxx.service.UserService;

import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author Xuan
 * @since 2021-11-03
 */
@RestController
@RequestMapping("/user")
public class UserController {

    UserService userService;

    @RequiresAuthentication
    @GetMapping("/index")
    public Result index(){
        User user = userService.getById(1L);
        return Result.succ(user);
    }
    @PostMapping("/save")
    public Result index(@Validated @RequestBody User user){
        user.setAvatar("1234");
        userService.save(user);

        return Result.succ(user);
    }

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }
}
