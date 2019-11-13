package Java_More.IO.ByteStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/*
    字节输出流：OutputStream
        输入输出是相对于内存来说的；读写是相对于硬盘的
        输入：从硬盘到内存，读
        输出：从内存到硬盘，写
    java.io.OutputStream    字节输出流所有类的超类
    一些子类共性的成员方法：
    public void close() 关闭此输出流并释放与此流有关的所有系统资源。
    public void flush() 刷新此输出流并强制写出所有缓冲的输出字节。
    public void write(byte[] b) 将 b.length 个字节从指定的 byte 数组写入此输出流。
    public void write(byte[] b, int off, int len) 将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
    public abstract  void write(int b) 将指定的字节写入此输出流。

    java.io.FileOutputStream extends OutputStream
    FileOutputStream：文件字节输出流
    作用：把内存中的数据写入硬盘文件中
        构造方法：
                FileOutputStream(File file) 创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
                FileOutputStream(String name)  创建一个向具有指定名称的文件中写入数据的输出文件流。
                参数： File file：目的地是一个文件
                       String name：目的地是一个路径
                作用：
                    1.创建一个FileOutputStream对象
                    2.会根据构造方法传递的文件/文件路径，创建一个空的文件
                    3.会把FileOutputStream对象指向创建好的文件

        追加写：使用两个参数的构造方法
                FileOutputStream(File file, boolean append)
                创建一个向指定 File 对象表示的文件中写入数据的文件输出流。
                FileOutputStream(String name, boolean append)
                创建一个向具有指定 name 的文件中写入数据的输出文件流。
            boolean append：追加写开关（是不是在源文件的后面继续写）
                true：创建的对象不会覆盖原文件，继续在文件的末尾追加写数据
                false：创建新文件，覆盖原文件

        换行写：
            在要写入文件的字符末尾添加换行符
                Windows:    \r\n
                Linux:      /n
                mac:        /r



        写入数据的原理（内存->硬盘）
            Java程序-->JVM-->OS-->OS调用写数据的方法-->把数据写到文件中
        字节输出流的步骤：
            1.创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
            2.调用FileOutputStream对象中的方法write，把数据写入到文件中
            3.释放资源（流使用会占用一定的内存，使用完毕释放，可以提高程序执行效率）
 */
public class OutputStream {
    public static void main(String[] args) throws IOException {

        //1.创建一个FileOutputStream对象，构造方法中传递写入数据的目的地
//        FileOutputStream fos = new FileOutputStream("F:\\test\\b.txt");
        //2.调用FileOutputStream对象中的方法write，把数据写入到文件中
        //100指的是字符的ASCII值，代表的字符是d
        //0——127，使用的是 ASCII码表
        //其他值，使用的是  GBK码表（中文系统默认码表）
        //fos.write(100);
        //3.释放资源（流使用会占用一定的内存，使用完毕释放，可以提高程序执行效率）

        /*
                public void write(byte[] b) 将 b.length 个字节从指定的 byte 数组写入此输出流。
                一次写多个字节;
                    如果写的第一个字节是正数（0-127），显示时会查询ASCII表
                    如果写的第一个字节是负数，第一个、第二个字节组成一个中文显示，查询GBK表
         */

        //byte[] b = {65,66,67,68,69,49,48,48};
        //fos.write(b);//ABCDE100

        //byte[] b = {-65,-66,-67,-68,69,49,48,48};
        //fos.write(b);//烤郊E100

        //byte[] b = {-65,-66,-67,-68,69,49,48,48};
        //fos.write(b,2,5);//郊E10

        /*
                String类中的方法;
                    String str;

         */
//        byte[] bytes = "你好！".getBytes();
//        System.out.println(Arrays.toString(bytes));
//        fos.write(bytes);

        //追加写
        FileOutputStream fos = new FileOutputStream("F:\\test\\b.txt", true);

        for (int i = 0; i < 10; i++) {
            //fos.write("你好！\r\n".getBytes());
            fos.write("你好！".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();


    }
}
