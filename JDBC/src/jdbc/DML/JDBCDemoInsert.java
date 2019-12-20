package jdbc.DML;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
    stu表  添加一条记录 insert语句
    insert into stu values(101,'杨洋',22,'男','湖北武汉',146,99)
 */
public class JDBCDemoInsert {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2.定义SQL
            String sql = "insert into stu values(101,'杨洋',22,'男','湖北武汉',146,99)";

            //3.获取Connection对象
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8", "root", "1234");

            //4.获取SQL对象
            statement = connection.createStatement();

            //5.执行SQL
            int i = statement.executeUpdate(sql);//影响的行数

            //6.处理结果，打印
            if(i > 0)
                System.out.println("添加成功！");
            else
                System.out.println("添加失败！");

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
