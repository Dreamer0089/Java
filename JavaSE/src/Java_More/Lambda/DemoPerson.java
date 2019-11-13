package Java_More.Lambda;

import java.util.Arrays;
import java.util.Comparator;

public class DemoPerson {
    public static void main(String[] args) {

        //对象按年龄升序排列
        Person[] people = {
                new Person("马尔扎哈",43),
                new Person("迪丽热巴",34),
                new Person("古力娜扎",23)
        };

//        Arrays.sort(people, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

//        Arrays.sort(people,(Person p1,Person p2) -> {
//            return p1.getAge() - p2.getAge();
//        });

        Arrays.sort(people,(p1,p2) -> p1.getAge() - p2.getAge());

        for (Person p:people) {
            System.out.println(p);
        }
    }
}
