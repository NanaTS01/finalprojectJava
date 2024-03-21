package classes;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class BookService {
    public Connection connection;

    public BookService(Connection connection) {
        this.connection = connection;
    }

    public ArrayList<Book> listAll() {
        ArrayList<Book> books = new ArrayList<>();
        try {
    
      Statement statement = this.connection.createStatement();
      String sqlText = "SELECT * FROM book";
      ResultSet resultSet = statement.executeQuery(sqlText);
      Book book;
      while (resultSet.next()) {
        book = new Book();
        book.setSubjectName(resultSet.getString("subjectname"));
        book.setSubjectCode(resultSet.getString("subjectCode"));
        book.setSubjectBookPicture(resultSet.getString("subjectBookPicture"));
        book.setSubjectBookPrice(resultSet.getInt("subjectBookPrice"));
      }
      connection.close();
      } catch(SQLException e) {
        // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return books;
    }
}
