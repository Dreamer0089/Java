package Java_More.Properties;

import java.io.*;
import java.util.Properties;
import java.util.Set;

/*
    java.util.Properties集合 extends Hashtable<k,v> implements Map<k,v>
    Properties 类表示了一个持久的属性集。Properties 可保存在流中或从流中加载。
    Properties 集合是唯一和IO流相结合的集合
        可以使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
        可以使用Properties集合中的方法load，把硬盘中保存的文件（键对值），读取到集合中使用

    属性列表中每个键及其对应值都是一个字符串。
        Properties集合是一个双列集合，key和value默认是字符串



 */
public class DemopProperties {
    public static void main(String[] args) throws IOException {
        //showMethod();
        //showStore();
        showLoad();
    }

    /*
        void load(InputStream inStream)  从输入流中读取属性列表（键和元素对）。
        void load(Reader reader)  按简单的面向行的格式从输入字符流中读取属性列表（键和元素对）。
        参数：
            InputStream inStream：字节输入流，不能读取含有中文的键值对
            Reader reader：字符输入流，可以读取含有中文的键值对
        使用步骤：
                1.创建Properties集合对象
                2.使用Properties集合对象中的方法load读取保存键值对的文件
                3.遍历Properties集合
                注意：
                    1.存储键值对的文件中，键与值的默认连接符号可使用“=、空格、其他符号”
                    2.存储键值对的文件中，可以使用“#”进行注释，被注释的键值对不会再被读取
                    3.存储键值对的文件中，键与值默认都是字符串，不用在加引号




     */
    private static void showLoad() throws IOException {
        //1.创建Properties集合对象
        Properties properties = new Properties();
        properties.load(new FileReader("javase\\demo.txt"));

        Set<String> set = properties.stringPropertyNames();
        for (String key : set) {
            String s = properties.getProperty(key);
            System.out.println(key+"="+s);
        }

    }

    /*
            void store(OutputStream out, String comments) 以适合使用 load(InputStream)
                方法加载到 Properties 表中的格式，将此 Properties 表中的属性列表（键和元素对）写入输出流。
            void store(Writer writer, String comments)
                以适合使用 load(Reader) 方法的格式，将此 Properties 表中的属性列表（键和元素对）写入输出字符。
            参数：
                OutputStream out：字节输出流，不能写入中文
                Writer writer：字符输出流，可以写入中文
                String comments：注释，用来解释说明保存的文件是做什么的
                                不能使用中文，会产生乱码，默认是Unicode编码
                                一般使用空字符串
            使用步骤：
                1.创建Properties集合对象，添加数据
                2.创建字节输出流/字符输出流，构造方法中绑定输出的目的地
                3.使用Properties集合中的方法store，把集合中的临时数据，持久化写入到硬盘中存储
                4.释放资源
     */
    private static void showStore() throws IOException {
        //创建Properties集合对象
        Properties prop = new Properties();
        //使用setProperties往集合里添加数据
        prop.setProperty("迪丽热巴","164");
        prop.setProperty("古力娜扎","166");
        prop.setProperty("马尔扎哈","174");
        prop.setProperty("稀里哗啦","154");


        FileWriter fw = new FileWriter("javase\\demo.txt");
        prop.store(fw," ");
        fw.close();

        //prop.store(new FileOutputStream("javase\\demo.txt") ,"");

    }


    /*
            操作字符串的特有方法：
                Object setProperty(String key, String value) 调用 Hashtable 的方法 put。
                String getProperty(String key)用指定的键在此属性列表中搜索属性。
                Set<String> stringPropertyNames() 返回此属性列表中的键集，其中该键及其对应值是字符串，

    */
    private static void showMethod() throws IOException {
        //创建Properties集合对象
        Properties prop = new Properties();
        //使用setProperties往集合里添加数据
        prop.setProperty("迪丽热巴","164");
        prop.setProperty("古力娜扎","166");
        prop.setProperty("马尔扎哈","174");
        prop.setProperty("稀里哗啦","154");

        Set<String> set = prop.stringPropertyNames();

        for (String key : set) {
            String value = prop.getProperty(key);
            System.out.println(key+":"+value);
        }






    }


}


