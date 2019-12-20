package jdbc.first;
/*
    jdbc 入门
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
/*
    Exception in thread "main" java.sql.SQLException: The server time zone value 'ÖÐ¹ú±ê×¼Ê±¼ä' is
    unrecognized or represents more than one time zone. You must configure either the server or JDBC
    driver (via the serverTimezone configuration property) to use a more specifc time zone value if
    you want to utilize time zone support.
    at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:127)
    以上该错误为是系统时间错误只需要在访问数据库的Url后面加上以下的语句即可：?serverTimezone=GMT%2B8
        例：jdbc:mysql://localhost:port/test?serverTimezone=GMT%2B8

 */
public class JDBCDemoFirst {
    public static void main(String[] args) throws Exception {

        //1. 导入驱动jar包
        //2. 注册驱动
        //Class.forName("com.mysql.cj.jdbc.Driver");

        //3. 获取数据库连接对象（Connection）
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8", "root", "1234");

        //4. 定义SQL语句
        String sql = "update stu set age = 51 where id = 1";

        //5. 获取执行SQL语句的对象Statement
        Statement statement = connection.createStatement();

        //6. 执行SQL，接受返回结果
        //7. 处理结果
        int i = statement.executeUpdate(sql);
        System.out.println(i);

        //8. 释放资源
        statement.close();
        connection.close();
    }
}
