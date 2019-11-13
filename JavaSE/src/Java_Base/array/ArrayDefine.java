package Java_Base.array;

/*
数组初始化
    基本格式
        1.动态初始化(确定数组长度)
            数据类型[] 数组名称 = new 数据类型[数组长度];
                整数类型：所有默认值为0；
                浮点类型：所有默认值为0.0；
                字符类型：所有默认值为'\u0000'；
                布尔类型：所有默认值为false；
                引用类型：所有默认值为null；
        2.静态初始化（确定数组元素）
            数据类型[] 数组名称 = new 数据类型[]{元素1,元素2,...};
    省略格式
        数据类型[] 数组名称 = {元素1,元素2,...};

*/
public class ArrayDefine {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1,2,3,4,5};
        System.out.println(arr1.length);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "  ");
        }
        System.out.println();
        int[] arr2 = new int[4];
        for (int i = 0; i < 4; i++) {
            System.out.print(arr2[i] + "  ");
        }

        System.out.println("数组arr1的最大值：" + maxArray(arr1) );
    }

    public static int maxArray(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= max) {
                max = arr[i];
            }
        }

        return max;
    }
}
