package com.mashibing.streamDemo;

import java.io.*;

/**
 *将abc.txt中的数据写到aaa.txt中
 */
public class CopyFile {
    public static void main(String[] args) {
        //定义源数据文件
        File src =new File("abc.txt");
        //定义目的数据文件
        File dest =new File("aaa.txt");
        //创建输入流对象
        InputStream inputStream=null;
        //创建输出流对象
        FileOutputStream outPutStream=null;

        try {
            inputStream =new FileInputStream(src);
            outPutStream=new FileOutputStream(dest);

            //带缓存的输入输出方式
            byte[] buffer = new byte[1024];//1024 随便给一个长度
            int length = 0;
            //完成数据传输
            while ((length = inputStream.read(buffer))!=-1){
                 outPutStream.write(buffer);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                outPutStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }




}
