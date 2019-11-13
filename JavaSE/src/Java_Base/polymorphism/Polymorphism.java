package Java_Base.polymorphism;
/*
    多态性：
        多态性的体现：父类引用指向子类对象(子类对象被当作父类对象使用)
                        父类名称 对象名 = new 子类名称();
                        接口名称 对象名 = new 实现类();
        instanceof关键字
            对象 instanceof 类
            判断该对象的类型是不是这个类，返回一个boolean值
 */
public class Polymorphism {
    public static void main(String[] args) {
        Fu obj = new Zi();

        obj.method();
        obj.methodFu();

        //对象的向上转型（安全的、正确的），就是，父类的引用指向子类
        Animal cat1 = new Cat();
        cat1.eat("鱼");
        //对象的向下转型【还原】
        //animal本来就是猫
        Animal animal = new Cat();
        //向下还原成猫
        Cat cat2 = (Cat) animal;
        cat2.catchMouse();
    }
}
