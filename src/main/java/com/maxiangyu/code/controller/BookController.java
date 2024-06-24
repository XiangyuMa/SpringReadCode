package com.maxiangyu.code.controller;

import com.maxiangyu.code.entity.Book;
import com.maxiangyu.code.service.BookService;
import com.maxiangyu.code.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @PostMapping("/save")
    public Result saveBook(@Valid @RequestBody Book book) {
        return Result.success(bookService.saveBook(book));
    }

    @PostMapping("/getAllBooks")
    public Result getAllBooksOnCondition() {
        return Result.success(bookService.getAllBooks());
    }
}
