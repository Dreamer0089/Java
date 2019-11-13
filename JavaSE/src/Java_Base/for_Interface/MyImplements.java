package Java_Base.for_Interface;

/*
        普通的实现类必须实现接口中所有的抽象方法

        如果实现类中没有实现接口中的所有的方法
        则这个实现类必须是抽象类
        即含有抽象方法的类是抽象类
 */
public class MyImplements implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("使用实现MyImplements类实现接口MyInterface！");
    }

//    @Override
//    public void defaultMethod() {
//        System.out.println("默认方法被实现类覆盖重写了！");
//    }

}
