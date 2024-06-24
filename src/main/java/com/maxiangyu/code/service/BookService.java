package com.maxiangyu.code.service;

import com.maxiangyu.code.entity.Book;
import com.maxiangyu.code.mapper.BookMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

@Service
public class BookService {
    private BookMapper bookMapper;

    public int saveBook(Book book){
        Calendar specialDate = Calendar.getInstance(TimeZone.getDefault());
        specialDate.set(2022,5,31);
        Calendar currentDate = book.getPublicationDate();
        if(book != null && currentDate.after(specialDate)){
            return bookMapper.insert(book);
        }
        return -1;
    }

    /**
     * 查询所有标题以中国开头的图书
     * @return 结果集
     */
    public List<Book> getAllBooks(){
        String title = "中国";
        return null;
    }
}
