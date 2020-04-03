package com.mashibing;

import java.util.Arrays;
import java.util.List;

/**
 * Arrays提供了数据操作的工具类，包含很多方法
 *         集合和数组之间的转换
 *             将数组转换成list；
 *
 *
 *
 */

public class ArraysDemo {
    public static void main(String[] args) {
 //       int [] array =new int[] {1,2,3,4,5};
        //将数组转换成list；
        List<Integer> ints = Arrays.asList(1,2,3,4,5);
        //list转成数组
        Object[] objects = ints.toArray();


    }
}
