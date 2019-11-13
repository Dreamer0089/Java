package Java_More.Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/*
        Iterator--迭代器，可以使用对集合进行遍历
            Collection集合中元素通用的获取方式
            取元素之前判断集合中有没有元素
                如果有，取出来
                判断，如果有，继续取；一直把集合中的所有元素全部取出来
             以上这种取出方式称之为“迭代”

             方法：
                public boolean hasNext();如果仍有元素可以迭代，则返回 true
                                            判断集合中是否有下一个元素，有就返回true，没有就返回false
                E next();返回迭代的下一个元素。

        Iterator迭代器是一个接口，不能直接使用，需要使用Iterator的实现类
        Collection接口中的iterator()方法返回的就是迭代器的实现类的对象
        使用步骤：
            1.使用集合中的方法iterator()获取迭代器的实现类对象，使用Iterator接口接收（多态）
            2.使用Iterator接口中的方法hasNext()判断是否有下一个元素
            3.使用Iterator接口中的方法Next()取出集合中的下一个元素
 */
public class DemoIterator {
    public static void main(String[] args) {
        Collection<String> team = new ArrayList<>();

        team.add("科比");
        team.add("乔丹");
        team.add("詹姆斯");
        team.add("杜兰特");
        team.add("库里");

        //获取迭代器
        Iterator<String> iterator = team.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("==============");
        for(Iterator<String> it = team.iterator();it.hasNext();) {
            System.out.println(it.next());
        }
    }
}
