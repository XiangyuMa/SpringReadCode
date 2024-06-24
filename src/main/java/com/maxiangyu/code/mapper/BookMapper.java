package com.maxiangyu.code.mapper;

import com.maxiangyu.code.entity.Book;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BookMapper {
    int save(Book book);

    List<Book> getAllBooks(String title);
}
