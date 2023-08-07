/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Schedule;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class TeacherScheduleController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String stt = req.getParameter("stt");
        String subject = req.getParameter("subject");
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String classid = req.getParameter("classid");
        String slot = req.getParameter("slot");
        String date = req.getParameter("date");
        String status = req.getParameter("status");
        Schedule s = new Schedule(stt, subject, id, classid, slot, date, status);
        req.setAttribute("idd", s.getStt());
        boolean checkExist = s.Exist();
        if (req.getParameter("Update") != null) {
            // update
            if (checkExist) {
            String idd= req.getParameter("id");
            s.getSchedule(idd);
            req.setAttribute("s", s);
                req.setAttribute("Err", "Selected date and slot already exists");
                req.getRequestDispatcher("UpdateSchedule.jsp").forward(req, resp);
            } else {
                // Update schedule in databas
                s.updateSchedule();

            }
            if (req.getParameter("Add") != null) {
                // add
                s.addScheduleTeacher();
            }
//        ArrayList<Schedule> data=s.getListSchedule(); 
//        req.setAttribute("data", data);
//        req.getRequestDispatcher("S.jsp").forward(req, resp);

            ArrayList<Schedule> data = s.getScheduleByID(id);
            req.setAttribute("data", data);
            req.getRequestDispatcher("ScheduleTeacher.jsp").forward(req, resp);

        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String stt = req.getParameter("stt");
        String status = req.getParameter("status");
        Schedule s = new Schedule(stt, status);
        if (req.getParameter("Update") != null) {
            // update
            s.updateScheduleAdmin();
        }
        if (req.getParameter("Add") != null) {
            // add
            s.addScheduleTeacher();
        }
//        ArrayList<Schedule> data=s.getListSchedule(); 
//        req.setAttribute("data", data);
//        req.getRequestDispatcher("S.jsp").forward(req, resp);

        ArrayList<Schedule> data = s.getListSchedule();
        req.setAttribute("data", data);
        req.getRequestDispatcher("ScheduleAdmin.jsp").forward(req, resp);
    }

}
