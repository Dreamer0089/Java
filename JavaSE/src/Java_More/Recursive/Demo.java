package Java_More.Recursive;
/*
    递归：指在当前方法内调用自己的这种现象
    分类：
        直接递归：方法自身调用自己
        间接递归：A方法调用B方法，B方法调用C方法，C方法调用A方法
    注意事项：
        递归一定要有条件限定，保证递归能够停止下来，否则会发生栈内存溢出。
        在递归中虽然有限定条件，但是递归次数不能太多。否则也会发生栈内存溢出。
        构造方法,禁止递归
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(Fibonacci(20));
        System.out.println(Sum(10));
        System.out.println(Factorial(0));
    }

    /*
        计算n的阶乘
     */
    private static long Factorial(int n) {
        if(n == 1 || n == 0)
            return 1;
        return Factorial(n-1) * n;
    }

    /*
        递归计算1-n之和
     */
    private static int Sum(int n) {
        if(n == 1)
            return n;
        return Sum(n-1) + n;
    }

    /*
        斐波那契数列
     */
    private static int Fibonacci(int n) {
        if(n == 1 || n == 2)
            return 1;
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }
}
