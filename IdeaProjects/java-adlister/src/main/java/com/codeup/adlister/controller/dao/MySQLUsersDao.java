package com.codeup.adlister.controller.dao;


import com.codeup.adlister.controller.models.User;
import com.sun.deploy.config.Config;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class MySQLUsersDao implements Users {

    private Connection connection = null;

    public MySQLUsersDao() {
        try {
            DriverManager.registerDriver(new Driver() {
                @Override
                public Connection connect(String url, Properties info) throws SQLException {
                    return null;
                }

                @Override
                public boolean acceptsURL(String url) throws SQLException {
                    return false;
                }

                @Override
                public DriverPropertyInfo[] getPropertyInfo(String url, Properties info) throws SQLException {
                    return new DriverPropertyInfo[0];
                }

                @Override
                public int getMajorVersion() {
                    return 0;
                }

                @Override
                public int getMinorVersion() {
                    return 0;
                }

                @Override
                public boolean jdbcCompliant() {
                    return false;
                }

                @Override
                public Logger getParentLogger() throws SQLFeatureNotSupportedException {
                    return null;
                }
            });
            connection = DriverManager.getConnection(
                    Config.url,
                    Config.user,
                    Config.password
            );
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }

    }



    @Override
    public User findByUsername(String username) {

        String sql = "SELECT * users WHERE username = ?";

        try{
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, username);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                return new User(
                        rs.getLong("id"),
                        rs.getString("username"),
                        rs.getString("password"),
                        rs.getString("email")
                );
            } else {
                return null;
            }
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }

    }

    @Override
    public Long insert(User user) {
        return null;
    }


    @Override
    public Long insert(User user) {
        String sql = "INSERT INTO users(username, password, email) VALUES (?, ?, ?)";

        try {
            PreparedStatement stmt = connection.prepareStatement(
                    sql, Statement.RETURN_GENERATED_KEYS
            );

            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getPassword());
            stmt.setString(3, user.getEmail());
            stmt.executeUpdate();

            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }
    }
}