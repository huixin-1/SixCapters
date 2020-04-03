package com.mashibing.Stream;

import java.io.*;

public class DataDemp {
    public static void main(String[] args) {
        FileInputStream fileInputStream =null  ;
        DataInputStream dataInputStream=null;
        DataOutputStream dataOutputStream=null;
        FileOutputStream fileOutputStream=null;


        try {
            //***注意，在写数据的时候是一个什么样的数据顺序，读的时候就是一个什么样的数据顺序
            //像文件中写数据流
            fileOutputStream=new FileOutputStream("abc.txt");
            dataOutputStream=new DataOutputStream(fileOutputStream);
            dataOutputStream.writeBoolean(true);
            dataOutputStream.writeInt(123);
            dataOutputStream.writeShort(344);
            dataOutputStream.writeDouble(3.14);

            //从文件中读取数据流
            fileInputStream=new FileInputStream("abc.txt");
            dataInputStream=new DataInputStream(fileInputStream);
            System.out.println(dataInputStream.readBoolean());
            System.out.println(dataInputStream.readInt());
            System.out.println(dataInputStream.readShort());
            System.out.println(dataInputStream.readDouble());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
