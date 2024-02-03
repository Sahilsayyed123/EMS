
import java.io.*;
import javax.servlet.*;
import java.sql.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.UUID;

@WebServlet(urlPatterns = { "/emsServer" })
public class emsServer extends HttpServlet {

	public String encrypt(String plain,int key)
	{
        int total_alphabets=26;
	String encrypted=" ", decrypted=" ";
	char ch;
     	for(int i=0;i<plain.length();i++)
     	{
         	ch=plain.charAt(i);
         	if(ch==' ')
             	encrypted+="-";
         	else if(ch>='A' && ch<='Z')
         	{
             	if(ch<='Z'-key)
                 	encrypted+=String.valueOf((char)(ch+key));
             	else
                 	encrypted+=String.valueOf((char)(ch-(total_alphabets-key)));
         	}
         	else
             	encrypted+=String.valueOf(ch);
     	}
     	return encrypted;
	}


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
            String cp = request.getParameter("cp");
            String p=request.getParameter("p");
            out.println(fn);
            fn=encrypt(fn.toUpperCase(),2);
            ln=encrypt(ln.toUpperCase(),2);
            g=encrypt(g.toUpperCase(),2);
            dob=encrypt(dob.toUpperCase(),2);
            em=encrypt(em.toUpperCase(),2);
            p=encrypt(p.toUpperCase(),2);
            
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
                PreparedStatement ps = con.prepareStatement("insert into Employee values(?,?,?,?,?,?,?)");
                ps.setString(1, fn);
                ps.setString(2, ln);
                ps.setString(3, g);
                ps.setString(4, dob);
                ps.setString(5, em);
                ps.setString(6, un);
                ps.setString(7, p);
                ps.executeUpdate();
//
//                PreparedStatement ps1 = con.prepareStatement("insert into Employee_extra values(?,?,?,?,?,?)");
//                ps1.setString(1," ");
//                ps1.setString(2," ");
//                ps1.setString(3," ");
//                ps1.setString(4," ");
//                ps1.setString(5," ");
//                ps1.setString(6,un);
//                
//
//                ps1.executeUpdate();

            con.close();
            response.sendRedirect("newhtml.html");
        } catch (Exception e) {
            out.println(e);
        }
    }
}
