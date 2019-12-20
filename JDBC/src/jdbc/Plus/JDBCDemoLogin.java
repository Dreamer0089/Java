package jdbc.Plus;

import util.JDBCUtils;

import java.sql.*;
import java.util.Scanner;

/*
    1.通过键盘录入用户名和密码
    2.判断用户是否登录成功
 */
public class JDBCDemoLogin {
    public static void main(String[] args) {
        //1.通过键盘录入用户名和密码
        Scanner scanner = new Scanner(System.in);

        System.out.println("输入用户名：");
        String username = scanner.nextLine();
        System.out.println("输入密码：");
        String password = scanner.nextLine();

        //2.调用方法
        //boolean flag = new JDBCDemoLogin().loginStatement(username, password);
        boolean flag = new JDBCDemoLogin().loginPreparedStatement(username, password);

        //3.判断结果，输出不同语句
        if(flag)
            System.out.println("登录成功！");
        else
            System.out.println("用户名或密码错误");


    }




    /*
        登录方法
            使用Statement执行sql对象
     */
    public boolean loginStatement(String username,String password) {
        if(username == null || password == null) {
            return false;
        }
        //连接数据库判断是否登录成功

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        try {
            //1.获取数据库连接
            connection = JDBCUtils.getConnection();
            //2.SQL语句
            String sql = "select * from user where username = '"+username+"' and password = '"+password+"' ";

            //System.out.println(sql);

            //3.获取执行SQL的对象
            statement = connection.createStatement();

            //4.获取结果集
            resultSet = statement.executeQuery(sql);

            //查到了返回true，没有查到返回false
            return resultSet.next();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(resultSet,statement,connection);
        }

        return false;
    }

    /*
    登录方法
            使用PreparedStatement执行sql对象
     */
    public boolean loginPreparedStatement(String username,String password) {
        if(username == null || password == null) {
            return false;
        }
        //连接数据库判断是否登录成功

        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;

        try {
            //1.获取数据库连接
            connection = JDBCUtils.getConnection();
            //2.SQL语句
            String sql = "select * from user where username = ? and password = ?";

            //3.获取执行SQL的对象
            preparedStatement = connection.prepareStatement(sql);

            //给参数赋值
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);

            //4.获取结果集
            resultSet = preparedStatement.executeQuery();

            //查到了返回true，没有查到返回false
            return resultSet.next();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close(resultSet,preparedStatement,connection);
        }

        return false;
    }
}
