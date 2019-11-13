package Java_More.DemoGeneric;
/*
    泛型：一种未知的数据类型，当不确定使用什么类型的时候，可以使用泛型
          泛型可以接受任意的数据类型，Integer,String,Student...
          在创建对象的时候确定泛型的具体数据类型

 */
public class GenericClass<T> {
    private T name;

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }
}
