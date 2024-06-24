package com.maxiangyu.code;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookManagementApplication {

	private final static Logger log = LoggerFactory.getLogger(BookManagementApplication.class);

	public static void main(String[] args) {
		log.info("图书管理系统正在启动...");
		SpringApplication.run(BookManagementApplication.class, args);
	}

}
