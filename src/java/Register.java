/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.codoid.products.fillo.Fillo;
import com.codoid.products.fillo.Recordset;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;

/**
 *
 * @author USER
 */
@WebServlet(urlPatterns = {"/Register"})
public class Register extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Adding to database</title>");            
            out.println("</head>");
            out.println("<body>");
            String name = request.getParameter("Name");
            String email = request.getParameter("Email");
            String phone = request.getParameter("Telephone");
            String username = request.getParameter("Username");
            String password = request.getParameter("Password");
            try
            {
                Fillo fillo = new Fillo();
                //For signup and login table
                com.codoid.products.fillo.Connection connection = fillo.getConnection("C:\\Users\\ckris\\Desktop\\login.xlsx");                
                int i = connection.executeUpdate("insert into Sheet1(Name,Email,Telephone,Username,Password) values('"+name+"','"+email+"','"+phone+"','"+username+"','"+password+"')");
                out.println(i);
                RequestDispatcher view = request.getRequestDispatcher("login.jsp");
                view.forward(request, response);

                
            }catch(Exception e)
            {
                e.printStackTrace();
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
