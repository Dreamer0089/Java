package Java_Base.object;

public class ObjectArray {
    public static void main(String[] args) {
        Student[] stu = new Student[3];

        Student stu0 = new Student("张三", 21);
        Student stu1 = new Student("李四", 19);
        Student stu2 = new Student("杨洋", 22);

        stu[0] = stu0;
        stu[1] = stu1;
        stu[2] = stu2;
//        stu[0].setName("张三");
//        stu[0].setAge(21);
//
//        stu[1].setName("李四");
//        stu[1].setAge(19);
//
//        stu[2].setName("杨洋");
//        stu[2].setAge(22);

        for (int i = 0; i < stu.length; i++) {
            stu[i].display();
            stu[i].study();
            stu[i].eat();
            stu[i].sleep();
        }


    }

}
