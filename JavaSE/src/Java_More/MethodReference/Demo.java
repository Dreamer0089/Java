package Java_More.MethodReference;

import java.sql.SQLOutput;

/*

 */
public class Demo {

    public static void printString(Printable p) {
        p.print("hello world1");
    }

    public static void main(String[] args) {
        //lambda表达式
        printString(s -> System.out.println(s));
        //方法引用
        printString(System.out::println);

    }
}
