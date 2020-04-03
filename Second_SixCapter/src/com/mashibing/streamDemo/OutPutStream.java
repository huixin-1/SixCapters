package com.mashibing.streamDemo;

import java.io.*;
//本来没有aaa文件 ，运行完了之后就会出现aaa文件
public class OutPutStream{
    public OutPutStream(File dest) {
    }

    public static void main(String[] args) {

        File file=new File("aaa.txt");
        OutputStream outputStream=null;
        try {
            outputStream = new FileOutputStream(file);
            outputStream.write(99);
            outputStream.write("mashibing".getBytes());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            try {
                outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }


}
