package com.maxiangyu.code.entity;

import lombok.Data;
import org.hibernate.validator.constraints.Length;
import javax.validation.constraints.NotBlank;
import java.util.Calendar;
import java.util.Date;
@Data
public class Book {
    /**
     * 主键
     */
    private Integer id;
    /**
     * 图书编码
     */
    private String code;
    /**
     * 作者
     */
    @NotBlank(message = "作者不能为空")
    private String author;
    /**
     * 标题
     */
    @NotBlank(message = "标题不能为空")
    private String title;
    /**
     * 内容
     */
    @Length(max = 10000,message = "内容长度在1w以内")
    private String content;
    /**
     * 出版日期
     */
    private Calendar publicationDate;
}
