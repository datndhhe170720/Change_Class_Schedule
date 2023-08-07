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
public class Teacher {
    private String id, pass, name, email, gender, address;

    public Teacher() {
        connect();
    }

    public Teacher(String id, String pass, String name, String email, String gender, String address ) {
        this.id = id;
        this.pass = pass;
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.address = address;
        connect();
    }

    

    public Teacher(String id, String pass) {
        this.id = id;
        this.pass = pass;
        connect();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    public boolean checkTeacher() {
        try
        {
            String strSelect="select *\n" +
                            "from Teacher\n" +
                            "where TeacherID=? and Password=?";

            pstm=cnn.prepareStatement(strSelect);
            pstm.setString(1, id);//dau hoi so 1
            pstm.setString(2, pass);//dau hoi so 2
            rs=pstm.executeQuery();
            
            if(rs.next())
            {
                return true;
            }
            else return false;
        }
        catch(Exception e)
        {
            System.out.println("CheckTeacher: "+e.getMessage());
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
    
    public ArrayList<Teacher> getListTeacher() {
        ArrayList<Teacher> data = new ArrayList<Teacher>();
        try {
            String strSelect = "select *\n"
                    + "from Teacher\n";
            pstm= cnn.prepareStatement(strSelect);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String id = rs.getString(1);
                String pass = rs.getString(2);
                String name = rs.getString(3);
                String email = rs.getString(4);
                String gender = "Female";
                if (rs.getBoolean(5)) {
                    gender = "Male";
                }
                String address = rs.getString(6);
                data.add(new Teacher(id, pass, name, email, gender, address));
            }
        } catch (Exception e) {
            System.out.println("getListUser: " + e.getMessage());
        }
        return data;
    }
    
    public void getTeacher(String idd) {
        try {
            String strSelect = "select *\n"
                    + "from Teacher\n"
                    + "where TeacherID=?";
            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, idd);
            rs = pstm.executeQuery();
            while (rs.next()) {
                id = rs.getString(1);
                pass = rs.getString(2);
                name = rs.getString(3);
                email = rs.getString(4);
                gender = "Female";
                if (rs.getBoolean(5)) {
                    gender = "Male";
                }
                address = rs.getString(6);
                //data.add(new User(account, password, name, dob, gender, address));
            }

        } catch (Exception e) {
            System.out.println("getTeacher: " + e.getMessage());
        }
        // return data;
    }
    
    
}
