package com.maxiangyu.code;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.maxiangyu.code.entity.Book;
import com.maxiangyu.code.mapper.BookMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	@Test
	public void testBatchIds(){
		//通过id批量查询
		List<Book> bookList = bookMapper.selectBatchIds(Arrays.asList(10014,10015,10016));
		log.info(bookList.toString());
	}
	@Test
	public void testByMap(){
		Map<String,Object> map = new HashMap<>();
		map.put("author","陈忠实");
		List<Book> bookList = bookMapper.selectByMap(map);
		bookList.forEach(System.out::println);
	}
	@Test
	//分页查询
	public void testPage(){
		Page<Book> page = new Page<>(4,3);
		bookMapper.selectPage(page, null);
		System.out.println("当前页：" + page.getCurrent());
		System.out.println("当前记录数：" + page.getRecords());
		System.out.println("每页大小：" + page.getSize());
		System.out.println("总共记录：" + page.getTotal());
		System.out.println("是否有下一页：" + page.hasNext());
		System.out.println("是否有上一页：" + page.hasPrevious());

	}
}
