package com.maxiangyu.code.mapper;

import com.maxiangyu.code.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    int add(User user);

    int update(User user);

    int delete(Integer id);
}
