package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySql {
    public Connection connection;

    public Connection mySqlConnect() {
        
            try {
                Class.forName("com.mysql.jdbc.Driver");
                this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstore","root","");
            System.out.println("MySQL Connected."); 
            } catch (ClassNotFoundException | SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }  
            return this.connection;
        
             
    }
}
