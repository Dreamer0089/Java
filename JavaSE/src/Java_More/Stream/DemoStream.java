package Java_More.Stream;

import java.lang.invoke.VarHandle;
import java.util.*;
import java.util.stream.Stream;

/*
    java.util.stream.Stream<T>是Java8新加入的流接口
    获取一个流的方式：
        Collection集合可以通过stream默认方法获取流
            default Stream<E> stream()
        Stream接口的静态方法of可以获取数组对应的流
            static <T> Stream<T> of(T...values)
            参数是一个可变参数，可以传递一个数组

    Stream流属于管道流，只能被使用一次
        第一个Stream流调用完毕方法，数据就会流转到下一个Stream上
        此时，第一个Stream流使用完毕，会关闭
        即第一个Stream流不能再调用方法


 */
public class DemoStream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        Map<String,String> map = new HashMap<>();
        //获取键，存储到set中
        Set<String> keySet = map.keySet();
        Stream<String> stream3 = keySet.stream();
        //获取值
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();

        //获取键值对
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entries.stream();

        //把数组转换为Stream流
        Stream<Integer> stream6 = Stream.of(1, 2, 3, 45, 6, 3);

        Integer[] arr1 = {1,23,4,5,5};
        Stream<Integer> stream7 = Stream.of(arr1);

        String[] arr2 = {"1","2"};
        Stream<String> stream8 = Stream.of(arr2);

    }
}
