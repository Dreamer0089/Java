package Java_Base.random;

import java.util.Random;

public class DemoRandom {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            /*
                random.nextInt()为无范围随机整数
                random.nextInt(n) 范围为[0,n) 即 num>=0 && num<n
             */
            int randomNum = random.nextInt(20);
            System.out.print(randomNum + " ");
        }
    }
}
