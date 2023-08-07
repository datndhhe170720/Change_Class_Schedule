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
public class Class {
    private String classid, student;

    public Class() {
        connect();
    }

    public Class(String classid, String student) {
        this.classid = classid;
        this.student = student;
        connect();
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
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
    
     public ArrayList<Class> getListClass() {
        ArrayList<Class> data = new ArrayList<Class>();
        try {
            String strSelect = "select *\n"
                    + "from Class\n";
            //rs= stm.executeQuery(strSelect);
            pstm= cnn.prepareStatement(strSelect);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String classid = rs.getString(1);
                String student = rs.getString(2);
                data.add(new Class(classid, student));
            }
        } catch (Exception e) {
            System.out.println("getListClass: " + e.getMessage());
        }
        return data;
    }
     
     public void getClass(String id) {
        try {
            String strSelect = "select *\n"
                    + "from Class\n"
                    + "where ClassID='" + id + "'";
//            String strSelect="select *\n" +
//"from Users\n" +
//"where account=account and Password=Password";

            //stm = cnn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            //rs = stm.executeQuery(strSelect);
            pstm = cnn.prepareStatement(strSelect);
            rs = pstm.executeQuery();
            while (rs.next()) {
                classid = rs.getString(1);
                student = rs.getString(2);
                
                //data.add(new User(account, password, name, dob, gender, address));
            }

        } catch (Exception e) {
            System.out.println("getClass: " + e.getMessage());
        }
        // return data;
    }
     
     public void updateClass() {
        try {
            String strUpdate = "update Class set Student=? where ClassID=?";
            pstm = cnn.prepareStatement(strUpdate);
            pstm.setString(1, student);
            pstm.setString(2, classid);
            pstm.execute();
        } catch (Exception e) {
            System.out.println("Update:" + e.getMessage());
        }
    }

    public void deleteClass(String id) {
        try {
            String strDelete = "delete Class where ClassID=?";
            pstm = cnn.prepareStatement(strDelete);
            pstm.setString(1, id);
            pstm.execute();
        } catch (Exception e) {
            System.out.println("Delete:" + e.getMessage());
        }
    }
    
    public void addClass() {
        try {
            String strAdd = "insert into Class values(?,?)";
            pstm = cnn.prepareStatement(strAdd);
//            pstm.setInt(1, Integer.parseInt(ProductID));
            pstm.setString(1, classid);
            pstm.setString(2, student);
            pstm.execute();
        } catch (Exception e) {
            System.out.println("AddClass: " + e.getMessage());
        }
    }
}
