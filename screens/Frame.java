package screens;

import java.awt.*;
import java.sql.Connection;
import java.util.ArrayList;

import javax.swing.*;

import classes.Book;
import classes.BookService;
import classes.MySql;

public class Frame {
    public Frame(){
        // Book book1 = new Book();
        // book1.setSubjectName("Thai Ianguage");
        // book1.setSubjectCode("A");
        // book1.setSubjectBookPicture(null);
        // book1.setSubjectBookPrice(220);
        // Book book2 = new Book();
        // book2.setSubjectName("Social Studies");
        // book2.setSubjectCode("B");
        // book2.setSubjectBookPicture(null);
        // book2.setSubjectBookPrice(129);
        // Book book3 = new Book();
        // book3.setSubjectName("English");
        // book3.setSubjectCode("C");
        // book3.setSubjectBookPicture(null);
        // book3.setSubjectBookPrice(189);
        // Book book4 = new Book();
        // book4.setSubjectName("Mathematics");
        // book4.setSubjectCode("D");
        // book4.setSubjectBookPicture(null);
        // book4.setSubjectBookPrice(325);
        // Book book5 = new Book();
        // book5.setSubjectName("Science");
        // book5.setSubjectCode("E");
        // book5.setSubjectBookPicture(null);
        // book5.setSubjectBookPrice(299);
        // Book book6 = new Book();
        // book6.setSubjectName("Chemistry");
        // book6.setSubjectCode("F");
        // book6.setSubjectBookPicture(null);
        // book6.setSubjectBookPrice(275);
        // Book book7 = new Book();
        // book7.setSubjectName("Biology");
        // book7.setSubjectCode("G");
        // book7.setSubjectBookPicture(null);
        // book7.setSubjectBookPrice(265);
        // Book book8 = new Book();
        // book8.setSubjectName("Physics");
        // book8.setSubjectCode("H");
        // book8.setSubjectBookPicture(null);
        // book8.setSubjectBookPrice(245);
        // Book book9 = new Book();
        // book9.setSubjectName("Music");
        // book9.setSubjectCode("I");
        // book9.setSubjectBookPicture(null);
        // book9.setSubjectBookPrice(199);
        // Book book10 = new Book();
        // book10.setSubjectName("Health education");
        // book10.setSubjectCode("J");
        // book10.setSubjectBookPicture(null);
        // book10.setSubjectBookPrice(185);
        // Book book11 = new Book();
        // book11.setSubjectName("Art");
        // book11.setSubjectCode("K");
        // book11.setSubjectBookPicture(null);
        // book11.setSubjectBookPrice(150);
        MySql mySql = new MySql();
        Connection connection = mySql.mySqlConnect();

        BookService bookService = new BookService(connection);
        ArrayList<Book> books = bookService.listAll();

       JFrame frame = new JFrame("Nanashop");
       JPanel panel = new JPanel();
       panel.setLayout(new FlowLayout()); 
       JLabel label = new JLabel("Nanashop");
       JButton button = new JButton();
       button.setText("Button");
       panel.add(label);
       panel.add(button);
       frame.add(panel);
       String data [][] = {
        {books.get(0).getSubjectName(),books.get(0).getSubjectCode(),books.get(0).getSubjectBookPicture(),books.get(0).getSubjectBookPrice()},
        {books.get(1).getSubjectName(),books.get(1).getSubjectCode(),books.get(1).getSubjectBookPicture(),books.get(1).getSubjectBookPrice()},
        {books.get(2).getSubjectName(),books.get(2).getSubjectCode(),books.get(2).getSubjectBookPicture(),books.get(2).getSubjectBookPrice()},
        {books.get(3).getSubjectName(),books.get(3).getSubjectCode(),books.get(3).getSubjectBookPicture(),books.get(3).getSubjectBookPrice()},
        {books.get(4).getSubjectName(),books.get(4).getSubjectCode(),books.get(4).getSubjectBookPicture(),books.get(0).getSubjectBookPrice()},
        {books.get(5).getSubjectName(),books.get(5).getSubjectCode(),books.get(5).getSubjectBookPicture(),books.get(1).getSubjectBookPrice()},
        {books.get(6).getSubjectName(),books.get(6).getSubjectCode(),books.get(6).getSubjectBookPicture(),books.get(2).getSubjectBookPrice()},
        {books.get(7).getSubjectName(),books.get(7).getSubjectCode(),books.get(7).getSubjectBookPicture(),books.get(3).getSubjectBookPrice()},
        {books.get(8).getSubjectName(),books.get(8).getSubjectCode(),books.get(8).getSubjectBookPicture(),books.get(0).getSubjectBookPrice()},
        {books.get(9).getSubjectName(),books.get(9).getSubjectCode(),books.get(9).getSubjectBookPicture(),books.get(1).getSubjectBookPrice()},
        {books.get(10).getSubjectName(),books.get(10).getSubjectCode(),books.get(10).getSubjectBookPicture(),books.get(2).getSubjectBookPrice()},
        
       
    };
String column[]={"Name","Code","Picture","Price"};
JTable jt=new JTable(data,column);
jt.setBounds(30,40,200,300);
JScrollPane sp = new JScrollPane(jt);
frame.add(sp);

       frame.setSize(1500,500);
       frame.setLocationRelativeTo(button);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setLayout(new BorderLayout());

       JPanel inputPanel = new JPanel();
       inputPanel.(setLayout());

       frame.setVisible(true);


       
    }   
}
