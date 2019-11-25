package Java_More.IO.ByteStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

/*
    java.io.InputStream:字节输入流
        表示字节输入流的所有类的超类。

        定义了所有子类的共性方法：
            int read():从输入流中读取数据的下一个字节。
            一次读取一个字节

            int read(byte[] b):从输入流中读取一定数量的字节，并将其存储在缓冲区数组 b 中。
            一次读取多个字节
            1.byte[] 的作用：
                存储一次读取的多个字节的数据，起到缓冲的作用
                大小一般定义为1024或1024的整数倍，即大小一般定义为n个KB
            2.返回值int：返回读取的有效字节个数

            void close():关闭此输入流并释放与该流关联的所有系统资源。

        java.io.FileInputStream extends InputStream
            FileInputStream 文件字节输出流
            作用：把硬盘文件中的数据读取到内存中使用
            构造方法：
                FileInputStream(File file)  通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的 File 对象 file 指定。
                FileInputStream(String name)    通过打开一个到实际文件的连接来创建一个 FileInputStream，该文件通过文件系统中的路径名 name 指定。
                参数：读取文件的数据源
                    String name：文件的路径
                    File file：文件
                作用：
                    1.创建一个FileInputStream对象
                    2.会把FileInputStream对象指定到构造方法的要读取的文件

            读取数据的原理（硬盘-->内存）
                java程序-->JVM-->OS-->OS读取数据的方法-->读取文件

            字节输入流的使用步骤：
                1.创建FileInputStream对象，构造方法中绑定要读取的数据源
                2.使用FileInputStream对象中的方法read，读取文件
                3.释放资源
 */
public class InputStream {
    public static void main(String[] args) throws IOException {

        //1.创建FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("JavaSE\\demo.txt");

        //2.使用FileInputStream对象中的方法read，读取文件
        //int read() 读取文件中的一个字节并返回，同时将指针后移一位，读取到文件的末尾返回-1
//        System.out.println(fis.read());
//        System.out.println(fis.read());
//
//        System.out.println(fis.read());
//        System.out.println(fis.read());


        /*
                布尔表达式：
                    (len = fis.read()) != -1
                    1.fis.read():读取一个字节
                    2.len = fis.read()：把读取到的字节赋值给len
                    3.(len = fis.read()) != -1：判断len是否不等于-1 即判断是否没有到末尾
         */
//        int len = 0;
//        while ((len = fis.read()) != -1) {
//            System.out.println((char) len);
//        }

        byte[] bytes = new byte[1024];
        int len = 0;//
        while ((len = fis.read(bytes)) != -1) {
            System.out.println(new String(bytes,0,len));
        }

        //3.释放资源
        fis.close();

    }
}
