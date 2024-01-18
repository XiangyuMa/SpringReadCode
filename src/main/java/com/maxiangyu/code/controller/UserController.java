package com.maxiangyu.code.controller;

import com.maxiangyu.code.entity.User;
import com.maxiangyu.code.service.MQService;
import com.maxiangyu.code.service.UserService;
import com.maxiangyu.code.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private MQService mqService;

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

    /**
     * 用接口作为消息发送方
     * @param msg 消息
     * @return 返回值
     */
    @PostMapping("/sendMsg")
    public Result sendMessage(@RequestParam(name = "msg") String msg) {
        mqService.sendMessage(msg);
        return Result.success();
    }
}
