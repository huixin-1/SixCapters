package com.mashibing.Stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {
    public static void main(String[] args) {

        FileOutputStream fileOutputStream=null;
        ObjectOutputStream objectOutputStream =null;

        try {
            fileOutputStream =new FileOutputStream("abc.txt");
            objectOutputStream=new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeUTF("www.mashibing.com");
            objectOutputStream.writeObject(new Person(1,"zhangsan","123456"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
