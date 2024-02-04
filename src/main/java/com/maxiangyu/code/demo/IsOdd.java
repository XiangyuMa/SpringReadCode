package com.maxiangyu.code.demo;

/**
 * @author :马翔宇
 * @description 简单面试题 判断一个数是不是奇数
 * @date: 2024/2/4 13:23
 */
public class IsOdd {
    public static void main(String[] args) {
    }
    public static boolean isOdd(int i){
        if(i % 2 ==1){
            return  true;
        }
        return false;
    }
    //第二种
    public static boolean isOdd2(int i){
        //表达式本身就是布尔类型的 所以不用写的这么繁琐
        return i % 2 == 1;
    }
    //第三种 如果参数是负数呢
    public static boolean isOdd3(int i){
        return i % 2 != 0;
    }
}
