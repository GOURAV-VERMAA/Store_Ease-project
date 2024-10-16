/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emart.pojo;

/**
 *
 * @author win 10
 */
public class UserPojo {

    @Override
    public String toString() {
        return "UserPojo{" + "userid=" + userid + ", empid=" + empid + ", password=" + password + ", usertyp=" + usertyp + ", username=" + username + '}';
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getEmpid() {
        return empid;
    }

    public void setEmpid(String empid) {
        this.empid = empid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsertype() {
        return usertyp;
    }

    public void setUsertype(String usertyp) {
        this.usertyp = usertyp;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    private String userid;
    private String empid;
    private String password;
    private String usertyp;
    private String username;
    
}
