package com.maxiangyu.code.mapper;

import com.maxiangyu.code.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    int add(User user);

    int update(User user);

    int delete(Integer id);

    List<User> getAllUsers();
}
