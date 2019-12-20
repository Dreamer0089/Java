package Java_More.Stream;

import java.util.stream.Stream;

/*
    Stream流中的常用方法：filter:用于对Stream流中的数据进行过滤
    void filter(Predicate<? super T> predicate)
    filter方法接受一个Predicate接口函数，会将每一个流元素交给该函数进行处理。
    Predicate接口是一个消费型函数式接口，可以传递lambda表达式，消费数据
    Predicate中的抽象方法：
        boolean test(T t)
 */
public class Demo_filter {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张无忌", "张三丰", "张翠山", "宋远桥", "殷梨亭", "狄仁杰");
        Stream<String> stream1 = stream.filter((String name) -> {
            return name.startsWith("张");
        });
        stream1.forEach(name-> System.out.println(name));

    }
}
