package Java_More.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    HashMap存储自定义类型键值
    Map集合保证hey是唯一的;
        作为key元素，必须重写hashCode()方法和equals()方法，以保证key唯一
 */
public class DemoHashMapSavePerson {
    public static void main(String[] args) {
        HashMap<String, Person> map = new HashMap<>();
        map.put("北京",new Person("北京人",34));
        map.put("上海",new Person("上海人",18));
        map.put("广州",new Person("广州人",36));
        map.put("北京",new Person("深圳人",34));

        Set<String> set = map.keySet();
        for(String key:set) {
            Person value = map.get(key);
            System.out.println(key+ " " + value );
        }

        System.out.println("=================");

        HashMap<Person, String> map1 = new HashMap<>();
        map1.put(new Person("秦始皇",51),"中国秦朝");
        map1.put(new Person("李世民",60),"中国唐朝");
        map1.put(new Person("朱元璋",70),"中国明朝");
        map1.put(new Person("女王",90),"英国");
        map1.put(new Person("女王",90),"俄国");

        Set<Map.Entry<Person, String>> entries = map1.entrySet();
        for(Map.Entry<Person,String> entry:entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}
