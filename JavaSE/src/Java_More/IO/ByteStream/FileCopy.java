package Java_More.IO.ByteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
    文件复制练习：一读一写
        明确：
            数据源：
            数据目的地：
        文件复制步骤：
            1.创建一个字节输入流对象，构造方法中绑定要读取的数据源
            2.创建一个字节输出流对象，构造方法中绑定要写入的目的地
            3.使用字节输入流对象中的方法read读取文件
            4.使用字节输出流对象中的方法write，把读取到的文件写入到目的地文件中
            5.释放资源

 */
public class FileCopy {
    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();
        //1.创建一个字节输入流对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("F:\\test\\picture.jpg");

        //2.创建一个字节输出流对象，构造方法中绑定要写入的目的地
        FileOutputStream fos = new FileOutputStream("f:\\picture.jpg");


        //3.使用字节输入流对象中的方法read读取文件
        //4.使用字节输出流对象中的方法write，把读取到的文件写入到目的地文件中
//        int len = 0;
//        while ((len = fis.read()) != -1) {
//            fos.write(len);
//        }

        //使用字节数组缓冲读取多个字节，写入多个字节
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }
        //5.释放资源    先关闭写、后关闭读（写完了就意味着读完了）
        fos.close();
        fis.close();

        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}

