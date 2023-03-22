package com.zennyel.saodark.database;

import org.bukkit.configuration.file.FileConfiguration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySQL {

    private String host;
    private int port;
    private String database;
    private String username;
    private String password;
    private String table;

    private Connection connection;

    public MySQL(FileConfiguration config) {
        this.host = config.getString("MySQL.host");
        this.port = config.getInt("MySQL.port");
        this.database = config.getString("MySQL.database");
        this.username = config.getString("MySQL.username");
        this.password = config.getString("MySQL.password");
        this.table = config.getString("MySQL.table");
    }

    public void openConnection(String path){
        try(Connection conn = DriverManager.getConnection("jdbc:mysql:" + path);){
            System.out.println("Conexão aberta com Sucesso!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void disconnect() {
        try(Connection connection = this.getConnection()) {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Disconnected from database!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() {
        return connection;
    }

    public String getHost() {
        return host;
    }

    public int getPort() {
        return port;
    }

    public String getDatabase() {
        return database;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getTable() {
        return table;
    }
}
