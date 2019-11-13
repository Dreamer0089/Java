package Java_Base.object;
/**
 * 学生类：
 *       属性：姓名、年龄
 *       行为：吃饭、睡觉、学习
 */

public class Student {
    private String name;
    private int age;

    public Student() {}
    public Student(String name,int age) {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void display() {
        System.out.println(getName() + "今年" + getAge() + "岁！");
    }

    public void eat() {
        System.out.println(getName() + "吃饭！");
    }

    public void sleep() {
        System.out.println(getName() + "睡觉！！");
    }

    public void study() {
        System.out.println(getName() + "沉迷学习，日渐消瘦！");
    }
}
