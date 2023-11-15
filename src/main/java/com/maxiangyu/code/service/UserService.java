package com.maxiangyu.code.service;

import com.maxiangyu.code.entity.User;
import com.maxiangyu.code.mapper.UserMapper;
import com.maxiangyu.code.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public Result addUser(User user){
        userMapper.add(user);
        return Result.success();
    }
    public Result updateUser(User user){
        userMapper.update(user);
        return Result.success();
    }

    public Result deleteUser(Integer id){
        userMapper.delete(id);
        return Result.success();
    }
}
