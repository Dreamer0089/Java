package Java_Base.forInsideClass;
/*
    内部类的使用
        直接使用：
            外部类名.内部类名 对象名 = new 外部类名称().new 内部类名称;
        间接使用：在外部类的方法中使用内部类，main调用外部类的方法

    匿名内部类
 */
public class Demo {
    public static void main(String[] args) {
        //间接使用
        Body body = new Body();
        body.methodBody();
        System.out.println("===================");

        //直接使用
        Body.Heart heart = new Body().new Heart();
        heart.beat();
        heart.methodHeart();

        MyInterface obj = new MyInterface() {
            @Override
            public void method() {

            }
        };
    }
}
