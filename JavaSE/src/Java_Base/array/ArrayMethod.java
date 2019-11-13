package Java_Base.array;

public class ArrayMethod {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 7, 4, 2, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        arrayReserve(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    //数组反转
    public static int[] arrayReserve(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - i - 1) {
                int temp = arr[i];
                arr[i] = arr[arr.length - i - 1];
                arr[arr.length - i - 1] = temp;
            }
        }
        return arr;
    }
}
