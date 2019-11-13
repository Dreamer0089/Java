package Java_More.Collection;

import java.util.ArrayList;
import java.util.Collection;

/*
    public boolean add(E e);把给定的
    public boolean contains(Object o);如果此 collection 包含指定的元素，则返回 true。
    public void clear();移除此 collection 中的所有元素
    public boolean remove(Object o);从此 collection 中移除指定元素的单个实例，如果存在的话
    public boolean isEmpty();如果此 collection 不包含元素，则返回 true。
    public int size();返回此 collection 中的元素数。
 */
public class DemoCollection {
    public static void main(String[] args) {
        //创建一个集合对象
        Collection<String> coll = new ArrayList<>();
        System.out.println(coll);//[]
        coll.add("张三");
        System.out.println(coll);//[张三]
        coll.add("李四");
        coll.add("王五");
        coll.add("赵六");
        coll.add("田七");
        System.out.println(coll);//[张三, 李四, 王五, 赵六, 田七]

        coll.remove("王五");
        System.out.println(coll);//[张三, 李四, 赵六, 田七]
        coll.remove("赵四");//集合中没有该元素，删除失败
        System.out.println(coll);//[张三, 李四, 赵六, 田七]

        System.out.println(coll.contains("李四"));//true  包含
        System.out.println(coll.contains("赵四"));//false 不包含

        System.out.println(coll.isEmpty());//false 非空

        System.out.println(coll.size());//4 长度为4

        for (int i = 0; i < coll.toArray().length; i++) {
            System.out.println(coll.toArray()[i]);
        }

        coll.clear();//清空集合
        System.out.println(coll.isEmpty());//true   集合为空

    }
}
