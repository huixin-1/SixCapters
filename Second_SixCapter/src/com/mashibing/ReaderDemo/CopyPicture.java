package com.mashibing.ReaderDemo;

import java.io.*;

/**
 * 字节流可以出里所有文件
 * 处理纯文本可以用字符流
 *
 *
 */

public class CopyPicture {
    public static void main(String[] args) {
        /*
        //运行后会出现2.jpg， 但是图片不能打开

        FileReader reader = null;
        FileWriter writer=null;

        try {
            reader=new FileReader("1.jpg");
            writer=new FileWriter("2.jpg");

            int length = 0;
            char[] chars =new char[1024];

            while ((length=reader.read(chars))!=-1){
                writer.write(chars);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


        */
        FileInputStream fileInputStream=null;
        FileOutputStream fileOutputStream=null;

        try {
            fileInputStream=new FileInputStream("1.jpg");
            fileOutputStream=new FileOutputStream("3.jpg");
            int length = 0;
            byte[] buffer =new byte[1024];

            while ((length=fileInputStream.read(buffer))!=-1){
                fileOutputStream.write(buffer);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fileOutputStream.close();
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
