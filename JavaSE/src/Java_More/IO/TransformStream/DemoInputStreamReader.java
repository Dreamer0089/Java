package Java_More.IO.TransformStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    java.io.InputStreamReader extends Reader
    InputStreamReader: 是字节流通向字符流的桥梁：它使用指定的 charset 读取字节并将其解码为字符(解码：将计算机能看懂的转换成人能看懂的)。

    继承自父类的共性成员方法：
            int read()  读取单个字符。
            int read(char[] cbuf)  一次读取多个字符，将字符读入数组。
            void close()  关闭该流并释放与之关联的所有资源。
    构造方法：
        InputStreamReader(InputStream in) 创建一个使用默认字符集的 InputStreamReader。
        InputStreamReader(InputStream in, String charsetName)  创建使用指定字符集的 InputStreamReader。
        参数：
            InputStream in：字节输入流，用来读取文件中保存的字节
            String charsetName：指定的编码表的名称，不区分大小写，可以是“utf-8/UTF-8、gbk/GBK...” 不指定时，默认为utf-8
    使用步骤：
        1.创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
        2.使用InputStreamReader对象中的方法read读取文件
        3.释放资源
        注意：
            构造方法中指定的编码表名称要和文件的编码相同，否则会乱码

    案例：转换文件编码
            将GBK编码的文本文件，转换为UTF-8编码的文本文件。
        分析：
            1. 指定GBK编码的转换流，读取文本文件。
            2. 使用UTF-8编码的转换流，写出文本文件



 */
public class DemoInputStreamReader {
    public static void main(String[] args) throws IOException {
        read_utf_8();
        read_gbk();
    }

    private static void read_gbk() throws IOException{
        //1.创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
        InputStreamReader isr = new InputStreamReader(new FileInputStream("javase\\gbk.txt"),"gbk");

        //2.使用InputStreamReader对象中的方法read读取文件
        int len = 0;
        while ((len = isr.read()) != -1) {
            System.out.print((char) len);
        }

        //3.释放资源
        isr.close();
    }

    /*
        使用InputStreamReader读取UTF-8格式的文件
     */
    private static void read_utf_8() throws IOException {

        //1.创建InputStreamReader对象，构造方法中传递字节输入流和指定的编码表名称
        InputStreamReader isr = new InputStreamReader(new FileInputStream("javase\\utf-8.txt"), "utf-8");

        //2.使用InputStreamReader对象中的方法read读取文件
        int len = 0;
        while ((len = isr.read()) != -1) {
            System.out.print((char) len);
        }

        //3.释放资源
        isr.close();

    }
}
