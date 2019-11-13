package Java_More.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
    java.util.Collections是集合工具类，用来对集合进行操作
    常用方法
        public static <T> boolean addAll(Collection<? super T> c, T... elements);将所有指定元素添加到指定 collection 中。
        public static void shuffle(List<?> list);使用默认随机源对指定列表进行置换。
        public static <T> void sort(List<T> list);根据元素的自然顺序 对指定列表按升序进行排序
                sort()方法使用前提：被排序集合里的元素必须实现Comparable，重写接口中的方法compareTo定义排序规则
        static <T> void sort(List<T> list, Comparator<? super T> c);根据指定比较器产生的顺序对指定列表进行排序。


 */
public class DemoCollectionsMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        System.out.println(list);
        list.clear();
        //使用addAll()方法
        Collections.addAll(list,"a","b","c","d");
        System.out.println(list);
        System.out.println("===========");
        //使用shuffle()方法打乱集合元素顺序
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println("===========");
        //使用sort()方法进行排序，默认升序
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.hashCode() - o1.hashCode();
            }
        });
        System.out.println("使用了sort排序规则的排序：" + list);


        Person p1 = new Person("乔丹",50);
        Person p2 = new Person("姚明",42);
        Person p3 = new Person("科比",40);
        ArrayList<Person> people = new ArrayList<>();
        people.add(p1);
        people.add(p2);
        people.add(p3);
        Collections.sort(people);
        System.out.println(people);

        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o2.getAge() - o1.getAge();
            }
        });
        System.out.println(people);


    }
}
