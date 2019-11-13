package Java_More.DemoGeneric;
/*
    含有泛型的方法：泛型定义在修饰符与返回值之间
    格式：
        修饰符 <泛型> 返回值类型 方法名（参数列表） {
            方法体;
        }
 */
public class GenericMethod {
    public static void main(String[] args) {
        genericMethod1("杨洋");
        genericMethod1(123);

    }

    private static <E> void genericMethod1(E e) {
        System.out.println(e.getClass() + e.toString());
    }
}
