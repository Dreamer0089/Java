package Java_More.IO.TransformStream;

/*
    java.io.OutputStreamWriter extends Writer
    OutputStreamWriter:是字符流通向字节流的桥梁：可以使用指定的charset 将要写入流中的字符编码成字节（编码：将人能看懂的翻译成计算机能看懂的）

    继承自父类的共性的成员方法;
            void write(int c)   写入单个字符。
            void write(char[] cbuf) 写入字符数组。
            abstract  void write(char[] cbuf, int off, int len)     写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
            void write(String str)  写入字符串。
            void write(String str, int off, int len)    写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
            void flush()    刷新该流的缓冲。
            void close()    关闭此流，但要先刷新它。
    构造方法：
            OutputStreamWriter(OutputStream out)    创建使用默认字符编码的 OutputStreamWriter。
            OutputStreamWriter(OutputStream out, String charsetName)  创建使用指定字符集的 OutputStreamWriter。
            参数：
                OutputStream out：字节输出流，可以用来写转换之后的字节到文件中
                String charsetName：指定的编码表的名称，不区分大小写，可以是“utf-8/UTF-8、gbk/GBK...” 不指定时，默认为utf-8

    使用步骤：
        1.创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表
        2.使用OutputStreamWriter对象中的方法write，把字符转换为字节存储缓冲区（编码过程）
        3.使用OutputStreamWriter对象中的方法flush，把内存缓冲区中的字节刷新到文件中（使用字节流写字节的过程）
        4.释放资源




 */

import java.io.*;

public class DemoOutputStreamWriter {
    public static void main(String[] args) throws IOException {
        write_utf_8();
        write_gbk();
    }

    /*
        使用转换流OutputStreamWriter写GBK格式的文件

     */
    private static void write_gbk() throws IOException{
        //1.创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("javase\\gbk.txt"), "gbk");

        //2.使用OutputStreamWriter对象中的方法write，把字符转换为字节存储缓冲区（编码过程）
        osw.write("你好");

        //3.使用OutputStreamWriter对象中的方法flush，把内存缓冲区中的字节刷新到文件中（使用字节流写字节的过程）
        osw.flush();

        //4.释放资源
        osw.close();
    }

    /*
        使用转换流OutputStreamWriter写UTF-8格式的文件
     */
    private static void write_utf_8() throws IOException {
        //1.创建OutputStreamWriter对象，构造方法中传递字节输出流和指定的编码表
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("javase\\utf-8.txt"), "utf-8");

        //2.使用OutputStreamWriter对象中的方法write，把字符转换为字节存储缓冲区（编码过程）
        osw.write("你好");

        //3.使用OutputStreamWriter对象中的方法flush，把内存缓冲区中的字节刷新到文件中（使用字节流写字节的过程）
        osw.flush();

        //4.释放资源
        osw.close();
    }
}
