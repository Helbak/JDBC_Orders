package ordersJDBC;

import java.sql.*;

public class WriterSQL {

    static final String DB_CONNECTION = "jdbc:mysql://localhost:3306/db_orders";
    static final String DB_USER = "root";
    static final String DB_PASSWORD = "sadd72131hg!@";
    static Connection conn;
    private Statement stmt;
    private String sql;
    private PreparedStatement ps;

    public WriterSQL() {
    }

    public void writerSql(String sql) {

        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
            conn = DriverManager.getConnection(DB_CONNECTION, DB_USER, DB_PASSWORD);
        } catch (
                SQLException e) {
            e.printStackTrace();
        }

        PreparedStatement ps = null;
        try {
            ps = null;
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            ps = conn.prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }


        try {
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


        }




