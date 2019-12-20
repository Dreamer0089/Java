package jdbc.resultset;

import java.sql.*;

/*
    查询stu表中的所有数据
    select * from stu
 */
public class JDBCDemoResultSet {
    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        try {
            //1.注册驱动
            Class.forName("com.mysql.cj.jdbc.Driver");

            //2.定义SQL
            String sql = "    select * from stu";

            //3.获取Connection对象
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8", "root", "1234");

            //4.获取SQL对象
            statement = connection.createStatement();

            //5.执行SQL
            resultSet = statement.executeQuery(sql);

            //6.处理结果，打印
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String sex = resultSet.getString("sex");
                String address = resultSet.getString("address");
                int math = resultSet.getInt("math");
                int english = resultSet.getInt("english");

                System.out.println(id+"-"+name+"-"+age+"-"+sex+"-"+address+"-"+math+"-"+english);
            }


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
