package com.maxiangyu.code;

import com.maxiangyu.code.entity.Book;
import com.maxiangyu.code.mapper.BookMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootTest
@ComponentScan(value = "com.maxiangyu.code")
@Slf4j
class BookManagementApplicationTests {

   @Autowired
   private BookMapper bookMapper;

	@Test
	void contextLoads() {
		log.info("上下文启动...");
	}
	@Test
	public  void tetsAdd(){
		log.info("testAdd()");
		Book book = new Book();
		book.setAuthor("陈忠实");
		book.setTitle("白鹿原");
		bookMapper.insert(book);
	}
}
