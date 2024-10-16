/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emart.dbutil;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author win 10
 */
public class DBConnection {
     private static Connection conn;
     
    static{
        
        
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/store", "grocery", "grocery");
            JOptionPane.showMessageDialog(null, "Connection opened successfully!","Success",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null,"Erorr in loading the Driver ","Driver Erorr",JOptionPane.ERROR_MESSAGE);
          ex.printStackTrace();
          System.exit(1);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erorr in Opening Connection ","Driver Erorr",JOptionPane.ERROR_MESSAGE);
          ex.printStackTrace();
          System.exit(1);
        }
    }
    public static  Connection getConnection(){
        return conn;
        
    }
    public static void closeConnection(){
        try{
            conn.close();
           JOptionPane.showMessageDialog(null, "Connection Close Successfully!","Success",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"Erorr in Closeing Connection ","Driver Erorr",JOptionPane.ERROR_MESSAGE);
          ex.printStackTrace();
          
        }
    } 
}
