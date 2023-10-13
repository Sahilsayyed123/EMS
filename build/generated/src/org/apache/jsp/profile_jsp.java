package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    \n");
      out.write("  </head>\n");
      out.write("  <style>\n");
      out.write("    * {\n");
      out.write("      margin: 0;\n");
      out.write("      box-sizing: border-box;\n");
      out.write("    }\n");
      out.write("    .header {\n");
      out.write("      background-color: cadetblue;\n");
      out.write("      display: flex;\n");
      out.write("      width: 100%;\n");
      out.write("      align-content: center;\n");
      out.write("      flex-wrap: wrap;\n");
      out.write("      height: 44px;\n");
      out.write("    }\n");
      out.write("    .emp,\n");
      out.write("    .view,\n");
      out.write("    .add,\n");
      out.write("    .delete,\n");
      out.write("    .update,\n");
      out.write("    .per {\n");
      out.write("      background-color: cadetblue;\n");
      out.write("      border: none;\n");
      out.write("    }\n");
      out.write("    .header-container {\n");
      out.write("      position: fixed;\n");
      out.write("      display: flex;\n");
      out.write("      align-items: center;\n");
      out.write("      width: 100%;\n");
      out.write("    }\n");
      out.write("    .title {\n");
      out.write("      padding-top: 40px;\n");
      out.write("      display: flex;\n");
      out.write("      justify-content: center;\n");
      out.write("    }\n");
      out.write("    .sp {\n");
      out.write("      padding-right: 15px;\n");
      out.write("    }\n");
      out.write("    td {\n");
      out.write("      padding: 18px;\n");
      out.write("      border-style: none none dotted none;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .table-container {\n");
      out.write("      display: flex;\n");
      out.write("      justify-content: center;\n");
      out.write("    }\n");
      out.write("    .Table {\n");
      out.write("      border: 1px solid;\n");
      out.write("      font-size: large;\n");
      out.write("      font-family: \"Lucida Sans\", \"Lucida Sans Regular\", \"Lucida Grande\",\n");
      out.write("        \"Lucida Sans Unicode\", Geneva, Verdana, sans-serif;\n");
      out.write("      width: 70%;\n");
      out.write("      display: flex;\n");
      out.write("      background-color: white;\n");
      out.write("      justify-content: center;\n");
      out.write("      border-radius: 5px;\n");
      out.write("    }\n");
      out.write("    body {\n");
      out.write("      font-family: Arial, sans-serif;\n");
      out.write("      background-color: #f5f5f5;\n");
      out.write("      margin: 0;\n");
      out.write("      padding: 0;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .container {\n");
      out.write("      width: 400px;\n");
      out.write("      margin: 30px auto;\n");
      out.write("      padding: 20px;\n");
      out.write("      background-color: #fff;\n");
      out.write("      border-radius: 5px;\n");
      out.write("      box-shadow: 0px 2px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    form {\n");
      out.write("      display: flex;\n");
      out.write("      flex-direction: column;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    input[type=\"text\"] {\n");
      out.write("      padding: 8px;\n");
      out.write("      margin-bottom: 10px;\n");
      out.write("      border: 1px solid #ccc;\n");
      out.write("      border-radius: 3px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    input[type=\"Submit\"] {\n");
      out.write("      background-color: #007bff;\n");
      out.write("      color: white;\n");
      out.write("      padding: 10px;\n");
      out.write("      border: none;\n");
      out.write("      border-radius: 3px;\n");
      out.write("      cursor: pointer;\n");
      out.write("    }\n");
      out.write("    body {\n");
      out.write("      background-image: url(\"image/bg_image.avif\");\n");
      out.write("      background-repeat: no-repeat;\n");
      out.write("      background-size: cover;\n");
      out.write("    }\n");
      out.write("    img {\n");
      out.write("      width: 40px;\n");
      out.write("    }\n");
      out.write("    .icon {\n");
      out.write("      width: 24px;\n");
      out.write("    }\n");
      out.write("    .end {\n");
      out.write("      background-color: cadetblue;\n");
      out.write("      padding: 8px;\n");
      out.write("      padding-right: 20px;\n");
      out.write("    }\n");
      out.write("    .emp {\n");
      out.write("      padding-left: 10px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .left {\n");
      out.write("      border-radius: 20px 0px 0px 20px;\n");
      out.write("    }\n");
      out.write("    .profile_card {\n");
      out.write("      height: 450px;\n");
      out.write("      width: 700px;\n");
      out.write("      background-color: #f5c7f9;\n");
      out.write("      border-radius: 20px;\n");
      out.write("      display: flex;\n");
      out.write("    }\n");
      out.write("    .profile {\n");
      out.write("      display: flex;\n");
      out.write("      height: 100%;\n");
      out.write("      justify-content: center;\n");
      out.write("      padding-top: 87px;\n");
      out.write("    }\n");
      out.write("    .left {\n");
      out.write("      height: 100%;\n");
      out.write("      width: 35%;\n");
      out.write("      background-color: #696eff;\n");
      out.write("    }\n");
      out.write("    .right {\n");
      out.write("      height: 100%;\n");
      out.write("      width: 65%;\n");
      out.write("    }\n");
      out.write("    .infodetail {\n");
      out.write("      display: flex;\n");
      out.write("      justify-content: space-between;\n");
      out.write("      padding: 20px 40px 25px 40px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .sub-class {\n");
      out.write("      padding: 10px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .headers {\n");
      out.write("      padding-top: 5%;\n");
      out.write("      padding-left: 50px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .line {\n");
      out.write("      margin: 15px 0px 0px 50px;\n");
      out.write("    }\n");
      out.write("    .b-container {\n");
      out.write("      display: flex;\n");
      out.write("      padding-left: 40px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .b1,\n");
      out.write("    .b2,\n");
      out.write("    .b3 {\n");
      out.write("      height: 60px;\n");
      out.write("      width: 60px;\n");
      out.write("      background-color: #696eff;\n");
      out.write("      margin: 10px;\n");
      out.write("      border-radius: 10px;\n");
      out.write("       display: flex;\n");
      out.write("      justify-content: center;\n");
      out.write("      align-items: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    .left {\n");
      out.write("      display: flex;\n");
      out.write("      justify-content: center;\n");
      out.write("      align-items: center;\n");
      out.write("    }\n");
      out.write("    .name,\n");
      out.write("    .job {\n");
      out.write("      padding-top: 20px;\n");
      out.write("      display: flex;\n");
      out.write("      justify-content: center;\n");
      out.write("    }\n");
      out.write("  </style>\n");
      out.write("  <body>\n");
      out.write("    <div>\n");
      out.write("      <div class=\"header-container\">\n");
      out.write("        <a href=\"profile.jsp\">\n");
      out.write("          <div class=\"emp\">\n");
      out.write("            <img src=\"image/photo_8873767.png\" alt=\"Employee management system\" />\n");
      out.write("          </div>\n");
      out.write("        </a>\n");
      out.write("\n");
      out.write("        <div class=\"header\">\n");
      out.write("          <div class=\"sp\"></div>\n");
      out.write("\n");
      out.write("          <a href=\"home.jsp\">\n");
      out.write("            <div><button class=\"view\">VIEW TABLE</button></div>\n");
      out.write("          </a>\n");
      out.write("          <div class=\"sp\"></div>\n");
      out.write("\n");
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
      out.write("      \n");
      out.write("    ");
                
            String username = (String) session.getAttribute("username");

            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            PreparedStatement ps = con.prepareStatement("select * from employee where username =?");
            ps.setString(1,username);
                    ResultSet rs=ps.executeQuery();
               
      out.write("   \n");
      out.write("             \n");
      out.write("               ");

                    while(rs.next()){
      out.write("\n");
      out.write("\n");
      out.write("                \n");
      out.write("      <div class=\"profile\">\n");
      out.write("        <div class=\"profile_card\">\n");
      out.write("          <div class=\"left\">\n");
      out.write("            <div class=\"r-container\">\n");
      out.write("              <b><div class=\"name\">");
      out.print(rs.getString(1));
      out.write("</div></b>\n");
      out.write("              <div class=\"job\">");
      out.print(rs.getString(9));
      out.write("</div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"right\">\n");
      out.write("            <div>\n");
      out.write("              <div class=\"headers\"><h2>INFORMATION</h2></div>\n");
      out.write("              <hr class=\"line\" width=\"360px\" color=\"black\" />\n");
      out.write("              <div class=\"infodetail\">\n");
      out.write("                <div class=\"sub-class\">\n");
      out.write("                  <div>Email</div>\n");
      out.write("                  <div>");
      out.print(rs.getString(5));
      out.write("</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"sub-class\">\n");
      out.write("                  <div>Phone</div>\n");
      out.write("                  <div>+91 ");
      out.print(rs.getString(11));
      out.write("</div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"headers\"><h2>DETAILS</h2></div>\n");
      out.write("              <hr class=\"line\" width=\"360px\" color=\"black\" />\n");
      out.write("              <div class=\"infodetail\">\n");
      out.write("                <div class=\"sub-class\">\n");
      out.write("                  <div>address</div>\n");
      out.write("                  <div>");
      out.print(rs.getString(12));
      out.write("</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"sub-class\">\n");
      out.write("                  <div>username</div>\n");
      out.write("                  <div>");
      out.print(rs.getString(6));
      out.write("</div>\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <div>\n");
      out.write("                <div></div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"b-container\">\n");
      out.write("              <div class=\"b1\"><img src=\"image/facebook-app-symbol.png\" alt=\"\" /></i></div>\n");
      out.write("              <div class=\"b2\"><img src=\"image/github.png\" alt=\"\" /></div>\n");
      out.write("              <div class=\"b3\"><img src=\"image/instagram.png\" alt=\"\" /></div>\n");
      out.write("            </div>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("                ");
        }
                
      out.write(" \n");
      out.write("  </body>\n");
      out.write("</html>\n");
      out.write("\n");
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