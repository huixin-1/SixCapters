package com.mashibing.handlerStream;

import java.io.*;

public class InputStreamReaderDemo {
    public static void main(String[] args) {
        File file =new File("abc.txt");
        FileInputStream fileInputStream =null;
        InputStreamReader inputStreamReader = null;
        try {
            fileInputStream=new FileInputStream(file);
            inputStreamReader =new InputStreamReader(fileInputStream);
            //为什么没有用循环的方式，因为数据比较少，无法占用1024个缓存区，只需要一次读写即可
            char[] chars=new char[1024];
            int length =inputStreamReader.read(chars);
            System.out.println(new String(chars,0,length));
            inputStreamReader.read(chars);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
