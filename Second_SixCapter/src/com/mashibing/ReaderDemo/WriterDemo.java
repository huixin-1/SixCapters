package com.mashibing.ReaderDemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 什么时候需要加flush，什么时候不加flush
 *       最保险的方式，每次在输出流关闭之前每次都flush一下，然后再关闭
 *       当某一个输出流对象中带有缓冲区的时候，就需要进行flush，不建议大家去记每个输出流的分类
 *
 *       每次先flush再close  一定没问题
 */
//会自动创建txt文件，并写进去
//如果finally中没有close  ，不会写进去，有了close，会写进去；注释掉close  加上flush也会打印
public class WriterDemo {
    public static void main(String[] args) {
        File file =new File("write.txt");
        Writer writer = null;

        try {
            writer=new FileWriter(file);
            writer.write("www.mashibing.com");
            writer.write("马士兵教育");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
