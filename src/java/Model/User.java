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
public class User {

    private String account, classid, password, name, dob, gender, address;

    public User() {
        connect();

    }

    public User(String account, String classid, String password, String name, String dob, String gender, String address) {
        this.account = account;
        this.classid = classid;
        this.password = password;
        this.name = name;
        this.dob = dob;
        this.gender = gender;
        this.address = address;
        connect();
    }

    public User(String account, String password) {
        this.account = account;
        this.password = password;
        connect();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
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

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public boolean checkUser() {
        try {
            String strSelect = "select *\n"
                    + "from Student\n"
                    + "where account=? and Password=?";

            pstm = cnn.prepareStatement(strSelect);
            pstm.setString(1, account);//dau hoi so 1
            pstm.setString(2, password);//dau hoi so 2
            rs = pstm.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            System.out.println("CheckUser: " + e.getMessage());
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
            cnn = (new DBContext()).connection;
            if (cnn != null) {
                System.out.println("Connect successfully !!!");
            } else {
                System.out.println("Connect fail !!");
            }
        } catch (Exception e) {

        }
    }

    public boolean addStudent() {
        try {
            String sqlSelect = "insert into Student values(?,?,?,?,?,?,?)";
            pstm = cnn.prepareStatement(sqlSelect);
            pstm.setString(1, account);
            pstm.setString(2, classid);
            pstm.setString(3, password);
            pstm.setString(4, name);
            if (gender.equalsIgnoreCase("male")) {
                pstm.setBoolean(5, true);
            } else {
                pstm.setBoolean(6, false);
            }
            pstm.setString(7, address);
            pstm.setDate(8, java.sql.Date.valueOf(dob)); //java.sql.Date.valueOf(dob)
            pstm.execute();
            return true;
        } catch (Exception e) {
            System.out.println("addUser: " + e);
        }
        return false;
    }

    public ArrayList<User> getListUser() {
        ArrayList<User> data = new ArrayList<User>();
        try {
            String strSelect = "select * from Student";

            pstm = cnn.prepareStatement(strSelect);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String account = rs.getString(1);
                String classid = rs.getString(2);
                String password = rs.getString(3);
                String name = rs.getString(4);
                String gender = "Female";
                if (rs.getBoolean(5)) {
                    gender = "Male";
                }

                String address = rs.getString(6);
                SimpleDateFormat f = new SimpleDateFormat("dd--MM--yyyy");
                String dob = "";
                if (rs.getDate(7) != null) {
                    dob = f.format(rs.getDate(7));
                }
                data.add(new User(account, classid, password, name, dob, gender, address));
            }

        } catch (Exception e) {
            System.out.println("getListUser: " + e.getMessage());
        }
        return data;
    }

    public void getUser(String acc) {
        try {
            String strSelect = "select *\n"
                    + "from Users\n"
                    + "where account='" + acc + "'";
            pstm = cnn.prepareStatement(strSelect);
            rs = pstm.executeQuery();
            while (rs.next()) {
                account = rs.getString(1);
                classid = rs.getString(2);
                password = rs.getString(3);
                name = rs.getString(4);
                gender = "Female";
                if (rs.getBoolean(5)) {
                    gender = "Male";
                }

                address = rs.getString(6);
                SimpleDateFormat f = new SimpleDateFormat("dd--MM--yyyy");

                dob = "";
                if (rs.getDate(7) != null) {
                    dob = f.format(rs.getDate(7));
                }
                //data.add(new User(account, password, name, dob, gender, address));
            }

        } catch (Exception e) {
            System.out.println("getUser: " + e.getMessage());
        }
        // return data;
    }

    public ArrayList<User> getStudentByClass(String id) {
        ArrayList<User> data = new ArrayList<User>();
        try {
            String sqlSelect = "select * from Student where ClassID=?";
            pstm = cnn.prepareStatement(sqlSelect);
            pstm.setString(1, id);
            rs = pstm.executeQuery();
            while (rs.next()) {
                classid = rs.getString(1);
                account = rs.getString(2);;
                password = rs.getString(3);
                name = rs.getString(4);
                gender = "Female";
                if (rs.getBoolean(5)) {
                    gender = "Male";
                }

                address = rs.getString(6);
                SimpleDateFormat f = new SimpleDateFormat("dd--MM--yyyy");

                dob = "";
                if (rs.getDate(7) != null) {
                    dob = f.format(rs.getDate(7));
                }
                data.add(new User(account, classid, password, name, dob, gender, address));
            }
        } catch (Exception e) {
            System.out.println("getStudentByClass" + e);
        }
        return data;
    }

    public void updateStudent() {
        try {
            String strUpdate = "update Student set ClassID=?,Password=?,name=?,gender=?,address=?,dateofbirth=? where account=?";
            pstm = cnn.prepareStatement(strUpdate);
            pstm.setString(1, classid);
            pstm.setString(2, password);
            pstm.setString(3, name);
            pstm.setBoolean(4, Boolean.parseBoolean(gender));
            pstm.setString(5, address);
            pstm.setDate(6, java.sql.Date.valueOf(dob));
            pstm.setString(7, account);
            pstm.execute();
        } catch (Exception e) {
            System.out.println("updateStudent:" + e.getMessage());
        }
    }

    public void deleteStudent(String id) {
        try {
            String strDelete = "delete Student where ProductID=?";
            pstm = cnn.prepareStatement(strDelete);
            pstm.setInt(1, Integer.parseInt(id));
            pstm.execute();
        } catch (Exception e) {
            System.out.println("deleteStudent:" + e.getMessage());
        }
    }

}
