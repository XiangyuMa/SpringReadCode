package com.maxiangyu.code.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.maxiangyu.code.entity.Book;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.reflection.wrapper.BaseWrapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
public interface BookMapper extends BaseMapper<Book> {
}
