package Java_Base.for_Interface;

/*
    在任何版本的Java中，接口都能定义抽象方法

    接口中的抽象方法，修饰符必须是两个固定的关键字：public abstract （可省略）

    接口中
        1.不能有静态代码块、也不能有构造方法；
        2.一个实现类可以同时实现多个接口；
            例：
                public class MyImpl Implements MyInterfaceA,MyInterfaceB {}
        3.如果两个接口中有相同的抽象方法，则在实现类中只覆盖重写一次；
        4.如果实现类中没有覆盖重写所有接口中所有的抽象方法，则该实现类必须是抽象类；
        5.如果实现类所实现的接口中存在重复的默认方法，则实现类一定要对冲突的默认方法覆盖重写；
        6.如果实现类的父类中的方法与接口中的默认方法冲突，优先使用父类中的方法；

    类、接口之间的关系
        1.类与类之间的是单继承、即一个类只有一个直接父类
        2.类与接口之间是多实现的、即一个类可以实现多个接口
        3.接口与接口之间是多继承的
        注意：
            1.多个父接口中的抽象方法可以重复
            2.多个父接口中的默认方法如果重复，则子接口必须进行默认方法的覆盖重写

 */
public interface MyInterface {

    //常量
    public static final double PI = 3.14;

    //抽象方法
    public abstract void abstractMethod();

    //默认方法
    public default void defaultMethod() {
        System.out.println("接口中的默认方法");
        privateDefaultMethod();
    }

    //静态方法
    public static void staticMethod() {
        System.out.println("接口中的静态方法");
        privateStaticMethod();
    }

    //私有方法 :私有的默认方法、私有的静态方法

    private void privateDefaultMethod() {
        System.out.println("接口中私有的默认方法！");
        System.out.println("接口中公用代码1");
        System.out.println("接口中公用代码2");
        System.out.println("接口中公用代码3");
    }
    private static void privateStaticMethod() {
        System.out.println("接口中私有的静态方法！");
        System.out.println("接口中公用代码4");
        System.out.println("接口中公用代码5");
        System.out.println("接口中公用代码6");
    }

}
