package Java_More.IO.CharStream;

import java.io.FileWriter;
import java.io.IOException;

/*
        java.io.Write:字符输出流，所有字符输出流的最顶层父类、抽象类

        共性的成员方法：
            void write(int c)   写入单个字符。
            void write(char[] cbuf) 写入字符数组。
            abstract  void write(char[] cbuf, int off, int len)     写入字符数组的某一部分,off数组的开始索引,len写的字符个数。
            void write(String str)  写入字符串。
            void write(String str, int off, int len)    写入字符串的某一部分,off字符串的开始索引,len写的字符个数。
            void flush()    刷新该流的缓冲。
            void close()    关闭此流，但要先刷新它。

        java.io.FileWriter extends OutputStreamWriter extends Writer
        FileWriter:文件字符输出流
        作用：把内存中的字符数据写入到文件中
        构造方法：
            FileWriter(File file) ： 创建一个新的 FileWriter，给定要读取的File对象。
            FileWriter(String fileName) ： 创建一个新的 FileWriter，给定要读取的文件的名称。
            参数：写入数据的目的地
                String fileName：文件的路径
                File file：文件
            构造方法的作用：
                1.会创建一个FileWriter对象
                2.会根据构造方法中的传递的文件/文件路径，创建文件
                3.会把FileWriter对象指向创建好的文件

        字符输出流的使用步骤;
            1.创建FileWriter对象，构造方法中绑定要写入数据的目的地
            2.使用FileWriter中的方法write，把数据写入到内存缓冲区中（字符转换为字节的过程）
            3.使用FileWriter中的方法flush，把内存缓冲区中的数据，刷新到文件中
            4.释放资源（会先把内存缓冲区中的数据刷新到文件中）

        flush方法和close方法的区别
            flush：刷新缓冲区，流对象可以继续使用
            close：先刷新缓冲区，然后通知系统释放资源；流对象不可以在被使用

    字符流的续写：
        使用两个参数的构造方法：
            FileWriter(String fileName, boolean append)
            FileWriter(File file, boolean append)
            参数：
                String fileName、File file：写入参数的目的地
                boolean append：是否续写的开关
    字符流的换行写：
        使用换行符：
            Windows：\r\n
            Linux：/n
            mac：/r



 */
public class Writer {
    public static void main(String[] args) throws IOException {
        //1.创建FileWriter对象，构造方法中绑定要写入数据的目的地
        FileWriter fw = new FileWriter("javase\\demo.txt");
        //2.使用FileWriter中的方法write，把数据写入到内存缓冲区中（字符转换为字节的过程）
//        fw.write(97);
//        //3.使用FileWriter中的方法flush，把内存缓冲区中的数据，刷新到文件中
//        fw.flush();
//        fw.write(99);

//        char[] chars = {'a','b','c','d','d'};
////        fw.write(chars);//abcdd
//        fw.write(chars,0,4);//abcd

        fw.write("杨洋");//杨洋

        fw.write("湖北工业大学",0,3);//杨洋湖北工








        //4.释放资源（会先把内存缓冲区中的数据刷新到文件中）
        fw.close();

    }
}
