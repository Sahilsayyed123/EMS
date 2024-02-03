/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author USER
 */
@WebServlet(urlPatterns = {"/loginserver"})
public class loginserver extends HttpServlet {


    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try  {
            HttpSession session = request.getSession(true);
            String uname=request.getParameter("un");
            String pass=request.getParameter("p");
            if(uname.equals("Admin") && pass.equals("admin123")){
                    session.setAttribute("username", "Admin");  
                    RequestDispatcher rd=request.getRequestDispatcher("adminHome.jsp");
                    rd.include(request,response);

            }else{
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            
            PreparedStatement p = con.prepareStatement("select * from employee ");
            ResultSet r=p.executeQuery();

            while(r.next()){
                String username=r.getString(6);
                if(uname.equals(username)){
                    PreparedStatement ps = con.prepareStatement("select password from employee where username=?");
                    ps.setString(1, uname);
                    ResultSet rs=ps.executeQuery();
                    while(rs.next()){

                    String password=rs.getString(1);
                    if(pass.equals(password)){
                        session.setAttribute("username", uname);
                        request.setAttribute("username",uname);
                        RequestDispatcher rd=request.getRequestDispatcher("home.jsp");
                        rd.include(request,response);

                    }else
                    {
                          RequestDispatcher rd=request.getRequestDispatcher("login.html");
                        rd.include(request,response);                  
                    }
                                                        }

            }
            }
            con.close();
            }
        }catch(Exception e){
            out.println(e);
    }
}
}

 