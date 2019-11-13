package Java_More.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
    java.util.Map<k,v>集合
    Map集合特点;
        1.双列集合，一个元素包含两个值（key，value）
        2.key和value的类型可以相同，也可以不相同
        3.key不可重复，value允许重复
        4.key与value一一对应

    java.util.HashMap<k,v>集合 implements Map<k,v>接口
    HashMap集合的特点：
        1.底层是哈希表，查询速度快
        2.无序，存取顺序可能不一致

    java.util.LinkedHashMap<v,k>集合 implements HashMap<k,v>接口
    LinkedHashMap集合特点;
        1.底层是哈希表+链表（链表保证顺序）
        2.有序，存取顺序一致

    常用方法：
         public V put(K key, V value);把指定的键与指定的值添加到map集合
         public V get(Object key);判断集合中是否包含指定的键
         public V remove(Object key);把指定的键所对应的键值对元素在Map集合中删除，返回被删除元素的值
         public boolean containsKey(Object key);判断集合中是否包含指定的键

         public Set<K> keySet();返回此映射中包含的键的 Set 视图
           把Map集合中所有的key取出来存储在Set集合中
           使用步骤：
                1.使用Map集合中的方法keySet()方法，把Map集合中所有的key取出来，存储在Set集合中
                2.遍历Set集合，获取Map集合中的每一个key
                3.通过Map集合中的方法get(key)，通过key找到value
         public Set<Map.Entry<K,V>> entrySet();返回此映射中包含的映射关系的 Set 视图
            使用步骤;
                1.使用Map集合中的entrySet()方法，把Map集合中的多个Entry对象取出来，存储在一个Set集合中
                2.遍历Set集合，获取每一个Entry对象
                3.使用Entry对象中的方法getKey()和getValue()获取键与值

 */
public class DemoMapMethod {
    public static void main(String[] args) {
        putMethod();
        System.out.println("===============");
        removeMethod();
        System.out.println("===============");
        getMethod();
        System.out.println("===============");
        containMethod();
        System.out.println("===============");
        keySetMethod();
        System.out.println("===============");
        entrySetMethod();

    }
    private static void putMethod() {
        /*
            public V put(K key, V value);
            把指定的键与指定的值添加到map集合
            返回值：v
                存在键值对时，key不重复，返回值v是null
                存在键值对时，key重复，使用新value值替换map中重复的value，返回被替换的value值
        */

        HashMap<String, String> map = new HashMap<>();
        String str1 = map.put("范冰冰", "李晨1");
        String str2 = map.put("范冰冰", "李晨2");
        System.out.println(str1 + str2);
        System.out.println(map);

        map.put("冷锋", "龙小云");
        map.put("杨过", "小龙女");
        map.put("刘亦菲", "小龙女");

        System.out.println(map);

    }

    private static void removeMethod() {
        /*
           public V remove(Object key);
           把指定的键所对应的键值对元素在Map集合中删除，返回被删除元素的值
           返回值：v
                key存在，v返回被删除的值
                key不存在，v返回null
        */

        HashMap<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 161);
        map.put("林志玲", 175);
        map.put("姚明", 226);
        System.out.println(map);
        Integer v1 = map.remove("姚明");
        System.out.println(v1);
        System.out.println(map);

        Integer v2 = map.remove("李小龙");
        System.out.println(v2);
        System.out.println(map);
    }

    private static void getMethod() {
         /*
            public V get(Object key);
            根据指定的键，在Map集合中获取对应的值
                返回值：
                    key存在，返回对应的value；
                    key不存在，返回null
        */

        HashMap<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 161);
        map.put("林志玲", 175);
        map.put("姚明", 226);

        System.out.println(map.get("姚明"));
        System.out.println(map.get("李小龙"));
    }

    private static void containMethod() {
        /*
            public boolean containsKey(Object key);
            判断集合中是否包含指定的键
                包含返回true，不包含返回false
        */

        HashMap<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 161);
        map.put("林志玲", 175);
        map.put("姚明", 226);

        System.out.println(map.containsKey("姚明"));
        System.out.println(map.containsKey("李小龙"));
    }

    private static void keySetMethod() {
        /*
           public Set<K> keySet();
           返回此映射中包含的键的 Set 视图
           把Map集合中所有的key取出来存储在Set集合中
           使用步骤：
                1.使用Map集合中的方法keySet()方法，把Map集合中所有的key取出来，存储在Set集合中
                2.遍历Set集合，获取Map集合中的每一个key
                3.通过Map集合中的方法get(key)，通过key找到value
        */
        HashMap<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 161);
        map.put("林志玲", 175);
        map.put("姚明", 226);

        Set<String> set = map.keySet();
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Integer value = map.get(key);
            System.out.println(key + " " + value);
        }
    }

    private static void entrySetMethod() {
        /*
            public Set<Map.Entry<K,V>> entrySet();返回此映射中包含的映射关系的 Set 视图
            使用步骤;
                1.使用Map集合中的entrySet()方法，把Map集合中的多个Entry对象取出来，存储在一个Set集合中
                2.遍历Set集合，获取每一个Entry对象
                3.使用Entry对象中的方法getKey()和getValue()获取键与值
         */

        HashMap<String, Integer> map = new HashMap<>();
        map.put("赵丽颖", 168);
        map.put("杨颖", 161);
        map.put("林志玲", 175);
        map.put("姚明", 226);

        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator1 = entries.iterator();
        while (iterator1.hasNext()) {
            Map.Entry<String, Integer> entry = iterator1.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
