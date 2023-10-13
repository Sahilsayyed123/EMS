
import java.io.*;
import javax.servlet.*;
import java.sql.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.UUID;

@WebServlet(urlPatterns = { "/emsServer" })
public class emsServer extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            String fn = request.getParameter("fn");
            String ln = request.getParameter("ln");
            String g = request.getParameter("g");
            String dob = request.getParameter("dob");
            String em = request.getParameter("em");
            String pn = request.getParameter("pn");
            String un = request.getParameter("un");
            String p = request.getParameter("p");
            String cp = request.getParameter("cp");
            String d = request.getParameter("d");
            String jt = request.getParameter("jt");
            String doj = request.getParameter("doj");
            String a = request.getParameter("a");



            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
                PreparedStatement ps = con.prepareStatement("insert into Employee values(?,?,?,?,?,?,?,?,?,?,?,?)");
                ps.setString(1, fn);
                ps.setString(2, ln);
                ps.setString(3, g);
                ps.setString(4, dob);
                ps.setString(5, em);
                ps.setString(6, un);
                ps.setString(7, p);
                ps.setString(8, d);
                ps.setString(9, jt);
                ps.setString(10, doj);
                ps.setString(11, pn);
                ps.setString(12, a);
                
;

                ps.executeUpdate();
            con.close();
            response.sendRedirect("adminHome.jsp");
        } catch (Exception e) {
            out.println(e);
        }
    }
}
