package com.mashibing.Stream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class BuffreredOutputStreamDemo {
    public static void main(String[] args) {
        File file =new File("123.txt");
        FileOutputStream fileOutputStream=null;
        BufferedOutputStream bufferedOutputStream=null;

        try {
            fileOutputStream=new FileOutputStream(file);
            bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
            bufferedOutputStream.write(98);
            bufferedOutputStream.write("www.baidu.com".getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
