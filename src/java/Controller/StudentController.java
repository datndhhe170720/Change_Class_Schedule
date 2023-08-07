/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.User;
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
public class StudentController extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("mod").equals("1")) {
            String id = req.getParameter("id");
            User u = new User();
            ArrayList<User> data = u.getStudentByClass(id);
            req.setAttribute("data", data);
            req.getRequestDispatcher("ListStudent.jsp").forward(req, resp);

        }
        if (req.getParameter("mod").equals("2")) {
            User u = new User();
            ArrayList<User> data = u.getListUser();
            req.setAttribute("data", data);
            req.getRequestDispatcher("ListStudent.jsp").forward(req, resp);

        }
        
    }
   
}
