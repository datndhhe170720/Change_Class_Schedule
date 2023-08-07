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
public class Schedule {

    private String stt, subject, id, name, classid, slot, date, status;

    public Schedule() {
        connect();
    }

    public Schedule(String stt, String status) {
        this.stt = stt;
        this.status = status;
        connect();
    }

    public Schedule(String status) {
        this.status = status;
        connect();
    }

    public Schedule(String stt, String subject, String id, String classid, String slot, String date, String status) {
        this.stt = stt;
        this.subject = subject;
        this.id = id;
        this.classid = classid;
        this.slot = slot;
        this.date = date;
        this.status = status;
        connect();
    }

    
    
    public Schedule(String stt, String subject, String id, String name, String classid, String slot, String date, String status) {
        this.stt = stt;
        this.subject = subject;
        this.id = id;
        this.name = name;
        this.classid = classid;
        this.slot = slot;
        this.date = date;
        this.status = status;
        connect();
    }

    public String getStt() {
        return stt;
    }

    public void setStt(String stt) {
        this.stt = stt;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public ArrayList<Schedule> getListSchedule() {
        ArrayList<Schedule> data = new ArrayList<Schedule>();
        try {
            String strSelect = "select * from Schedule order by Date";
            pstm = cnn.prepareStatement(strSelect);
            rs = pstm.executeQuery();
            while (rs.next()) {
                String stt = String.valueOf(rs.getInt(1));
                String subject = rs.getString(2);
                String id = rs.getString(3);
                String name = rs.getString(4);
                String classid = rs.getString(5);
                String slot = rs.getString(6);
                SimpleDateFormat f = new SimpleDateFormat("dd--MM--yyyy");
                String date = "";
                if (rs.getDate(7) != null) {
                    date = f.format(rs.getDate(7));
                }
                String status = rs.getString(8);
                data.add(new Schedule(stt, subject, id, name, classid, slot, date, status));
            }

        } catch (Exception e) {
            System.out.println("getListUser: " + e.getMessage());
        }
        return data;
    }

    public ArrayList<Schedule> getScheduleByID(String idd) {
        ArrayList<Schedule> data = new ArrayList<Schedule>();
        try {
            String sqlSelect = "select * from Schedule where TeacherID='" + idd + "' order by Date";
            pstm = cnn.prepareStatement(sqlSelect);
            rs = pstm.executeQuery();
            while (rs.next()) {
                id = rs.getString(3);
                stt = rs.getString(1);
                subject = rs.getString(2);
                name = rs.getString(4);;
                classid = rs.getString(5);
                slot = rs.getString(6);
                SimpleDateFormat f = new SimpleDateFormat("dd--MM--yyyy");

                date = "";
                if (rs.getDate(7) != null) {
                    date = f.format(rs.getDate(7));
                }
                status = rs.getString(8);
                data.add(new Schedule(stt, subject, id, name, classid, slot, date, status));
            }
        } catch (Exception e) {
            System.out.println("getTeacherByID" + e);
        }
        return data;
    }
    
    
    public void updateSchedule() {
        try {
            String strUpdate="update Schedule set SubjectCode=?,TeacherID=?,ClassID=?, Slot=?,Date=?, Status=? where ID=?";
            pstm=cnn.prepareStatement(strUpdate);
            pstm.setString(1, subject);
            pstm.setString(2, id);
            pstm.setString(3, classid);
            pstm.setString(4, slot);
            pstm.setDate(5, java.sql.Date.valueOf(date));
            pstm.setString(6, status);
            pstm.setInt(7, Integer.parseInt(stt));
            pstm.execute();
        } catch (Exception e) {
            System.out.println("updateSchedule:" + e.getMessage());
        }
    }
    public void updateScheduleAdmin() {
        try {
            String strUpdate="update Schedule set Status=? where ID=?";
            pstm=cnn.prepareStatement(strUpdate);
            pstm.setString(1, status);
            pstm.setInt(2, Integer.parseInt(stt));
            pstm.execute();
        } catch (Exception e) {
            System.out.println("updateScheduleAdmin:" + e.getMessage());
        }
    }
    
    public boolean Exist() {
        try {
            String strExist="select * from Schedule where Slot=? and Date=? order by Date";
            pstm=cnn.prepareStatement(strExist);
            pstm.setString(1, slot);
            pstm.setDate(2, java.sql.Date.valueOf(date));
            rs = pstm.executeQuery();
        if(rs.next())
            {
                return true;
            }
            else return false;
        }
        catch(Exception e)
        {
            System.out.println("CheckUser: "+e.getMessage());
        }
        return false;
    }
    

    public void addScheduleTeacher() {
        try {
            String strAdd = "insert into Schedule values(?,?,?,?,?,?,?)";
            pstm = cnn.prepareStatement(strAdd);
//            pstm.setInt(1, Integer.parseInt(ProductID));
            pstm.setString(1, subject);
            pstm.setString(2, id);
            pstm.setString(3, name);
            pstm.setString(4, classid);
            pstm.setString(5, slot);
            pstm.setDate(6, java.sql.Date.valueOf(date));
            pstm.setString(7, status);
            pstm.execute();
        } catch (Exception e) {
            System.out.println("addSchedule: " + e.getMessage());
        }
    }
    
    public void getSchedule(String idd) {
        try {
            String strSelect = "select * from Schedule where ID=?";
            pstm=cnn.prepareStatement(strSelect);
            pstm.setInt(1, Integer.parseInt(idd));
            rs = pstm.executeQuery();
            while (rs.next()) {
                stt = String.valueOf(rs.getInt(1));
                 subject = rs.getString(2);
                 id = rs.getString(3);
                 name = rs.getString(4);
                 classid = rs.getString(5);
                 slot = rs.getString(6);
                 SimpleDateFormat f = new SimpleDateFormat("dd--MM--yyyy");
                date = "";
                if (rs.getDate(7) != null) {
                    date = f.format(rs.getDate(7));
                }
                status = rs.getString(8);
                }
                //data.add(new Product(ProductID, ProductName, UnitPrice, UnitStock, Image, CategoryID, Discontinued));
            

        } catch (Exception e) {
            System.out.println("getSchedule: " + e.getMessage());
        }
        //return data;
        
    }
}
