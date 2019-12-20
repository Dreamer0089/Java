package reflect;

import use.Person;

import java.lang.reflect.Field;

/*
        Class对象功能：
        * 获取功能：
            1. 获取成员变量们
                * Field[] getFields() ：获取所有public修饰的成员变量
                * Field getField(String name)   获取指定名称的 public修饰的成员变量

                * Field[] getDeclaredFields()  获取所有的成员变量，不考虑修饰符
                * Field getDeclaredField(String name)
            2. 获取构造方法们
                * Constructor<?>[] getConstructors()
                * Constructor<T> getConstructor(类<?>... parameterTypes)

                * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
                * Constructor<?>[] getDeclaredConstructors()
            3. 获取成员方法们：
                * Method[] getMethods()
                * Method getMethod(String name, 类<?>... parameterTypes)

                * Method[] getDeclaredMethods()
                * Method getDeclaredMethod(String name, 类<?>... parameterTypes)

            4. 获取全类名
                * String getName()
 */
public class Demo {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Class<Person> personClass = Person.class;

        //Field[] getFields() ：获取所有public修饰的成员变量
        Field[] fields = personClass.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("====================");
        Field a = personClass.getField("a");
        Person p = new Person();
        Object o = a.get(p);
        System.out.println(o);
        a.set(p,"杨洋");
        System.out.println(p);

    }
}
