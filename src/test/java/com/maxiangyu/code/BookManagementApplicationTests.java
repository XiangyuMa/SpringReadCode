package com.maxiangyu.code;

import com.maxiangyu.code.entity.Book;
import com.maxiangyu.code.mapper.BookMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.List;

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
		book.setAuthor("赵梦诗");
		book.setTitle("中国地理校勘");
		bookMapper.insert(book);
	}
	@Test
	public void testSelect(){
		log.info("test Select::");
		List<Book> bookList = bookMapper.selectList(null);
		log.info("返回集大小：" + bookList.size());
	}
	@Test
	public void testUpdate(){
		log.info("update::");
		Book book = new Book();
		book.setId(10016);
		book.setContent("中国地理");
		bookMapper.updateById(book);
	}

	@Test
	public void testOptimisticLocker(){
		//乐观锁总是要先查后改，因为要获取版本号
		log.info("测试乐观锁更新...");
		Book book = bookMapper.selectById(10016);
		book.setContent("中国地理形态多样，几乎涵盖世界范围内所有的地貌");
		bookMapper.updateById(book);
	}
}
