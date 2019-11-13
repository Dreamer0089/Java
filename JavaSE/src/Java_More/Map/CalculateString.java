package Java_More.Map;

import java.util.*;

/*
    计算一个字符串中每一个字符出现的次数
 */
public class CalculateString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        HashMap<Character, Integer> map = new HashMap<>();
        for (Character c:str.toCharArray()) {
            if(map.containsKey(c)) {
                Integer value = map.get(c);
                value ++;
                map.put(c,value);
            } else {
                map.put(c,1);
            }
        }

//        Set<Character> characters = map.keySet();
//        Iterator<Character> iterator = characters.iterator();
//        while (iterator.hasNext()) {
//            Character key = iterator.next();
//            Integer value = map.get(key);
//            System.out.println("字符：" + key + "   " +"出现次数： "+value );
//        }

        for(Character key:map.keySet()) {
            Integer value = map.get(key);
            System.out.println("字符：" + key + "   " +"出现次数： "+value );
        }


    }
}
