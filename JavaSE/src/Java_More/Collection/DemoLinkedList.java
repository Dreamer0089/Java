package Java_More.Collection;

import java.util.LinkedList;

/*
    java.util.LinkedList集合 implement List接口
    LinkedList集合特点：
        1.链表接口：查询慢，增删快
        2.大量操作首尾元素的方法
        注意：使用特有方法，不能使用多态

        public void addFirst(E e);将指定元素插入此列表的开头。
        public void addLast(E e);将指定元素添加到此列表的结尾。
        public void push(E e);将元素推入此列表所表示的堆栈。

        public E getFirst();返回此列表的第一个元素。
        public E getLast();返回此列表的最后一个元素。

        public   E removeFirst();移除并返回此列表的第一个元素。
        public E removeLast();移除并返回此列表的最后一个元素。
        public E pop();从此列表所表示的堆栈处弹出一个元素。

        public boolean isEmpty();判断是否为空，

 */
public class DemoLinkedList {
    public static void main(String[] args) {
        addMethod();
        System.out.println();
        getMethod();
        System.out.println();
        removeMethod();
    }
    //移除元素
    //removeFirst()方法等价于pop()方法
    private static void removeMethod() {
        LinkedList<String> strings = new LinkedList<>();

        strings.add("科比");
        strings.add("乔丹");
        strings.add("姚明");
        strings.add("库里");
        System.out.println(strings);
        System.out.println("移除的第一个元素：" + strings.removeFirst());
        System.out.println("再一次移除的第一个元素：" + strings.pop());
        System.out.println("移除的最后一个元素：" + strings.removeLast());
        System.out.println("移除后的集合：" + strings);

    }

    //添加元素
    private static void addMethod() {
        LinkedList<String> strings = new LinkedList<>();

        //add()方法
        strings.add("科比");
        strings.add("乔丹");
        strings.add("姚明");
        strings.add("库里");
        System.out.println(strings);
        //addFirst()方法
        strings.addFirst("杨洋");
        System.out.println(strings);
        //addLast()方法   等效于add()方法
        strings.addLast("abc");
        System.out.println(strings);
        //push()方法  等效与addFirst()方法
        strings.push("德玛西亚");
        System.out.println(strings);
    }
    //获取元素
    private static void getMethod() {
        LinkedList<String> strings = new LinkedList<>();

        strings.add("科比");
        strings.add("乔丹");
        strings.add("姚明");
        strings.add("库里");
//        strings.clear();
        if (!strings.isEmpty()) {
            System.out.println(strings.getFirst());
            System.out.println(strings.getLast());
        } else {
            System.out.println("集合为空！");
        }

//        strings.clear();
//        System.out.println(strings);
    }

}
