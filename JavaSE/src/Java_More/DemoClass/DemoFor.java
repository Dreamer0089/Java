package Java_More.DemoClass;

import java.util.ArrayList;

/*
        增强for循环：多用来遍历集合和数组

            使用格式：
                for(集合/数组的数据类型 变量名： 集合名/数组名) {
                    sout(变量名)；
                }
 */
public class DemoFor {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("乔丹");
        strings.add("科比");
        strings.add("詹姆斯");
        strings.add("杜兰特");
        strings.add("哈登");

        for(String s : strings) {
            System.out.println(s);
        }

        System.out.println("===============");
        int[] arr = {1,2,3,4,5,676,7};
        for(int a:arr) {
            System.out.println(a);
        }

    }
}
