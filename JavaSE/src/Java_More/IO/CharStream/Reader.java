package Java_More.IO.CharStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

/*
        可以解决字节流读取中文乱码问题
        java.io.Reader:字符输入流所有子类的父类（抽象类）
            定义了一些共性的成员方法：
                 int read()  读取单个字符。
                 int read(char[] cbuf)  一次读取多个字符，将字符读入数组。
                 void close()  关闭该流并释放与之关联的所有资源。

        java.io.FileReader extends InputStreamReader extends Reader
        FileReader:文件字符输入流
        作用：把硬盘文件中的数据以字符的方式读取到内存中
        构造方法:
            FileReader(File file) 在给定从中读取数据的 File 的情况下创建一个新 FileReader。
            FileReader(String fileName)  在给定从中读取数据的文件名的情况下创建一个新 FileReader。
            参数：
                读取文件的数据源
                String fileName：读取文件的路径
                File file：文件
            作用：
                1.创建FileReader对象
                2.把FileReader对象指向要读取的文件
        字符输入流的使用步骤：
            1.创建FileReader对象，构造方法中绑定要读取的数据源
            2.使用FileReader对象中的方法read读取文件
            3.释放资源



 */
public class Reader {
    public static void main(String[] args) throws IOException {
        //1.创建FileReader对象，构造方法中绑定要读取的数据源
        FileReader fr = new FileReader("javase\\demo.txt");

        //2.使用FileReader对象中的方法read读取文件

        int len = 0;

        //使用    int read() 读取单个字符并返回
//        while ((len = fr.read()) != -1) {
//            System.out.println((char) len);
//        }

        //使用    int read(char[] cbuf)   一次读取多个字符
        char[] chars = new char[1024];
        while ((len = fr.read(chars)) != -1) {
            System.out.println(new String(chars,0,len));
        }

        // 3.释放资源
        fr.close();

    }
}
