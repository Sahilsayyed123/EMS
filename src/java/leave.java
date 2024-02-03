
import java.io.*;
import javax.servlet.*;
import java.sql.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.UUID;

@WebServlet(urlPatterns = { "/leave" })
public class leave extends HttpServlet {

public String encrypt(String plaintext)
{    
    String evenchars="", oddchars="", encrypted="", decrypted="";
        int i,j=0,k=0;
	for(i=0;i<plaintext.length();i+=2)
    	evenchars+=String.valueOf(plaintext.charAt(i));
	for(i=1;i<plaintext.length();i+=2)
    	oddchars+=String.valueOf(plaintext.charAt(i));
   encrypted=evenchars+oddchars;
   return encrypted;
}



    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            String fn = request.getParameter("fn");
            String ln = request.getParameter("ln");
            String d = request.getParameter("d");
            String p = request.getParameter("p");
            String e = request.getParameter("e");
            String o = request.getParameter("o");
            String df = request.getParameter("from");
            String dt = request.getParameter("to");
            
            fn=encrypt(fn);
            ln=encrypt(ln);
            d=encrypt(d);
            p=encrypt(p);
            e=encrypt(e);
            o=encrypt(o);
            df=encrypt(df);
            dt=encrypt(dt);

            
            
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
                
             PreparedStatement ps = con.prepareStatement("insert into leavetable values(?,?,?,?,?,?,?,?)");
                ps.setString(1, fn);
                ps.setString(2, ln);
                ps.setString(3, d);
                ps.setString(4, p);
                ps.setString(5, e);
                ps.setString(6, o);
                ps.setString(7, df);
                ps.setString(8, dt);
                ps.executeUpdate();
                out.println("data Stored");
            con.close();
            response.sendRedirect("adminHome.jsp");
        } catch (Exception e) {
            out.println(e);
        }
    }
}
