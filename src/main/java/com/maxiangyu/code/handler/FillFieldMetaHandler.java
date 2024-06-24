package com.maxiangyu.code.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.Date;


/**
 * @author :马翔宇
 * @description:用来自动填充实体的创建时间和更新时间字段
 * @date: 2024/6/24 22:12
 */
@Slf4j
@Component
public class FillFieldMetaHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        log.info("insert fillfield execute...");
        this.setFieldValByName("createTime",new Date(),metaObject);
        this.setFieldValByName("updateTime",new Date(),metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        log.info("update fillfield execute...");
        this.setFieldValByName("updateTime",new Date(),metaObject);
    }
}


