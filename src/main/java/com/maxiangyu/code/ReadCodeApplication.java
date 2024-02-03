package com.maxiangyu.code;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReadCodeApplication {

	private final static Logger log = LoggerFactory.getLogger(ReadCodeApplication.class);

	public static void main(String[] args) {
		log.info("正在启动springboot应用...");
		SpringApplication.run(ReadCodeApplication.class, args);
	}

}
