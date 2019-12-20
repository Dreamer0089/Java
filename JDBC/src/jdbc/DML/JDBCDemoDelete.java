package jdbc.DML;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
    删除 stu表中 杨洋的信息
    delete from stu where name = '杨洋'
 */
public class JDBCDemoDelete {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8", "root", "1234");
            statement = connection.createStatement();
            String sql = "delete from stu where name = '杨洋'";
            int i = statement.executeUpdate(sql);
            if(i > 0)
                System.out.println("删除成功！");
            else
                System.out.println("删除失败！");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            if(statement != null) {
                try {
                    statement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if(connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
