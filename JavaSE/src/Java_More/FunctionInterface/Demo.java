package Java_More.FunctionInterface;

/*
    函数式接口的使用：一般可以作为方法的参数和返回值类型
 */
public class Demo {
    public static void show(MyFuncInterface myInter) {
        myInter.method();
    }

    public static void main(String[] args) {
        show(new MyFuncInterfaceImpl());

        show(new MyFuncInterface() {
            @Override
            public void method() {
                System.out.println("使用匿名内部类重写接口中的方法！");
            }
        });

        show(()-> System.out.println("使用lambda表达式重写接口中的抽象方法！"));

    }

}
