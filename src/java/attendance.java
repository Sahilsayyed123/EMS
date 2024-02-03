
import java.io.*;
import javax.servlet.*;
import java.sql.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.util.UUID;

@WebServlet(urlPatterns = { "/attendance" })
public class attendance extends HttpServlet {

    public String encrypt(String plain,int columns)
    {
            String encrypted="",decrypted="";
    int i,j,k;
    char chmat[][],ch;
        if(columns>=plain.length() || columns==1)
        {
            return plain;
        }
        int rows=(int)(Math.ceil(plain.length()/(float)columns));
        chmat=new char[(int)rows][columns];
        k=0;
        abc:
        for(i=0;i<rows;i++)
        {
            for(j=0;j<columns;j++)
            {
                if(k>=plain.length()) break abc;
                else
                    chmat[i][j]=plain.charAt(k);
                    k++;
            }
        }
            for(i=0;i<columns;i++)
            {
                for(j=0;j<rows;j++)
                {
                    ch=chmat[j][i];
                    if(ch=='_')
                        encrypted+='_';
                    else
                        encrypted+=ch;
                }
            }
            return encrypted;
        }

	


    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            String id = request.getParameter("id");
            String eid = request.getParameter("eid");
            String at = request.getParameter("at");
            String ename = request.getParameter("ename");
 
            id=encrypt(id.toUpperCase(),2);
            eid=encrypt(eid.toUpperCase(),2);
            at=encrypt(at.toUpperCase(),2);
            ename=encrypt(ename.toUpperCase(),2);

            
            
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
                PreparedStatement ps = con.prepareStatement("insert into attendance values(?,?,?,?)");
                ps.setString(1, id);
                ps.setString(2, eid);
                ps.setString(3, at);
                ps.setString(4, ename);
                ps.executeUpdate();

            con.close();
            response.sendRedirect("index.html");
        } catch (Exception e) {
            out.println(e);
        }
    }
}
