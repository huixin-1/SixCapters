package com.mashibing.io;

import java.io.File;
import java.io.IOException;

/*
File提供了对当前文件系统中文件的部分操作
 */
public class FileDemo {
    public static void main(String[] args) {
      /*  File file=new File("src/abc.txt");
        //创建文件
        try{
            file.createNewFile();
        }catch (IOException e){
            e.printStackTrace();
        }



        //判断文件的属性，都会返回Boolean类型的值
        //执行
        file.canExecute();
        //读
        file.canRead();
        //写
        file.canWrite();


        //判断当前文件是否存在
        System.out.println(file.exists());


        //获取文件的名称
        System.out.println(file.getName());
        //获取文件的绝对路径
        System.out.println(file.getAbsolutePath());


        //获取文件的父路径的的名称，如果文件路径中只包含文件名称，则显示空
        System.out.println(file.getParent());

        //返回父类的绝对路径的规范形式
        //System.out.println(file.getCanonicalPath());

        //返回操作系统的文件分割符
        System.out.println(File.separator);




//      无论当前文件是否存在，只要给定具体路径，都可以返回相应的路径名称
        File file2=new File("d:/mashibing.txt");
        System.out.println(file2.getAbsolutePath());

        //判断文件是否是文件或者目录
        System.out.println(file2.isDirectory());
        System.out.println(file2.isFile());


        String[] list = file2.list();

        for (String str:list){
            System.out.println(list.toString());
        }

        System.out.println("-------");

        File[] files=file2.listFiles();

        for (File f : files){
            System.out.println(f);
        }








        //打印当前系统的所有盘符
        File[] files1 = file.listRoots();
        for (int i=0;i<files1.length;i++){
            System.out.println(files1[i]);
        }



        //创建单级目录

        file2.mkdir();

        //创建多级目录
        file2.mkdirs();





        //循环遍历输出C盘中所有文件的绝对路径
        //使用递归的方式


        printFile(new File("c:/a/b/c"));


    }*/

    /*

    文件在遍历的时候，会出现空指针的问题，原因在于当前文件系统受保护，某些文件没有访问权限，此时会报空指针异常



     */


/*
    public static void printFile(File file){
        if (file.isDirectory()){
            File[] files = file.listFiles();

            for (File f:files){
                printFile(f);
            }

        }else {
            System.out.println("此文件是一个具体的文件，只有一个文件名称");
            System.out.println(file.getAbsolutePath());
        }*/
    }

}
