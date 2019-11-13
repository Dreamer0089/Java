package Java_Base.method;

/**
 *方法定义
 * 定义与调用的前后顺序无所谓
 * 几个方法的定义需要并列，不能在一个方法定义的内部去定义另一个方法
 *
 * 方法就是若干语句的集合
 *
 * 参数 ：进入方法的数据
 * 返回值 ：从方法中出来的数据
 *
 * 方法定义的完整格式
 * 修饰符 返回值类型 方法名称（参数类型 参数一，参数类型 参数二，...） {
 *     方法体（若干语句）
 *     return 返回值；
 * }
 *
 * 修饰符：public private protected static
 * 返回值类型：方法最后产生参数的类型
 * 参数类型：进入方法的数据的类型
 * 参数名称：进入方法的变量的名称
 * return：1.停止当前方法
 *         2.返回方法最终产生的数据
 *          返回值需与返回值类型一致
 *
 * 方法调用格式
 *      1.单独调用
 *      2.打印调用，即将结果打印输出
 *      3.赋值调用，将结果赋值给一个变量
 *      void方法只能单独调用
 */
public class MethodSimpleDefine {
    public static void main(String[] args) {
        System.out.println(Sum(3,4));
        System.out.println("1+2+3+...+100= "+getHundredSum());
        PrintHelloWorld(6);
    }
    public static int Sum(int a,int b ) {
        return a+b;
    }

    //  题目1：定义一个方法，求1-100之间所有整数的和
    public static int getHundredSum() {
        int sum = 0;
        for (int i = 1 ;i <= 100;i++) {
            sum += i;
        }
        return sum;
    }
    //打印指定次数的helloworld
    public static void  PrintHelloWorld(int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Hello World!!" + (i + 1));
        }
    }
}
