package com.mashibing.Stream;

import java.io.*;

public class BufferInputStreamDemo {
    public static void main(String[] args) {
        File file=new File("abc.txt");
        FileInputStream fileInputStream =null  ;
        BufferedInputStream bufferedInputStream=null    ;

        try {
            fileInputStream=new FileInputStream(file);
            bufferedInputStream=new BufferedInputStream(fileInputStream);
            int read =0;
            while ((read=bufferedInputStream.read())!=-1){
                bufferedInputStream.skip(10);
                System.out.println((char)read);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedInputStream.close();
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
