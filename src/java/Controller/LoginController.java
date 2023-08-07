/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Admin;
import Model.Teacher;
import Model.User;
import Model.Class;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class LoginController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try ( PrintWriter out = resp.getWriter()) {
            String account = req.getParameter("account");
            String password = req.getParameter("password");
            Admin a = new Admin(account, password);
            Teacher t = new Teacher(account, password);
            User u = new User();
            Class c = new Class();
            boolean checkAdmin = a.checkAdmin();
            boolean checkTeacher = t.checkTeacher();
            boolean ok = true;

            if (account.isEmpty() || password.isEmpty()) {
                ok = false;
                req.setAttribute("message", "DO NOT EMPTY");
                if (account.isEmpty()) {
                    req.setAttribute("AccEr", "Pls fill Account!");
                }
                if (password.isEmpty()) {
                    req.setAttribute("PassEr", "Pls fill Password!");
                }
            }
            if (ok) {
                if (checkAdmin) {
                    ArrayList<Class> data = c.getListClass();
//                    ArrayList<User> data = u.getListUser();
                    req.setAttribute("data", data);
                    req.getRequestDispatcher("AdminMenu.jsp").forward(req, resp);
                } 
                else if (checkTeacher) {
                    req.setAttribute("id", t.getId());
                    req.getRequestDispatcher("TeacherMenu.jsp").forward(req, resp);
                } else {
                    req.getRequestDispatcher("Login.jsp").forward(req, resp);
                }

            } else {
                req.getRequestDispatcher("Login.jsp").forward(req, resp);
            }

        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.sendRedirect("Login.jsp");
    }

}
