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
@WebServlet(urlPatterns = {"/EventRegister"})
public class EventRegister extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Event Registration</title>");            
            out.println("</head>");
            out.println("<body>");
            String eventid = request.getParameter("eventid");
            String name = request.getParameter("name");
            String email = request.getParameter("email");
            String phone = request.getParameter("phone");
            
            try
            {
                Fillo fillo = new Fillo();
                //For signup and login table
                com.codoid.products.fillo.Connection connection = fillo.getConnection("C:\\Users\\ckris\\Desktop\\eventreg.xlsx");                
                int i = connection.executeUpdate("insert into Sheet1(EventId,Name,Email,Telephone) values('"+eventid+"','"+name+"','"+email+"','"+phone+"')");
                out.println(i);
                //RequestDispatcher view = request.getRequestDispatcher("dashboard.jsp");
                //view.forward(request, response);
                response.sendRedirect("success.jsp");
                
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
