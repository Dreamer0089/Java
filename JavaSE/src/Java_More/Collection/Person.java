package Java_More.Collection;

import java.util.Objects;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public int compareTo(Person o) {
        return this.getAge() - o.getAge();//升序
        //return o.getAge() - this.getAge();//降序
    }

//    @Override
//    public int hashCode() {
//        return this.hashCode();
//    }
//    public boolean equals(Person p) {
//        return p.getName().equals(this.getName()) && p.getAge() == this.getAge();
//    }
}
