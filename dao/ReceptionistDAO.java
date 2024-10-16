/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emart.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import emart.dbutil.DBConnection;
import emart.pojo.UserPojo;
import java.util.Map;
import java.sql.Statement;
import java.sql.SQLException; 
import java.util.HashMap;


/**
 *
 * @author win 10
 */
public class ReceptionistDAO {
    public static Map<String,String> getNonRegisteredReceptionists() throws SQLException{
        Connection conn = DBConnection.getConnection();
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select empid,empname from employees where job = 'Receptionist' and empid not in (select empid from users where usertype = 'Receptionist')");
        HashMap<String,String> receptionistList = new HashMap<>();
        
        while(rs.next()){
            String id = rs.getString(1);
            String name = rs.getString(2);
            receptionistList.put(id, name);
            
        }
        return receptionistList;
    }
    
    public static boolean addReceptionist(UserPojo user) throws SQLException
    {
        Connection con = DBConnection.getConnection();
        PreparedStatement ps = con.prepareStatement("Insert into users values(?,?,?,?,?)");
        ps.setString(1, user.getUserid());
        ps.setString(2, user.getEmpid());
        ps.setString(3, user.getPassword());
        ps.setString(4, user.getUsertype());
        ps.setString(5, user.getUsername());
        int result = ps.executeUpdate();
        return result==1;
        
    }
}
