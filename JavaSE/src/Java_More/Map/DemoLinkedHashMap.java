package Java_More.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;

/*
    java.util.LinkedHashMap<K,V> extends HashMap<K,V>
    Map接口的哈希表和链接列表实现，具有可预知的迭代顺序
    底层原理：
        哈希表+链表（链表用于记录元素顺序）

 */
public class DemoLinkedHashMap {
    public static void main(String[] args) {
        HashMap<String, String> stringStringHashMap = new HashMap<>();
        stringStringHashMap.put("a","a");
        stringStringHashMap.put("d","d");
        stringStringHashMap.put("c","c");
        stringStringHashMap.put("b","b");
        System.out.println(stringStringHashMap);

        LinkedHashMap<String, String> stringStringLinkedHashMap = new LinkedHashMap<>();
        stringStringLinkedHashMap.put("a","a");
        stringStringLinkedHashMap.put("b","b");
        stringStringLinkedHashMap.put("c","c");
        stringStringLinkedHashMap.put("d","d");
        System.out.println(stringStringLinkedHashMap);



    }
}
