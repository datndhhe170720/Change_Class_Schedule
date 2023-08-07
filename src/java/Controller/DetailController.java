/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.User;
import Model.Schedule;
import Model.Class;
import Model.Teacher;
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
public class DetailController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("mod").equals("1")) {
            String id = req.getParameter("id");
            Class c = new Class();
            c.getClass(id);
            req.setAttribute("c", c);
            req.getRequestDispatcher("UpdateClass.jsp").forward(req, resp);

        }
        
        if (req.getParameter("mod").equals("2")) {
            String id = req.getParameter("id");
            Schedule s= new Schedule();
            s.getSchedule(id);
            req.setAttribute("s", s);
            req.getRequestDispatcher("UpdateSchedule.jsp").forward(req, resp);

        }
        
        if (req.getParameter("mod").equals("3")) {
            String id = req.getParameter("id");
            Schedule s= new Schedule();
            s.getSchedule(id);
            req.setAttribute("s", s);
            req.getRequestDispatcher("AdminUpdateSchedule.jsp").forward(req, resp);

        }
        
//        if (req.getParameter("mod").equals("4")) {
//            Teacher t = new Teacher();
//            req.setAttribute("id", t.getId());
//            req.getRequestDispatcher("TeacherMenu.jsp").forward(req, resp);
//
//        }
    }

}
