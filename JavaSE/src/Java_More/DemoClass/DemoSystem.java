package Java_More.DemoClass;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
    System类
        常用方法
            //返回以毫秒为单位的当前时间，可以用来计算程序的运行的时间
            public static long currentTimeMillis();

            //从指定源数组中复制一个数组，复制从指定的位置开始，到目标数组的指定位置结束
            public static void arraycopy(Object src,int srcPos,Object dest,int destPos,int length);
            参数：
                src - 源数组。
                srcPos - 源数组中的起始位置。
                dest - 目标数组。
                destPos - 目标数据中的起始位置。
                length - 要复制的数组元素的数量。


 */
public class DemoSystem {
    public static void main(String[] args) {
        long l1= System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        int sum = 0;
        for (int i = 0; i < 100000; i++) {

        }
        System.out.println();
        long l2 = System.currentTimeMillis();
        System.out.println(System.currentTimeMillis());
        System.out.println("程序共运行：" + (l2-l1) + "毫秒");

        //原数组
        int[] src = {1,2,3,4,5};
        //目标数组
        int[] dest = {6,7,8,9,10};
        System.out.println("复制前：" + Arrays.toString(dest));
        System.arraycopy(src,0,dest,0,3);
        System.out.println("复制后：" + Arrays.toString(dest));


    }
}
