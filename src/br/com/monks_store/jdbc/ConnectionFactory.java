package br.com.monks_store.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    
    public Connection getConnection() {
        try {
            
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/BDVENDAS","root","jp05mc14");
            
        } catch (Exception erro) {
            throw new RuntimeException(erro);
        }
    }
}
