package com.maxiangyu.code.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :马翔宇
 * @description list一边遍历一边删除
 * @date: 2024/2/3 16:40
 */
public class Test {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("C++");
        list.add("python");
        //错误写法：会导致抛出并发修改异常，modCount和expectedModCount不一致
        /*for(String s:list){
            if(s.equals("java")){
                list.remove(s);
            }
        }*/

        //正确写法 迭代器遍历删除

       /* Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String s = iterator.next();
            if(s.equals("java")){
                //使用迭代器不会抛异常的原因是每次修改都会将modCount的值赋值给expectedModCount，两个变量的值总是一样的
                iterator.remove();
            }
        }*/

        //第二种方式就是使用for循环正向遍历
       /* for(int i =0;i < list.size();i++){
            String s = list.get(i);
            if(s.equals("java")){
                list.remove(i);
                //修正下标
                i = i-1;
            }

        }*/

        //第三种方式与第二种差不多，但不需要修正下标
        for(int i = list.size()-1;i >= 0;i--) {
            String s = list.get(i);
            if(s.equals("java")) {
                list.remove(i);
            }
        }
        System.out.println(list.toString());
    }
}
