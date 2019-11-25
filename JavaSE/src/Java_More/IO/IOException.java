package Java_More.IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;

/*
    在jdk1.7之前使用try-catch-finally处理流中的异常
    格式：
        try{
            可能会出现异常的代码
        } catch (异常类 变量名) {
            异常处理逻辑
        } finally {
            一定会执行的代码
            资源释放
       }
    JDK7新特性
        在try后可以增加一个括号，在括号中定义流对象
        流对象的作用域在try中有效
        try中的代码执行完毕，会自动把流对象释放，不用再写finally
        格式：
            try(定义流对象;定义流对象...) {
                可能出现异常的代码
            } catch (异常类 变量名) {
                异常处理逻辑
            }

    JDK9的新特性
        在try前定义流对象
        在try后的（）中可以直接引入流对象的名称（变量名）
        在try代码执行完毕之后，流对象也可以释放，不用写finally
        格式：
            A a = new A();
            B b = new B();
            try(a,b){
                可能出现异常的代码
            } catch (异常类 变量名) {
                异常处理逻辑
            }
 */
public class IOException extends Throwable {
    public static void main(String[] args) throws FileNotFoundException {
        method1();
        method2();
        method3();

    }

    private static void method3() throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("F:\\test\\picture.jpg");
        FileOutputStream fos = new FileOutputStream("f:\\picture.jpg");

        try(fis;fos) {
            int len = 0;
            while ((len = fis.read()) != -1) {
                fos.write(len);
            }
        } catch (java.io.IOException e) {
            System.out.println(e);
        }

    }

    public static void method1() {
        FileWriter fw = null;
        try{
            fw = new FileWriter("javase\\demo.txt",true);
            for (int i = 0; i < 10; i++) {
                fw.write("杨洋"+i+"\r\n");
            }

        } catch (java.io.IOException e) {
            e.printStackTrace();
        } finally {

            if (fw != null) {
                try{
                    fw.close();
                } catch (java.io.IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void method2() {
        try(FileInputStream fis = new FileInputStream("F:\\test\\picture.jpg");
            FileOutputStream fos = new FileOutputStream("f:\\picture.jpg")
        ) {
            int len = 0;
            while ((len = fis.read()) != -1) {
                fos.write(len);
            }

        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
