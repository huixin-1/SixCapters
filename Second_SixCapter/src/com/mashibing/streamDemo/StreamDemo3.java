package com.mashibing.streamDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class StreamDemo3 {
    public static void main(String[] args) {
        InputStream inputStream=null;
        try {
            inputStream=new FileInputStream("abc.txt");
            int length = 0;
            //添加缓冲区的方式进行读取，每次会将数据添加到缓冲区中，将缓冲区满了之后一次读取，而不是每一次一个字节进行读取
            byte[] buffer = new byte[1024];

            while((length = inputStream.read(buffer))!=-1){
                System.out.println(new String(buffer,0,length));
            }



            //    int read = inputStream.read();
            //    System.out.println((char)read);




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
