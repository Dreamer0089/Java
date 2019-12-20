package Java_More.IO.Buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
        java.io.BufferedInputStream extends InputStream
        BufferedInputStream：字节缓冲输入流

        继承父类的成员方法：
            int read() 从此输入流中读取下一个数据字节。
            int read(byte[] b) 从此输入流中将 byte.length 个字节的数据读入一个 byte 数组中。
            void close()  关闭此输入流并释放与此流关联的所有系统资源。
        构造方法：
            BufferedInputStream(InputStream in) 创建一个 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
            BufferedInputStream(InputStream in, int size) 创建具有指定缓冲区大小的 BufferedInputStream 并保存其参数，即输入流 in，以便将来使用。
            参数：
                InputStream in：字节输出流
                            可以传递FileInputStream，缓冲流会给FileInputStream增加一个缓冲区，提高FileInputStream的读取效率
                int size：指定缓冲流内部缓冲区的大小，不指定就使用默认的大小
        使用步骤：
            1.创建FileInputStream对象，构造方法中绑定要读取的数据源
            2.创建BufferedInputStream对象，构造方法中传递FileInputStream流对象，提高FileFileInputStream读取的效率
            3.使用BufferedInputStream对象中的方法read，读取文件
            4.释放资源
 */
public class InputStream {
    public static void main(String[] args) throws IOException {
        //1.创建FileInputStream对象，构造方法中绑定要读取的数据源
        FileInputStream fis = new FileInputStream("javase\\buffered.txt");
        //2.创建BufferedInputStream对象，构造方法中传递FileInputStream流对象，提高FileFileInputStream读取的效率
        BufferedInputStream bis = new BufferedInputStream(fis);
        //3.使用BufferedInputStream对象中的方法read，读取文件
        int len = 0;
        while ((len = bis.read()) != -1) {
            System.out.print((char)len);
        }


        //4.释放资源
        bis.close();
    }
}
