package Java_More.FunctionInterface;
/*
    函数式接口：有且只有一个抽象方法的接口
        可以包含其他方法（静态方法、默认方法、私有方法）

    @FunctionalInterface
    作用：可以检测接口是否为函数式接口
        是：编译成功
        否：编译失败（接口中没有抽象方法或抽象方法不止一个）

 */
@FunctionalInterface
public interface MyFuncInterface {
    //定义一个抽象方法
     void method();
}
