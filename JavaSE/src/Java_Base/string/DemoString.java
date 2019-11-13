package Java_Base.string;

/*
        字符串常见创建方式
            三种构造
                1.public String();创建一个空白字符串，不含有任何内容
                2.public String(char[] array);根据字符数组的内容创建对应的字符串
                3.public String(byte[] array);根据字符数组的内容创建对应的字符串
            一种直接创建
                String str = "hello";

         字符串常量池 --在堆中
                直接创捷的字符串（即用" "直接创建），存储在字符串常量池中，
         字符串内容比较方法
            equals();               严格区分字母大小写
            equalsIgnoreCase();     不区分字母大小写
         字符串常用方法
            public int length();                获取字符串的长度
            public String concat(String str);   当前字符串与参数字符串拼接返回新的字符串
            public char charAt(int index);      获取索引值位置的单个字符
            public int indexOf(String str);     查找参数字符串在原字符串中第一次出现的索引位置，没有就返回-1

         字符串的截取方法,截取后的字符串返回给新的字符串，
                        原字符串不会发生改变
                public String substring(int index);
                截取从索引参数到最后 的一个字符串

                public String substring(int begin,int end);
                截取 [begin，end)范围内的字符串

          字符串转换常用方法
                public char[] toCharArray();
                将当前字符串拆分为字符数组作为返回值

                public byte[] getBytes();
                获取当前字符串 底层的字节数组

                public String replace(CharSequence oldString, CharSequence newString);
                将所有出现的老字符串替换为新的字符串，返回替换之后的新字符串

           字符串分割
                public String[] split(String regex);
                按照参数规则，将字符串切割成若干部分
                regex如果是英文句号（.）时，应写成"\\."
 */
public class DemoString {
    public static void main(String[] args) {
        //空参构造
        String str1 = new String();
        System.out.println("空参构造创建的字符串：" + str1);

        //根据字符数组的内容创建对应的字符串
        char[] charArray = {'Q','W','E','R'};
        String str2 = new String(charArray);
        System.out.println("根据字符数组的内容创建字符串：" + str2);

        //根据字符数组的内容创建对应的字符串
        char[] byteArray = {97,99,98};
        String str3 = new String(byteArray);
        System.out.println("根据字节数组的内容创建字符串：" + str3);

        //直接创建
        String str4 = "hello java!";
        System.out.println("直接创建的字符串：" + str4);

        String strA = "abc";
        String strB = "abc";

        char[] charArr = {'a','b','c'};
        String strC = new String(charArr);

        System.out.println("正确结果为（false）：" + strA == strB);
        System.out.println("正确结果为（false）：" + strA == strC);
        System.out.println("正确结果为（false）：" + strB == strC);

        //字符串内容比较，使用equals()方法，返回true或false  严格区分大小写
        System.out.println("正确结果为（true）：" + strA.equals(strB));
        System.out.println("正确结果为（true）：" + strA.equals(strC));
        System.out.println("正确结果为（true）：" + strB.equals(strC));

        //equalsIgnoreCase()--忽略大小写
        String strD = "AbC";
        System.out.println("正确结果为（true）：" + strA.equalsIgnoreCase(strD));


        //字符串常用操作
        String A = "sdgdfhrh";
        String B = "dfh";

        System.out.println("字符串A的长度：" + A.length());
        System.out.println("字符串A、B连接产生新的字符串：" + A.concat(B));
        System.out.println("B在A中的索引位置：" + A.indexOf(B));

        //截取字符串

        System.out.println("原字符串：" + A);
        System.out.println("截取后的字符串：" + A.substring(2));
        System.out.println("截取后的字符串：" + A.substring(2,4));

        //字符串替换
        System.out.print("替换为字符数组：" );
        for (int i = 0; i < A.toCharArray().length; i++) {
            System.out.print(A.toCharArray()[i] + " ");
        }
        System.out.println();

        System.out.print("替换为字节数组：" );
        for (int i = 0; i < A.getBytes().length; i++) {
            System.out.print(A.getBytes()[i] + " ");
        }
        System.out.println();

        System.out.println("替换为新字符数组：" + A.replace("s",A));

        String str = "ABVC,SDG,sdg,sdgd";
        String[] strArr = str.split("s");

        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }
    }
}
