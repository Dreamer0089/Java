package Java_Base.polymorphism;

public class Cat extends Animal {
    @Override
    public void eat(String str){
        System.out.println(getClass() + "吃" + str);
    }
    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
