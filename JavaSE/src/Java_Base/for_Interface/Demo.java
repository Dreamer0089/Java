package Java_Base.for_Interface;

/*
        接口定义
            pubic interface 接口名称 {
                //接口内容
            }

            Java7：包含 ：1.常量  2.抽象方法

            Java8：额外包含 ：3.默认方法
                             4.静态方法(不能通过接口实现类调用接口中的静态方法)
                               即可通过接口名称直接调用静态方法
            Java9：额外包含 ：5.私有方法

            接口中的
                    private修饰的   普通私有方法--只能在本接口中被调用
                                    （实现接口中默认方法代码的复用）
                    private static 修饰的  静态私有方法--只能在本接口中被调用
                                    （实现接口中静态方法的代码复用）

                    常量
                    public static final 修饰变量  （可省略）--
                                        即使省略也是默认使用（public static final）
                    命名：完全大写、多个单词则使用下划线分割
                    例：public static final int NUM_OF_MY_CLASS = 10;//num一旦赋值就不可更改

 */
public class Demo {
    public static void main(String[] args) {
        MyImplements myImplements = new MyImplements();
        myImplements.abstractMethod();

        System.out.println("===============");

        //接口中的默认方法
        myImplements.defaultMethod();
        System.out.println("===============");

        //通过接口名称直接调用静态方法
        MyInterface.staticMethod();
        System.out.println("===============");

        //实现类调用接口中的常量
        System.out.println("接口中的常量：" +MyImplements.PI);
    }
}
