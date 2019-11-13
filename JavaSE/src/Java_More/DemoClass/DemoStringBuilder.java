package Java_More.DemoClass;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

/*
        字符串是常量；它们的值在创建之后不能更改。
        字符串缓冲区支持可变的字符串。
        字符串缓冲区：可以提高字符串的操作效率
            可以被看成一个长度可以变化的字符串
        StringBuilder类
            常用方法
                //参数可为任意类型，返回当前对象自身
                public StringBuilder append(...);

                //用于StringBuilder与String相互转化
                public String toString()

 */
public class DemoStringBuilder {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder();
        System.out.println(str1);

        StringBuilder str2 = new StringBuilder("ABC");
        System.out.println(str2);
        System.out.println("=============");

        //使用append()方法
        System.out.println(str2.append("def"));
        System.out.println(str2.append(12345));
        System.out.println(str2.append(123).append("杨洋"));
        System.out.println("=============");

        //使用toString()方法
        String str3 = "hello";
        //String->StringBuilder
        StringBuilder str4 = new StringBuilder(str3);
        System.out.println(str4.getClass().toString()+ ":" + str4.append("world!"));
        System.out.println("=============");

        //StringBuilder->String
        String str5 = str4.toString();
        System.out.println(str5.getClass()+ ":" +str5);

    }

}
