package Java_More.Stream;

import java.util.stream.Stream;

/*
    Stream流中的常用方法：forEach
    void forEach(Consumer<? super T> action)  对此流的每个元素执行操作。
    该方法接受一个Consumer接口函数，会将每一个流元素交给该函数进行处理。
    Consumer接口是一个消费型函数式接口，可以传递lambda表达式，消费数据

    forEach方法，用来遍历流中的数据
    是一个终结方法，遍历之后不能继续调用Stream流中的其他方法

 */
public class Demo_forEach {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三", "李四", "王五", "赵六", "田七");
        stream.forEach(name -> System.out.println(name));

    }
}
