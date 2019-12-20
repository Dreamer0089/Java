package Java_More.IO.Buffered;

import java.io.*;

/*
        文件复制：先读后写
        明确：
            数据源：f:\picture.jpg
            目的地：F:\test\picture.jpg
        文件复制步骤：
            1.创建字节缓冲输入流对象，构造方法中传递字节输入流
            2.创建字节缓冲输出流对象，构造方法中传递字节输出流
            3.使用字节缓冲输入流中的方法read，读取文件
            4.使用字节缓冲输出流中的方法write，把读取的数据写入到内部缓冲区中
            5.释放资源（会把缓冲区中的数据刷新到文件中）
 */
public class FileCopy {
    public static void main(String[] args) throws IOException {
        long begin = System.currentTimeMillis();

        //1.创建字节缓冲输入流对象，构造方法中传递字节输入流
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("f:\\picture.jpg"));

        //2.创建字节缓冲输出流对象，构造方法中传递字节输出流
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("F:\\test\\picture.jpg"));

        //3.使用字节缓冲输入流中的方法read，读取文件
        //4.使用字节缓冲输出流中的方法write，把读取的数据写入到内部缓冲区中
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read()) != -1) {
            bos.write(bytes,0,len);
        }
        //5.释放资源
        bos.close();
        bis.close();

        long end = System.currentTimeMillis();
        System.out.println("复制文件耗时：" + (end - begin) + "毫秒。");
    }
}
