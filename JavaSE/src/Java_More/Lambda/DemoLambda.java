package Java_More.Lambda;
/*
        Lambda标准格式：
            三部分：一些参数、一个箭头、一段代码
            格式：(参数列表) -> {重写方法的代码}
            说明：
                ():接口中抽象方法的参数列表，有就写，没有就空，多个参数用逗号分隔
                ->:传递，将参数传递给{}
                {}:重写接口抽象方法的方法体

        Lambda表达式：可推导的可省略
            凡是根据上下文推导出来的内容，都可以省略不写
            可以省略的内容;
                1.(参数列表)：括号中参数列表的数据类型，可以省略不写
                2.(参数列表)：括号中的参数只有一个，那么类型和()都可省略
                3.{一些代码}：如果{}中只有一行代码，无论是否有返回值，都可以省略（{}、;、return）
                                注意：要省略{}、;、return 必须一起省略
    Lambda表达式使用前提:
        1.使用Lambda必须具有接口，且要求接口中有且仅有一个抽象方法。
        2.使用Lambda必须具有上下文推断。

        备注：有且仅有一个抽象方法的接口，称为“函数式接口”。
 */
public class DemoLambda {
    public static void main(String[] args) {
        //使用匿名内部类实现多线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName() + "新线程被创建！");
            }
        }).start();
        //使用lambda表达式实现多线程
        new Thread(()->{
            System.out.println(Thread.currentThread().getName() + "新线程被创建！");
        }).start();

        //lambda的更优写法
        new Thread(()-> System.out.println(Thread.currentThread().getName() + "新线程被创建！")).start();
    }
}
