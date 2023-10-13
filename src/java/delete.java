
import java.io.*;
import javax.servlet.*;
import java.sql.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.UUID;

@WebServlet(urlPatterns = { "/delete" })
public class delete extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            HttpSession session = request.getSession(false); // Retrieve the existing session if it exists

            if (session != null) {
            String value = (String) session.getAttribute("username");
            out.println(value);
            }

          
            String un = request.getParameter("un");
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            
                PreparedStatement ps = con.prepareStatement("delete from employee where username=?");         
                ps.setString(1, un);
                ps.executeUpdate();
            con.close();
            response.sendRedirect("adminHome.jsp");
        } catch (Exception e) {
            out.println(e);
        }
    }
}
