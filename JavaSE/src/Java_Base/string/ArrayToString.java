package Java_Base.string;
/*
        自定义一个方法将数组元素拼接成一个字符串
            形如[元素1#元素2#元素3#元素4]
 */
public class ArrayToString {
    public static void main(String[] args) {
        int[] intArr = {1,2,4,5};

        System.out.println(arrayToString(intArr));
    }
    public static String arrayToString(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1) {
                str =  str + "word" + arr[i] + "]";
            } else {
                str = str + "word" + arr[i] + "#";
            }

        }
        return str;
    }
}
