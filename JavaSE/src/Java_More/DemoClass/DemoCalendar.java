package Java_More.DemoClass;

import java.util.Calendar;

/*
        日历类
            Calendar类是一个抽象类，提供了操作日历字段的方法（YEAR，MONTY，DAY_OF_MONTH,HOUR）
            Calendar类无法直接创建对象使用，
                getInstance()方法返回了Calendar类的子类对象
                static Calendar getInstance() 使用默认时区和语言环境获得一个日历
            常用方法
                public int get(int field):返回给定的日历字段的值
                public void set(int field, int value):将给定的日历字段设置为给定值
                public abstract void add(int field, int amount):根据日历规则，为给定的日历字段添加或减去指定的时间量
                public Date getTime():返回一个表示此Calendar时间值的Date对象
                成员方法的参数：
                    int field:日历类字段，可以使用Calendar类的静态成员变量获取
                    public static final int YEAR = 1;           年
                    public static final int MONTH = 2;          月
                    public static final int DATE = 5;           月中的某一天
                    public static final int DAY_OF_MONTH = 5;   月中的某一天
                    public static final int HOUR = 10;          时
                    public static final int MINUTE = 12;        分
                    public static final int SECOND = 13;        秒

                    int value:给指定字段设置的值

 */
public class DemoCalendar {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        System.out.println(instance);

        System.out.println("============");

        //public int get(int field):返回给定的日历字段的值
        System.out.println("年份："+instance.get(Calendar.YEAR));
        //西方的月份是0-11
        System.out.println("月份：" + (instance.get(Calendar.MONTH) + 1));
        System.out.println("日：" + instance.get(Calendar.DAY_OF_MONTH));

        //public void set(int field, int value):将给定的日历字段设置为给定值
        instance.set(Calendar.YEAR,2021);
        System.out.println("设置后的年份："+instance.get(Calendar.YEAR));
        //同时设定年、月、日
        instance.set(9999,1,1);
        System.out.println("年份："+instance.get(Calendar.YEAR));
        System.out.println("月份：" + instance.get(Calendar.MONTH));
        System.out.println("日：" + instance.get(Calendar.DAY_OF_MONTH));

        //public abstract void add(int field, int amount):根据日历规则，为给定的日历字段添加或减去指定的时间量
        //field:字段，amount：时间量（正为增加，负为减少）
        instance.add(Calendar.MONTH,3);
        System.out.println("年份："+instance.get(Calendar.YEAR));
        System.out.println("月份：" + instance.get(Calendar.MONTH));
        System.out.println("日：" + instance.get(Calendar.DAY_OF_MONTH));

        //public Date getTime():返回一个表示此Calendar时间值的Date对象
        //将日历对象转化为日期对象
        System.out.println(instance.getTime());

    }
}
