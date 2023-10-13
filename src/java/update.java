
import java.io.*;
import javax.servlet.*;
import java.sql.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.UUID;

@WebServlet(urlPatterns = { "/update" })
public class update extends HttpServlet {
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
            String un = request.getParameter("un");
            String d = request.getParameter("d");
            String jt = request.getParameter("jt");
            String doj = request.getParameter("doj");
            String a = request.getParameter("sa");

            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
if (fn != null && !fn.trim().isEmpty()) {
    PreparedStatement ps = con.prepareStatement("update Employee set firstname=? where username=?");
     ps.setString(1,fn);
    ps.setString(2,un);
    ps.executeUpdate();

 }
 if (ln != null && !ln.trim().isEmpty()) {        
     PreparedStatement ps = con.prepareStatement("update Employee set lastname=? where username=?");
     ps.setString(1,ln);
     ps.setString(2,un);
     ps.executeUpdate();
}
 if (g != null && !g.trim().isEmpty()) {      
     PreparedStatement ps = con.prepareStatement("update Employee set gender=? where username=?");
     ps.setString(1,g);
     ps.setString(2,un);
     ps.executeUpdate();
}
 if (dob != null && !dob.trim().isEmpty()) {
     PreparedStatement ps = con.prepareStatement("update Employee set dob=? where username=?");
     ps.setString(1,dob);
     ps.setString(2,un);
     ps.executeUpdate();
}
 if (em != null && !em.trim().isEmpty()) {
     PreparedStatement ps = con.prepareStatement("update Employee set email=? where username=?");
     ps.setString(1,em);
     ps.setString(2,un);
     ps.executeUpdate();
}
 if (d != null && !d.trim().isEmpty()) {
     PreparedStatement ps = con.prepareStatement("update Employee set department=? where username=?");
     ps.setString(1,d);
     ps.setString(2,un);
     ps.executeUpdate();
}
 if (jt != null && !jt.trim().isEmpty()) {
     PreparedStatement ps = con.prepareStatement("update Employee set jobtitle=? where username=?");
     ps.setString(1,jt);
     ps.setString(2,un);
     ps.executeUpdate();
}
 if (doj != null && !doj.trim().isEmpty()) {
     PreparedStatement ps = con.prepareStatement("update Employee set dateofjoining=? where username=?");
     ps.setString(1,doj);
     ps.setString(2,un);
     ps.executeUpdate();
}
 if (a != null && !a.trim().isEmpty()) {
     PreparedStatement ps = con.prepareStatement("update Employee set address=? where username=?");
     ps.setString(1,a);
     ps.setString(2,un);
     ps.executeUpdate();

}else{
     response.sendRedirect("adminHome.jsp");
 }

            con.close();
            response.sendRedirect("adminHome.jsp");
        } catch (Exception e) {
            out.println(e);
        }
    }
}
