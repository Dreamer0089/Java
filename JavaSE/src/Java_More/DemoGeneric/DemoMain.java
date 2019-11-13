package Java_More.DemoGeneric;
/*
        泛型通配符：？ 可以代表任意数据类型
        使用方法：不能创建对象是使用
                  只能作为方法的参数使用

        受限泛型：
            泛型的上限限定：? extends E     代表使用的泛型只能是E类型的子类/本身
            泛型的下限限定：? super E       代表使用的泛型只能是E类型的父类/本身
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoMain {
    public static void main(String[] args) {
        //不写泛型，默认Object
        GenericClass genericClass = new GenericClass();
        genericClass.setName("123");
        System.out.println(genericClass.getName());
        System.out.println("=============");

        //将泛型确定为String
        GenericClass<String> obj1 = new GenericClass<>();
        obj1.setName("杨洋");
        System.out.println(obj1.getName());
        System.out.println("=============");

        //将泛型确定为Integer
        GenericClass<Integer> obj2 = new GenericClass<>();
        obj2.setName(123);
        System.out.println(obj2.getName());
        System.out.println("=============");

        //泛型通配符的使用
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(3);
        integers.add(4);
        printArray(integers);

        ArrayList<String> strings = new ArrayList<>();
        strings.add("乔丹");
        strings.add("科比");
        strings.add("姚明");
        strings.add("奥尼尔");
        printArray(strings);
        System.out.println("=============");

        Collection<Integer> integers1 = new ArrayList<>();
        Collection<String> strings1 = new ArrayList<>();
        Collection<Number> numbers = new ArrayList<>();
        Collection<Object> objects = new ArrayList<>();

        //类与类之间的继承关系
        //Integer extends Number extends Object
        //String extends Object
        getElement1(integers1);
        //getElement1(strings1);//报错    String类型跟Number类型没有关系
        getElement1(numbers);
        //getElement1(objects);//报错     Object类型是Number类型的父类

        //getElement2(integers1);//报错   Integer类型是Number类型的子类
        //getElement2(strings1);//报错    String类型跟Number类型没有关系
        getElement2(numbers);
        getElement2(objects);
    }

    private static void getElement2(Collection<? super Number> collection) {
    }

    private static void getElement1(Collection<? extends Number> collection) {

    }



    /*
        定义一个方法，能遍历所有类型的ArrayList集合
     */
    public static void printArray(ArrayList<?> list) {
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
    
}
