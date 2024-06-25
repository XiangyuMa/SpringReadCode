package com.maxiangyu.code.config;

import com.baomidou.mybatisplus.extension.plugins.inner.OptimisticLockerInnerInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author :马翔宇
 * @description
 * @date: 2024/6/25 11:06
 */
@Configuration
@ComponentScan("com.maxiangyu.code")
public class MybatisPlusConfiguration {

    //乐观锁插件
    @Bean
    public OptimisticLockerInnerInterceptor optimisticLockerInnerInterceptor(){
        return new OptimisticLockerInnerInterceptor();
    }
    @Bean
    public PaginationInnerInterceptor paginationInnerInterceptor(){
        return new PaginationInnerInterceptor();
    }
}
