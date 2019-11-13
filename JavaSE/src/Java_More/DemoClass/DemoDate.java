package Java_More.DemoClass;
/*
        Date类空参数构造方法
            Date()获取当前系统的日期和时间
        带参数的构造方法
            Date(long date);传递一个毫秒值，将毫秒值转化为日期
        常用方法
            long getTime();
            把日期转换为毫秒值（相当于System.currentTimeMillis()方法）

        DateFormat类--将日期格式化的抽象类
        SimpleDateFormat类--DateFormat的实现类
            区分大小写：
            y  年
            M  年中的月份
            w  年中的周数
            W  月份中的周数
            D  年中的天数
            d  月份中的天数
            H  一天中的小时数（0-23）
            k  一天中的小时数（1-24）
            K  am/pm 中的小时数（0-11）
            h  am/pm 中的小时数（1-12）
            m  小时中的分钟数
            s  分钟中的秒数
            S  毫秒数
            例：“yyyy-MM-dd HH:mm:ss”
            模式中的字母不可更改，连接符可以更改
            例：“yyyy年MM月dd日 HH时mm分ss秒”

 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DemoDate {
    public static void main(String[] args) throws ParseException {
        //Date类的使用
        date();
        //Date的格式化
        dateFormat();
        //将字符串解析为Date类对象
        dateParse();

    }
    //Date类的使用
    public static void date() {
        Date date1 = new Date();
        System.out.println(date1.getTime());

        Date date2 = new Date(1572429796325L);
        System.out.println(date2);

        System.out.println("System.currentTimeMillis()方法：" + System.currentTimeMillis());
    }
    //Date的格式化，使用format方法，返回一个字符串
    public static void dateFormat() {
        System.out.println("日期的格式化");
        //创建SimpleDateFormat对象，构造方法中传递指定的模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        //调用SimpleDateFormat对象中的方法format，按照构造方法中的指定模式，将Date日期格式化为符合模式的字符串
        Date date3 = new Date();
        //sdf.format(date3)返回一个字符串
        System.out.println(sdf.format(date3));
        System.out.println(new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒").format(new Date()));
    }
    //将字符串解析为Date类对象
    public static void dateParse() throws ParseException {
        System.out.println("日期解析");
        //创建SimpleDateFormat对象，构造方法中传递指定的模式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date parse = sdf.parse("2019年10月30日 18时23分40秒");
        System.out.println(parse);
    }
}
