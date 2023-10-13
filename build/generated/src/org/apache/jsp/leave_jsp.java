package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class leave_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("  <head>\n");
      out.write("    <meta charset=\"UTF-8\" />\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("    <title>Document</title>\n");
      out.write("    <style>\n");
      out.write("      * {\n");
      out.write("        margin: 0;\n");
      out.write("        box-sizing: border-box;\n");
      out.write("      }\n");
      out.write("      .header {\n");
      out.write("        background-color: cadetblue;\n");
      out.write("        display: flex;\n");
      out.write("        width: 100%;\n");
      out.write("        align-content: center;\n");
      out.write("        flex-wrap: wrap;\n");
      out.write("        height: 44px;\n");
      out.write("      }\n");
      out.write("      .emp,\n");
      out.write("      .view,\n");
      out.write("      .add,\n");
      out.write("      .delete,\n");
      out.write("      .update,\n");
      out.write("      .per {\n");
      out.write("        background-color: cadetblue;\n");
      out.write("        border: none;\n");
      out.write("      }\n");
      out.write("      .header-container {\n");
      out.write("        position: fixed;\n");
      out.write("        display: flex;\n");
      out.write("        align-items: center;\n");
      out.write("        width: 100%;\n");
      out.write("      }\n");
      out.write("      .title {\n");
      out.write("        padding-top: 40px;\n");
      out.write("        display: flex;\n");
      out.write("        justify-content: center;\n");
      out.write("      }\n");
      out.write("      .sp {\n");
      out.write("        padding-right: 15px;\n");
      out.write("      }\n");
      out.write("      td {\n");
      out.write("        padding: 5px;        \n");
      out.write("        border-style: none none dotted none;\n");
      out.write("\n");
      out.write("      }\n");
      out.write("\n");
      out.write("\n");
      out.write("      .table-container {\n");
      out.write("        display: flex;\n");
      out.write("        justify-content: center;\n");
      out.write("      }\n");
      out.write("      .Table {\n");
      out.write("        border: 1px solid;\n");
      out.write("        font-size: large;\n");
      out.write("        font-family: \"Lucida Sans\", \"Lucida Sans Regular\", \"Lucida Grande\",\n");
      out.write("          \"Lucida Sans Unicode\", Geneva, Verdana, sans-serif;\n");
      out.write("        width: 96%;\n");
      out.write("        display: flex;\n");
      out.write("        background-color: white;\n");
      out.write("        justify-content: center;\n");
      out.write("        border-radius: 5px;\n");
      out.write("      }\n");
      out.write("      body {\n");
      out.write("        font-family: Arial, sans-serif;\n");
      out.write("        background-color: #f5f5f5;\n");
      out.write("        margin: 0;\n");
      out.write("        padding: 0;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      .container {\n");
      out.write("        width: 400px;\n");
      out.write("        margin: 30px auto;\n");
      out.write("        padding: 20px;\n");
      out.write("        background-color: #fff;\n");
      out.write("        border-radius: 5px;\n");
      out.write("        box-shadow: 0px 2px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      form {\n");
      out.write("        display: flex;\n");
      out.write("        flex-direction: column;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      input[type=\"text\"] {\n");
      out.write("        padding: 8px;\n");
      out.write("        margin-bottom: 10px;\n");
      out.write("        border: 1px solid #ccc;\n");
      out.write("        border-radius: 3px;\n");
      out.write("      }\n");
      out.write("\n");
      out.write("      input[type=\"Submit\"] {\n");
      out.write("        background-color: #007bff;\n");
      out.write("        color: white;\n");
      out.write("        padding: 10px;\n");
      out.write("        border: none;\n");
      out.write("        border-radius: 3px;\n");
      out.write("        cursor: pointer;\n");
      out.write("      }\n");
      out.write("      body {\n");
      out.write("        background-image: url(\"image/bg_image.avif\");\n");
      out.write("        background-repeat: no-repeat;\n");
      out.write("        background-size: cover;\n");
      out.write("      }\n");
      out.write("      img {\n");
      out.write("        width: 40px;\n");
      out.write("      }       \n");
      out.write("      .icon {\n");
      out.write("        width: 24px;\n");
      out.write("      }\n");
      out.write("      .end {\n");
      out.write("        background-color: cadetblue;\n");
      out.write("        padding: 8px;\n");
      out.write("        padding-right: 20px;\n");
      out.write("      }\n");
      out.write("        .emp {\n");
      out.write("        padding-left: 10px;\n");
      out.write("      }\n");
      out.write("    </style>\n");
      out.write("  </head>\n");
      out.write("  <body>\n");
      out.write("    <div>\n");
      out.write("      <div class=\"header-container\">\n");
      out.write("          <a href=\"profile.jsp\">\n");
      out.write("                    <div class=\"emp\"><img src=\"image/photo_8873767.png\" alt=\"Employee management system\" /></div>\n");
      out.write("          </a>\n");
      out.write("\n");
      out.write("        <div class=\"header\">\n");
      out.write("          \n");
      out.write("          <div class=\"sp\"></div>\n");
      out.write("\n");
      out.write("          <a href=\"adminHome.jsp\">\n");
      out.write("            <div><button class=\"view\">VIEW TABLE</button></div>\n");
      out.write("          </a>\n");
      out.write("          <div class=\"sp\"></div>\n");
      out.write("          <a href=\"index.html\">\n");
      out.write("            <div><button class=\"add\">ADD</button></div>\n");
      out.write("          </a>\n");
      out.write("          <div class=\"sp\"></div>\n");
      out.write("          <a href=\"update.html\">\n");
      out.write("            <div><button class=\"update\">UPDATE</button></div>\n");
      out.write("          </a>\n");
      out.write("          <div class=\"sp\"></div>\n");
      out.write("          <a href=\"delete.html\">\n");
      out.write("            <div><button class=\"delete\">DELETE</button></div>\n");
      out.write("          </a>\n");
      out.write("          <div class=\"sp\"></div>\n");
      out.write("          <a href=\"performance.html\">\n");
      out.write("            <div><button class=\"per\">PERFORMANCE</button></div>\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"end\">\n");
      out.write("          <a href=\"login.html\">\n");
      out.write("            <img class=\"icon\" src=\"image/right-from-bracket-solid.svg\" alt=\"\" />\n");
      out.write("          </a>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <br />\n");
      out.write("      <div class=\"title\">\n");
      out.write("          <h1>EMPLOYEES TABLE</h1>\n");
      out.write("      </div><br/><br/>\n");
      out.write("            ");
String username = (String) session.getAttribute("username"); 
      out.write("\n");
      out.write("    ");
                
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            PreparedStatement ps = con.prepareStatement("select * from leavetable");
                    ResultSet rs=ps.executeQuery();
               
      out.write("   \n");
      out.write("                <div class=\"table-container\">\n");
      out.write("                   \n");
      out.write("               \n");
      out.write("               <div class=\"Table\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                  <th>First Name</th>\n");
      out.write("                  <th>Last Name</th>\n");
      out.write("                  <th>Department</th>\n");
      out.write("                  <th>Phone</th>\n");
      out.write("                  <th>Email</th>\n");
      out.write("                  <th>Reason</th>\n");
      out.write("                  <th>From</th>\n");
      out.write("                  <th>To</th>\n");
      out.write("                </tr>                  \n");
      out.write("               ");

                    while(rs.next()){
      out.write("\n");
      out.write("                    <tr><td>");
      out.print(rs.getString(1));
      out.write("</td><td>");
      out.print(rs.getString(2));
      out.write("</td><td>");
      out.print(rs.getString(3));
      out.write("</td><td>");
      out.print(rs.getString(4));
      out.write("</td><td>");
      out.print(rs.getString(5));
      out.write("</td><td>");
      out.print(rs.getString(6));
      out.write("</td><td>");
      out.print(rs.getString(7));
      out.write("</td><td>");
      out.print(rs.getString(8));
      out.write("</td></tr>\n");
      out.write("                ");
 }
                
      out.write(" \n");
      out.write("               </table>\n");
      out.write("               </div>\n");
      out.write("  </div>  \n");
      out.write("</div>\n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
