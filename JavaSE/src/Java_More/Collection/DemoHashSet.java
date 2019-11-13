package Java_More.Collection;

import java.util.HashSet;
import java.util.Iterator;

/*
    java.util.Set接口 extends Collection接口
    Set接口的特点：
        1.不允许有重复的元素
        2.没有索引，没有带索引的方法，不能使用for循环遍历
    java.util.HashSet集合 implement Set集合
    HashSet接口的特点：
        1.不允许有重复的元素
        2.没有索引，没有带索引的方法，不能使用for循环遍历
        3.无序的集合，存取顺序可能不一致
        4.底层是哈希表结构（查询速度快）

    哈希值：十进制整数，由系统随机给出（对象的逻辑地址，不是物理地址）
        在Object类中有hashCode()方法返回对象的哈希值
        特例：（巧合）
            "重地".hashCode()     1179395
            "通话".hashCode()     1179395

 */
public class DemoHashSet {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("科比");
        strings.add("科比");
        strings.add("姚明");
        strings.add("乔丹");

        //使用迭代器遍历set集合
        Iterator<String> iterator = strings.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //使用增强for循环遍历
        for (String s : strings) {
            System.out.println(s);
        }

        //hashCode()方法
        Person person1 = new Person();
        System.out.println(person1.hashCode());
        Person person2 = new Person();
        System.out.println(person2.hashCode());

        System.out.println("重地".hashCode());
        System.out.println("通话".hashCode());

        System.out.println("==============");
        //在Set中添加自定义对象
        HashSet<Person> people = new HashSet<>();
        Person p1 = new Person("乔丹",50);
        Person p2 = new Person("乔丹",50);
        Person p3 = new Person("科比",40);

        people.add(p1);
        people.add(p2);
        people.add(p3);

        System.out.println(people);


    }
}
