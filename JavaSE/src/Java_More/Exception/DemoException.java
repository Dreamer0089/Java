package Java_More.Exception;

import javax.swing.plaf.ViewportUI;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    java.lang.Throwable:是所有Java语言中所有错误或异常的超类
        Exception：编译期异常：写代码时出现的问题
            RuntimeException：运行期气场，Java程序运行时出现的问题
            异常可以被处理
        Error：错误，无法被处理，必须修改源码

    异常产生过程的解析，分析异常是怎么产生的，如何处理

    throw关键字
        作用：使用throw关键字在指定的方法中抛出指定的异常
        使用格式：
            throw new xxxException（“产生异常的原因”）
        注意事项：
            1.必须写在方法的内部；
            2.throw关键字new的对象必须是Exception后者Exception的子类对象
            3.throw关键字抛出指定的异常对象，必须处理这个异常
                throw关键字创建的是RuntimeException或者是RuntimeException的子类对象，可以不处理
                throw创建的是编译异常，必须处理。要么throws、要么try-catch
    throws关键字：处理异常的第一种方式，交给别人处理
        作用：
            当方法内部抛出异常对象的是由，必须处理这个异常对象
            当使用throws关键字处理异常类对象，会把异常对象声明抛出给方法的调用者（自己不处理，交给别人处理），最终交给JVM处理 -> 中断处理
        使用格式：在方法声明时使用
            修饰符 返回值类型 方法名（参数列表） throws XXXException，XXXException {
                throw new XXXException("产生原因");
                throw new XXXException("产生原因");
            }
        注意：
            1.throws关键字必须写在方法声明处
            2.throws关键字后边声明的异常必须时Exception或者是Exception的子类
            3.方法内部如果抛出了多个异常对象，则throws后必须声明多个异常对象
                如果抛出的多个异常对象有父子类关系，直接声明父类异常即可
            4.调用了声明抛出异常的方法，就必须处理声明的异常
                a.使用throws声明抛出，给方法的调用者（自己不处理，交给别人处理），最终交给JVM处理 -> 中断处理
                b.try...catch处理异常
    try...catch:异常处理的第二种方式，自己处理异常
        格式：
            try{
                可能产生异常的代码
            } catch(定义一个异常变量，用来接受try中抛出的异常对象) {
                异常的处理逻辑，定义异常对象之后，怎样处理异常
                一般会把异常的信息记录到日志中
            }
            ...catch(异常类 变量名) {

            }

        注意：
            1.try中可能抛出多个异常对象，可以使用多个catch来处理这些异常对象
            2.  如果try中产生了异常，则会执行catch中的异常处理逻辑，执行完毕catch中的处理逻辑，继续执行try...catch之后的代码
                如果try中没有产生异常，就不会执行catch中的异常处理逻辑，继续执行try...catch之后的代码

    Throwable类中异常处理方法：
        public String getMessage();获取异常的简短信息
        public String toString();获取异常的详细信息
        public void printStackTrace();JVM打印异常对象，默认调用此方法，异常信息最全面

    finally代码块
        格式：
            try{
                可能产生异常的代码
            } catch(定义一个异常变量，用来接受try中抛出的异常对象) {
                异常的处理逻辑，定义异常对象之后，怎样处理异常
                一般会把异常的信息记录到日志中
            }
            ...catch(异常类 变量名) {

            } finally {
                无论是否出现异常都会执行
            }
        注意：
            1，finally代码块不能单独使用，一般于try...catch一起使用
            2.finally一般用于资源释放（资源回收）



 */
public class DemoException {
    /*
        FileNotFoundException 是 IOException的子类
        即只声明IOException
     */
    public static void main(String[] args) throws IOException {
//        int[] arr = null;
//        System.out.println(getElement(arr, 0));

        try{
            readFile("d:\\a.txt");
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        } finally {
            System.out.println("资源释放！");
        }

    }
    public static int getElement(int[] arr,int index) {
        if (arr == null) {
            throw new NullPointerException("数组为空！");
        }
        if (index < 0 || index >arr.length - 1) {
            throw new ArrayIndexOutOfBoundsException("数组索引越界");
        }
        return arr[index];
    }

    public static void readFile(String fileName) throws IOException {
        //传递的文件名不是“c:\\a.txt” 处理异常
        if(!fileName.equals("c:\\a.txt")) {
            throw new FileNotFoundException("文件找不到!");
        }
        //文件的后缀名不是“.txt” 处理异常
        if(!fileName.endsWith(".txt")) {
            throw new IOException("文件的后缀名不是.txt!");
        }
        System.out.println("路径没有问题，读取文件。");
    }

}
