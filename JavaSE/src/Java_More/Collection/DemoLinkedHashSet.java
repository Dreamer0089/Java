package Java_More.Collection;
/*
        java.util.LinkedHashSet集合 extends HashSet集合
        LinkedHashSet集合特点：
            元素有序
            底层是一个哈希表（数据+链表/红黑树）+链表
            多了一条链表（记录元素顺序）
 */
public class DemoLinkedHashSet {
    public static void main(String[] args) {
        method(1,"java","IDEA");
    }
    public static void method(Object...objects) {
        for (Object o:objects) {
            System.out.println(o);
        }
    }
}
