package jdbc.Plus;

import util.JDBCUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
    查询stu表中的所有数据,将其封装为对象，装载集合，返回
    sql：select * from stu

    步骤：
        1.定义Student类
        2.定义方法public List<Student> findAll() {}
        3.实现方法
 */
public class Demo {

    public static void main(String[] args) throws NullPointerException {
        List<Student> list = new Demo().findAll();
        System.out.println(list);
    }


    /*
        定义方法：查询所有stu对象
     */
    public List<Student> findAll() {
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;

        List<Student> students = null;

        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?serverTimezone=GMT%2B8", "root", "1234");
//
            connection = JDBCUtils.getConnection();

            statement = connection.createStatement();

            String sql = "select * from stu";

            resultSet = statement.executeQuery(sql);

            Student student = new Student();
            students = new ArrayList<>();

            while (resultSet.next()) {
                //获取数据
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String sex = resultSet.getString("sex");
                String address = resultSet.getString("address");
                int math = resultSet.getInt("math");
                int english = resultSet.getInt("english");

                student.setId(id);
                student.setName(name);
                student.setAge(age);
                student.setSex(sex);
                student.setAddress(address);
                student.setMath(math);
                student.setEnglish(english);

                students.add(student);
            }



        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
//            if(resultSet != null) {
//                try {
//                    resultSet.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if(statement != null) {
//                try {
//                    statement.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }
//            if(connection != null) {
//                try {
//                    connection.close();
//                } catch (SQLException e) {
//                    e.printStackTrace();
//                }
//            }

            JDBCUtils.close(resultSet,statement,connection);

        }
        return students;
    }
}
