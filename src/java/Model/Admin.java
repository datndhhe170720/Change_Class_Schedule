/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Admin {
    private String account, password;

    public Admin() {
        connect();
    }

    public Admin(String account, String password) {
        this.account = account;
        this.password = password;
        connect();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
    
    
    public boolean checkAdmin() {
        try
        {
            String strSelect="select *\n" +
                            "from Admin\n" +
                            "where Account=? and Password=?";
            pstm=cnn.prepareStatement(strSelect);
            pstm.setString(1, account);//dau hoi so 1
            pstm.setString(2, password);//dau hoi so 2
            rs=pstm.executeQuery();
            if(rs.next())
            {
                return true;
            }
            else return false;
        }
        catch(Exception e)
        {
            System.out.println("CheckAdmin: "+e.getMessage());
        }
        return false;
    }
    // Khai báo các thành phần xử lý DB
    Connection cnn; // kết nối DB
    Statement stm; // thực thi câu lệnh sql
    PreparedStatement pstm; // thực thi SQL
    ResultSet rs; // lưu trữ và xử lí dữ liệu
    private void connect() {
        try {
            cnn=(new DBContext()).connection;
            if(cnn!=null) {
                System.out.println("Connect successfully !!!");
            }
            else System.out.println("Connect fail !!");
        } catch (Exception e) {
            
        }
    }
    
    public ArrayList<Admin> getListAdmin() {
        ArrayList<Admin> data = new ArrayList<Admin>();
        try {
            String strSelect = "select *\n"
                    + "from Admin\n";
//            String strSelect="select *\n" +
//"from Users\n" +
//"where account=account and Password=Password";

            //stm = cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            //rs= stm.executeQuery(strSelect);
            pstm= cnn.prepareStatement(strSelect);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String account = rs.getString(1);
                String password = rs.getString(2);
                data.add(new Admin(account, password));
            }

        } catch (Exception e) {
            System.out.println("getListAdmin: " + e.getMessage());
        }
        return data;
    }
    
}
