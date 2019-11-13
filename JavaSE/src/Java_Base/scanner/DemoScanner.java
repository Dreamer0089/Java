package Java_Base.scanner;

import java.util.Scanner;

public class DemoScanner {
    public static void main(String[] args) {
        //System.in 表示从键盘获取内容
        Scanner scanner = new Scanner(System.in);
        //输入的整数存到num中
        int num = scanner.nextInt();
        System.out.println("键盘输入的整数是：" + num);
    }
}
