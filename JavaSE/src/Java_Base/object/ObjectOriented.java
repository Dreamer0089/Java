package Java_Base.object;

import java.util.Arrays;

public class ObjectOriented /*面向对象*/{
    public static void main(String[] args) {
        //实现一个数组的遍历，形如：[1,2,3]
        int[] arr = {1,23,34,5,676,7};
        //面向过程的实现
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i < arr.length - 1 ) {
                System.out.print(arr[i] + ", ");
            } else {
                System.out.println(arr[i] + "]");
            }
        }
        System.out.println("============");
        //面向对象 实现数组遍历
        System.out.println(Arrays.toString(arr));
    }
}
