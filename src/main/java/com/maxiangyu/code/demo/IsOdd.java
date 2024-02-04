package com.maxiangyu.code.demo;

import java.util.Random;

/**
 * @author :马翔宇
 * @description 简单面试题 判断一个数是不是奇数
 * @date: 2024/2/4 13:23
 */
public class IsOdd {
    public static void main(String[] args) {
        int a = 3,b = 4;
        System.out.println(isOdd4(a)+" "+ isOdd4(b));
        boolean[] arr3 = new boolean[100000000];
        boolean[] arr4 = new boolean[100000000];
        long start = System.currentTimeMillis();
        for(int i = 0;i < arr3.length;i++){
            arr3[i] = isOdd3((int)(1+ Math.random()*(10 -1+1)));
        }
        long end = System.currentTimeMillis();
        System.out.println("取模运算耗时：" + (end - start));
        long s = System.currentTimeMillis();
        for(int i = 0;i < arr4.length;i++){
            arr4[i] = isOdd4((int)(1+ Math.random()*(10 -1+1)));
        }
        long e = System.currentTimeMillis();
        System.out.println("位运算耗时：" + (e - s));
        System.out.println();
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
    //第四种 利用位运算 奇数二进制最后一位一定是1,偶数二进制最后一位一定是0
    public static boolean isOdd4(int i){
        return (i & 1) == 1;
    }
   //

    /*
    * 一亿组数据对比结果如下：可以看出位运算要比取模运算效率高易一些，但是也不明显
    true false
    取模运算耗时：2393
    位运算耗时：2227
    *
    * */
}
