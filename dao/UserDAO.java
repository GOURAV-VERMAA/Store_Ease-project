/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emart.dao;

import emart.dbutil.DBConnection;
import emart.pojo.UserPojo;
import emart.pojo.UserProfile;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author win 10
 */
public class UserDAO {
    public static boolean validateUser(UserPojo user) throws SQLException
    {
        Connection conn = DBConnection.getConnection();
         PreparedStatement ps = conn.prepareStatement("select * from users where userid=? and password=? and usertype=? ");
        ps.setString(1, user.getUserid());
          ps.setString(2, user.getPassword());
        ps.setString(3, user.getUsertype());
        ResultSet rs = ps.executeQuery();
        if(rs.next()){
            String username = rs.getString(5);
             UserProfile.setUsername(username);
             return true;
        }
        return false;
    }
}
