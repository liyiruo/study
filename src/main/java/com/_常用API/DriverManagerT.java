package com._常用API;

import java.sql.*;

/**
 * jdbc运用了抽象工厂模式
 * @author liyiruo
 */
public class DriverManagerT {

    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("","","");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select *from users");
        if (resultSet.next()) {
            System.out.println(resultSet.next());

        }
    }
}
