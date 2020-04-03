package com.mashibing;

 /*
 map存储的是k-v键值对映射的数据
 实现子类：
 HashMap:数据+链表（1.7）    数组+链表+红黑树（1.8）
 LinkeHashMap：链表
 Treemap：红黑树


 基本api操作：
 增加：
 put（k，v）
 查找：
    isEmpty    判断是否为空
    size       返回map的大小
    containsKey
    containsKey
    containsValue
    get


 删除：
 clear：清空集合中的所有元素
 remove：删除指定元素


 Map.entry:表示的是k-v组合的一组映射关系，key和value成组出现


 hashmap线程不安全，效率比较高，hashtable线程安全，效率低
 hashmap中key和value都可以为空，hashtable都不允许为空




 hashmap初始值为2的N次幂，
 1、方便进行&操作，提高效率，&要比取模运算效率要高
 hash & （initCapacity-1）
 2、在扩容后涉及元素的迁移过程，迁移的时候只需判断二进制的前一位是0或者是1即可
 如果是0表示新增数组和旧数组的下标位置不变，如果是1 ，只需要在索引位置加上旧数组的长度值即为新数组的下标


 1.7源码知识点；  数组+链表
 1、默认初始容量
 2、扩容操作
 3、数据迁移的过程

 1.8源码知识点：  数组+链表+红黑树







 */

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<String,Integer>();
        map.put("a",1);
        map.put("b",2);
        map.put("c",3);
        map.put("d",4);
        System.out.println(map);//{a=1, b=2, c=3, d=4}
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        //    map.clear();
        System.out.println(map.containsKey("a"));
        System.out.println(map.containsValue(2));
        System.out.println(map.get("a"));
        map.remove("a");
        System.out.println(map);


        //遍历操作
        Set<String> keys=map.keySet();
        for (String key:keys){
            System.out.println(key+"="+map.get(key));
        }



        //只能获取对应的value值，不能根据value来获取key
        Collection<Integer> values =map.values();
        for (Integer i:values){
            System.out.println(i);
        }


        //迭代器
        Set<String>keys2=map.keySet();
        Iterator<String> iterator=keys2.iterator();
        while(iterator.hasNext()){
            String key=iterator.next();
            System.out.println(key+"="+map.get(key));
        }


        //map.entry
        Set<Map.Entry<String,Integer>>entries = map.entrySet();
        Iterator<Map.Entry<String,Integer>>iterator1=entries.iterator();
        while(iterator1.hasNext()){
            Map.Entry<String,Integer>next = iterator1.next();
            System.out.println(next.getKey()+"--"+next.getValue());
        }

    }

    }

