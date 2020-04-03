package com.mashibing.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> list =new ArrayList<>();
        list.add("adc");
        list.add("bhfdsd");
        list.add("cFCD");
        list.add("dF");


        Collections.addAll(list,"eRR","fWDS","gS");
        System.out.println(list);//[adc, bhfdsd, cFCD, dF, eRR, fWDS, gS]
/*
       //  排序 //new 了一个接口，接口能new吗 ？  不能  ；那么此时用了一个匿名内部类
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2.length())){
                    return 1;
                }else if (o1.length()>o2.length()){
                    return -1;
                }else {

                    return 0;
                }
            }
        });
        System.out.println(list);//[bhfdsd, cFCD, fWDS, adc, eRR, dF, gS]
        Collections.sort(list);
        Collections.sort(list);
        System.out.println(list);//[adc, bhfdsd, cFCD, dF, eRR, fWDS, gS]
*/
       //二公查找需要先进行排序操作，如果没有排序的话，是找不到指定元素的
       Collections.sort(list);
        System.out.println(Collections.binarySearch(list,"acssf"));

        Collections.fill(list,"mashibing");
        System.out.println(list);

    }
}