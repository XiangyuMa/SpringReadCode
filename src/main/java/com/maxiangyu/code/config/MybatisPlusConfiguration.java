package com.maxiangyu.code.config;

import com.baomidou.mybatisplus.core.injector.DefaultSqlInjector;
import com.baomidou.mybatisplus.core.injector.ISqlInjector;
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

    @Bean
    public OptimisticLockerInnerInterceptor optimisticInterceptor(){
        //乐观锁插件
        return new OptimisticLockerInnerInterceptor();
    }
    @Bean
    public PaginationInnerInterceptor paginationInnerInterceptor(){
        //分页插件
        return new PaginationInnerInterceptor();
    }
    @Bean
    public ISqlInjector injector(){
        //逻辑删除插件
        return new DefaultSqlInjector();
    }
}
