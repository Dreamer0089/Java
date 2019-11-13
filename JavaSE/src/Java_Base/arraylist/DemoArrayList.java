package Java_Base.arraylist;

import Java_Base.object.Student;

import java.util.ArrayList;
import java.util.Random;

/*
        基本数据类型对应的包装类（引用类型）
            byte        Byte
            short       Short
            int         Integer
            long        Long
            float       Float
            double      Double
            char        Character
            boolean     Boolean
 */
public class DemoArrayList {
    public static void main(String[] args) {
        //1.生成6个1-33的随机整数，添加到集合，并遍历集合
        ArrayList<Integer> intList = new ArrayList<>();
        Random randomNum = new Random();
        for(int i = 0; i < 6 ;i ++) {
            intList.add(randomNum.nextInt(33) + 1);
        }
        System.out.println(intList);
        for (int i = 0; i < intList.size(); i++) {
            System.out.print(intList.get(i) + " ");
        }
        System.out.println();

        //3.使用自定义方法实现形如{A@B@C}对ArrayList进行打印输出
        printIntergerArrayList(intList);

        //2.自定义四个学生对象，添加到集合并遍历
        Student stu1 = new Student("张三",18);
        Student stu2 = new Student("李四",21);
        Student stu3 = new Student("王五",19);
        Student stu4 = new Student("杨洋",22);

        ArrayList<Student> studentsList = new ArrayList<>();

        studentsList.add(stu1);
        studentsList.add(stu2);
        studentsList.add(stu3);
        studentsList.add(stu4);

        for (int i = 0; i < studentsList.size(); i++) {
            System.out.println("姓名:"+studentsList.get(i).getName()+"  年龄："+studentsList.get(i).getAge());
        }

        for(int i = 0; i < 20 ;i ++) {
            intList.add(randomNum.nextInt(100) + 1);
        }
        //4.使用自定义方法对ArrayList<Integer>进行筛选，即筛选出偶数
        //大集合
        System.out.println(intList);
        //小集合，结果集合
        System.out.println(chooseInteger(intList));

    }
    //3.使用自定义方法实现形如{A@B@C}对ArrayList进行打印输出
    public static void printIntergerArrayList(ArrayList<Integer> integerArrayList) {
        System.out.print("{");
        for (int i = 0; i < integerArrayList.size(); i++) {
            System.out.print(integerArrayList.get(i) + "@");
            if(i == integerArrayList.size() - 1) {
                System.out.print(integerArrayList.get(i) + "}");
            }
        }
        System.out.println();
    }

    //4.使用自定义方法对ArrayList<Integer>进行筛选，即筛选出偶数
    public static ArrayList<Integer> chooseInteger(ArrayList<Integer> intList) {
        ArrayList<Integer> resultIntList = new ArrayList<>();
        Random randomNum = new Random();
        for (int i = 0; i < intList.size(); i++) {
            if(intList.get(i) % 2 == 0) {
                resultIntList.add(intList.get(i));
            }
        }
        return resultIntList;
    }
}
