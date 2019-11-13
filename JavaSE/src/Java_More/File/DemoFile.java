package Java_More.File;

import java.io.File;
import java.io.IOException;

/*
        java.io.File
        文件和目录路径名的抽象表示形式。
        Java把电脑中的文件和文件夹（目录）封装为了一个File类，
        使用File类对文件和文件夹进行操作
        使用File类的方法
            创建文件/文件夹
            删除文件/文件夹
            获取文件/文件夹
            判断文件/文件夹是否存在
            对文件夹进行遍历
            获取文件的大小

    File类是一个与系统无关的类，任何操作系统都可以使用这个类中的方法
        重点：
            file:文件
            directory:文件夹/目录
            path:路径
    方法：
        static String pathSeparator 与系统有关的路径分隔符，为了方便，它被表示为一个字符串。
        static char pathSeparatorChar 与系统有关的路径分隔符。
        static String separator 与系统有关的默认名称分隔符，为了方便，它被表示为一个字符串。
        static char separatorChar 与系统有关的默认名称分隔符。
    操作路径：路径不能写死了
        Windows系统：  F:\test\\a.txt
        Linux系统：    F:/test/a.txt
        两系统下的路径分隔符不一样，因此要写成：
            "F:" + File.separator + "test" + File.separator + "a.txt"

    路径：
        绝对路径：   一个完整路径
                    以盘符开始的路径
                    例如：F:\\test\\a.txt
        相对路径：   一个简化的路径
                    相对指的是相对于当前项目的根目录
                    根目录：（F:\\test\\）
                    简化书写：a.txt
        注意：
            1.路径不区分大小写
            2.路径中的文件名称的分隔符Windows中使用反斜杠，
            反斜杠是转义字符，两个反斜杠代表一个正常的反斜杠

    File类常用方法;
        获取功能的方法：
            public String getAbsolutePath()：返回此File的绝对路径名字符串。
            public String getPath()：将此File转换为路径名字符串。
            public String getName()：返回由此File表示的文件或目录的名称。
            public long length()：返回由此File表示的文件的大小。以字节为单位，文件夹大小为0、找不到文件也返回0
        判断功能的方法：
            public boolean exists()：此File表示的文件或目录是否实际存在。

            使用前提：需要存在，不存在均返回false
            在使用前可使用exists()方法进行判断
            public boolean isDirectory()：此File表示的是否为目录。
            public boolean isFile()：此File表示的是否为文件。

        创建删除功能的方法：
            public boolean createNewFile()：当且仅当具有该名称的文件尚不存在时，创建一个新的空文件。
            public boolean delete()：删除由此File表示的文件或目录。delete方法，如果此File表示目录，则目录必须为空才能删除。
            public boolean mkdir()：创建由此File表示的目录。单级空文件夹
            public boolean mkdirs()：创建由此File表示的目录，包括任何必需但不存在的父目录。

        目录的遍历：
            public String[] list()：返回一个String数组，表示该File目录中的所有子文件或目录。
            public File[] listFiles()：返回一个File数组，表示该File目录中的所有的子文件或目录。
            注意：list方法和listFile方法遍历的是构造方法中给出的目录
                    如果构造方法中给出的目录的路径不存在，会抛出空指针异常
                    如果构造方法中给出的路径不是一个目录，也会抛出空指针异常
                  隐藏文件也可被遍历
 */
public class DemoFile {
    public static void main(String[] args) throws IOException, NullPointerException {
        System.out.println(File.pathSeparator);
        System.out.println(File.pathSeparatorChar);
        System.out.println(File.separator);
        System.out.println(File.separatorChar);

        File f1 = new File("F:\\\\test\\\\a.txt");
        System.out.println(f1);

        //public String getAbsolutePath()：返回此File的绝对路径名字符串
        System.out.println(f1.getAbsolutePath());

        //public String getPath()：将此File转换为路径名字符串。
        System.out.println(f1.getPath());

        //public String getName()：返回由此File表示的文件或目录的名称。
        System.out.println(f1.getName());

        //public long length()：返回由此File表示的文件的长度。
        System.out.println(f1.length());

        //public boolean exists()：此File表示的文件或目录是否实际存在。

        System.out.println(f1.exists());

        //public boolean isDirectory()：此File表示的是否为目录。
        System.out.println(f1.isDirectory());

        //public boolean isFile()：此File表示的是否为文件。
        System.out.println(f1.isFile());

        File f2 = new File("f:\\test\\b.txt");
        System.out.println(f2.createNewFile());
        System.out.println("======================");
        File f3 = new File("f:\\test\\");

        String[] arr = f3.list();
        for (String s : arr) {
            System.out.println(s);
        }
        System.out.println("======================");

        File[] files = f3.listFiles();
        for (File f:files) {
            System.out.println(f);
        }
    }


}
