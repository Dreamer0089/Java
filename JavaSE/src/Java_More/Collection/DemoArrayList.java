package Java_More.Collection;

import java.util.ArrayList;
import java.util.Iterator;

/*
        java.util.list接口 extends Collection接口
        List接口的特点：
            1.有序，存取顺序一致（存123，取123）
            2.有索引，包含一些带索引的方法
            3.允许有重复的元素
          带索引的方法（List特有的）：
                public boolean add(int index, E element);将指定的元素添加到集合指定的位置
                public E remove(int index);移除列表中指定位置的元素
                public E get(int index);返回集合中指定位置的元素
                public E set(int index, E element);有指定元素替换指定位置的元素
                注意：所有越界异常
 */
public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");

        System.out.println(strings);

        //在c、d之间插入一个字符串
        strings.add(3,"杨洋");
        System.out.println(strings);

        //删除c
        System.out.println(strings.remove(2));
        System.out.println(strings);

        //替换第一个a为A
        strings.set(0,"A");
        System.out.println(strings);
        System.out.println("==========");

        //遍历列表
        //普通for循环
        System.out.println("普通for循环");
        for (int i = 0; i < strings.size(); i++) {
            System.out.print(strings.get(i) + " ");
        }
        //迭代器遍历
        System.out.println();
        System.out.println("迭代器遍历");
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }

        //增强for循环
        System.out.println();
        System.out.println("增强for循环");
        for(String s:strings) {
            System.out.print(s + " ");
        }
    }
}
