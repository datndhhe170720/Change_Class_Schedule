/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Class;
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
public class ClassController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String classid = req.getParameter("classid");
        String student = req.getParameter("student");
        Class c= new Class(classid, student);
        if(req.getParameter("Update") != null) {
            // update
            c.updateClass();
        }
        if(req.getParameter("Add") != null) {
            // add
            c.addClass();
        }
        ArrayList<Class> data=c.getListClass(); 
        req.setAttribute("data", data);
        req.getRequestDispatcher("ListClass.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Class c = new Class();
        if (req.getParameter("mod") != null && req.getParameter("mod").equals("1")) {
            String id = req.getParameter("id");
            c.deleteClass(id);
        }
        ArrayList<Class> data = c.getListClass();
        req.setAttribute("data", data);
        req.getRequestDispatcher("ListClass.jsp").forward(req, resp);
    }
}
