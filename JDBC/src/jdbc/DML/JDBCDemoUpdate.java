package jdbc.DML;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
    修改记录    stu表 杨洋的英语分数改为90
    update stu set english = 90 where name = '杨洋'
 */
public class JDBCDemoUpdate {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2.定义SQL
            String sql = "update stu set english = 90 where name = '杨洋'";

            //3.获取Connection对象
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8", "root", "1234");

            //4.获取SQL对象
            statement = connection.createStatement();

            //5.执行SQL
            int i = statement.executeUpdate(sql);//影响的行数

            //6.处理结果，打印
            if(i > 0)
                System.out.println("修改成功！");
            else
                System.out.println("修改失败！");

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
