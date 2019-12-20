package Java_More.IO.PrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/*
    java.io.PrintStream 打印流
        PrintStream 为其他输出流添加了功能，使它们能够方便地打印各种数据值表示形式。
    PrintStream特点：
        1.只负责数据的输出，不负责数据的读取
        2.与其他输出流不同，PrintStream 永远不会抛出 IOException
        3.有特有的方法： print()、println() 参数可以是任意类型
    构造方法：
        PrintStream(File file) ：输出目的地是一个文件
        PrintStream(OutputStream out)：输出的目的地是一个字节输出流
        PrintStream(String fileName) ：输出的目的地是一个文件路径

    PrintStream extends OutputStream
    继承自父类的方法：
        public void close() 关闭此输出流并释放与此流有关的所有系统资源。
        public void flush() 刷新此输出流并强制写出所有缓冲的输出字节。
        public void write(byte[] b) 将 b.length 个字节从指定的 byte 数组写入此输出流。
        public void write(byte[] b, int off, int len) 将指定 byte 数组中从偏移量 off 开始的 len 个字节写入此输出流。
        public abstract  void write(int b) 将指定的字节写入此输出流。
        注意：
            如果使用继承自父类的write的方法写数据，那么查看数据时会查询编码表 97-a
            如果使用自己特有的方法print()、println()方法写数据，写的数据就原样输出

    可以改变输出语句的目的地（打印流的流向）
    输出语句，默认在控制台输出
    使用System.setOut方法改变输出语句的目的地改为参数中传递的打印流的目的地
            static void setOut(PrintStream out)
            重新分配“标准”输出流
 */
public class DemoPrintStream {
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println("控制台输出！");

        //创建打印流PrintStream对象，构造方法中绑定要输出的目的地
        PrintStream ps = new PrintStream("javase\\print.txt");

        //如果使用继承自父类的write的方法写数据，那么查看数据时会查询编码表 97-a
        ps.write(97);//a
        //如果使用自己特有的方法print()、println()方法写数据，写的数据就原样输出
        ps.println(97);//97

        System.setOut(ps);//把输出流的目的地改变为打印流的目的地
        System.out.println("在打印流的目的地中输出！");

        //释放资源
        ps.close();

    }
}
