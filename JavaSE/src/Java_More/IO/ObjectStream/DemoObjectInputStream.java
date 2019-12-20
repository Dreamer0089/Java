package Java_More.IO.ObjectStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/*
    java.io.ObjectInputStream extends InputStream
    ObjectInputStream:对象的反序列化
    作用：把文件中保存的对象，以流的方式读取出来使用

    构造方法：
        ObjectInputStream(InputStream in) 创建从指定 InputStream 读取的 ObjectInputStream。
        参数：InputStream in：字节输入流
    特有成员方法：
         Object readObject()  从 ObjectInputStream 读取对象。
    使用步骤;
        1.创建ObjectInputStream对象，构造方法中传递字节输入流
        2.使用ObjectInputStream对象中的方法readObject读取保存对象的文件
        3.释放资源
        4.使用读取出来的对象（打印）

    readObject方法声明抛出了ClassNotFoundException（class文件找不到异常）
    当不存在对象的class文件时抛出此异常
    反序列化的前提：
        1.类必须实现Serializable接口
        2.必须存在类对应的class文件

    另外，当JVM反序列化对象时，能找到class文件，但是class文件在序列化对象之后发生了修改，那么反序列化操作也会失败，抛出一个InvalidClassException异常。
    即 当类已经序列化完成，类发生类改变，反序列化时会产生InvalidClassException异常；
        类序列化完成会生成一个序列号，类进行编译时也会产生一个序列号，类发生改变，序列号也会改变，即序列号不匹配
    解决：
        手动给类添加一个序列号，使类的序列号不可变


 */
public class DemoObjectInputStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //1.创建ObjectInputStream对象，构造方法中传递字节输入流
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("javase\\person.txt"));

        //2.使用ObjectInputStream对象中的方法readObject读取保存对象的文件
        Object o = ois.readObject();

        //3.释放资源
        ois.close();

        //4.使用读取出来的对象（打印）
        System.out.println(o);
    }
}
