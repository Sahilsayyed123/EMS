
import java.io.*;
import javax.servlet.*;
import java.sql.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.UUID;

@WebServlet(urlPatterns = { "/extraregister" })
public class extraregister extends HttpServlet {
        public static char p[]={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	public static char ch[]={'Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M'};
	public static String doEncryption(String s)
	{
    	char c[]=new char[(s.length())];
    	for(int i=0;i<s.length();i++){
        	for(int j=0;j<26;j++)
        	{
            	if(p[j]==s.charAt(i))
            	{
                	c[i]=ch[j];
                	break;
            	}
        	}
    	}
    	return(new String(c));
	}
	public static String doDecryption(String s)
	{
    	char p1[]=new char[(s.length())];
    	for(int i=0;i<s.length();i++)
    	{
        	for(int j=0;j<26;j++)
        	{
            	if(ch[j]==s.charAt(i))
            	{
                	p1[i]=p[j];
                	break;
            	}
        	}
    	}
    	return(new String(p1));
	}


public String encrypt(String plain)
{
    int total_alphabets=26, key=3;
    String encrypted=" ", decrypted=" ";
    char ch;
    for(int i=0; i<plain.length();i++)
    {
        ch=plain.charAt(i);
        if(ch==' ')
            {
                encrypted+="-";
            }
        else if(ch>='A' && ch<='Z')
            {
            if(ch<='Z'-key)
            {
                encrypted+= String.valueOf((char)(ch+key));
            }
            else
            {
                encrypted+= String.valueOf((char)(ch-(total_alphabets-key)));
            }
            }
        else{
            encrypted+= String.valueOf(ch);
        }  
    }
    return encrypted;
}
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            String un =request.getParameter("un");
            String pn = request.getParameter("pn");
            String d = request.getParameter("d");
            String jt = request.getParameter("jt");
            String doj = request.getParameter("doj");
            String a = request.getParameter("a");

            pn=encrypt(pn.toUpperCase());
            d=encrypt(d.toUpperCase());
            jt=encrypt(jt.toUpperCase());
            doj=encrypt(doj.toUpperCase());
            a=encrypt(a.toUpperCase());
            
            

            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            if (pn != null && !pn.trim().isEmpty()) {
                PreparedStatement ps = con.prepareStatement("update employee_extra set phone=? where username=?");
                ps.setString(1,pn);
                ps.setString(2,un);
                ps.executeUpdate();
             }
             if (d != null && !d.trim().isEmpty()) {        
                 PreparedStatement ps = con.prepareStatement("update employee_extra set department=? where username=?");
                 ps.setString(1,d);
                 ps.setString(2,un);
                 ps.executeUpdate();
            }
             if (jt != null && !jt.trim().isEmpty()) {      
                 PreparedStatement ps = con.prepareStatement("update employee_extra set jobtitle=? where username=?");
                 ps.setString(1,jt);
                 ps.setString(2,un);
                 ps.executeUpdate();
            }
             if (doj != null && !doj.trim().isEmpty()) {
                 PreparedStatement ps = con.prepareStatement("update employee_extra set doj=? where username=?");
                 ps.setString(1,doj);
                 ps.setString(2,un);
                 ps.executeUpdate();

             }
             if (a != null && !a.trim().isEmpty()) {
                 PreparedStatement ps = con.prepareStatement("update employee_extra set address=? where username=?");
                 ps.setString(1,a);
                 ps.setString(2,un);
                 ps.executeUpdate();

             }             

            con.close();
            response.sendRedirect("adminHome.jsp");
        } catch (Exception e) {
            out.println(e);
        }
    }
}
