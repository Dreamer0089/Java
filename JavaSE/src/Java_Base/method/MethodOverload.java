package Java_Base.method;
/**
 *  方法重载
 *          多个方法名称一样，参数列表不一样
 *                                      参数个数
 *                                      参数类型
 *                                      参数多类型顺序
 *          与参数名称无关
 *          与方法的返回值类型无关
 *
 *
 */
public class MethodOverload {
    public static void main(String[] args) {

    }

    public static int sum(int a,int b) {
        return a + b;
    }
    public  static int sum(int a,int b,int c) {
        return a + b + c;
    }
}
