package com.maxiangyu.code.controller;

import com.maxiangyu.code.entity.User;
import com.maxiangyu.code.service.UserService;
import com.maxiangyu.code.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping()
    public Result register(@RequestBody User user) {
        userService.addUser(user);
        return Result.success();
    }
    @PutMapping
    public Result updateInfo(@RequestBody User user) {
        userService.updateUser(user);
        return Result.success();
    }
    @DeleteMapping("/{id}")
    public Result register(@PathVariable Integer id) {
        userService.deleteUser(id);
        return Result.success();
    }

    @GetMapping("")
    public Result getUsers() {
        return Result.success(userService.getAllUsers());
    }

}
