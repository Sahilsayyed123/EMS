<%-- 
    Document   : home
    Created on : Aug 30, 2023, 1:20:30 PM
    Author     : USER
--%>

<%@page import="java.io.PrintWriter"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Document</title>
    <style>
      * {
        margin: 0;
        box-sizing: border-box;
      }
      .header {
        background-color: cadetblue;
        display: flex;
        width: 100%;
        align-content: center;
        flex-wrap: wrap;
        height: 44px;
      }
      .emp,
      .view,
      .add,
      .delete,
      .update,
      .per {
        background-color: cadetblue;
        border: none;
      }
      .header-container {
        position: fixed;
        display: flex;
        align-items: center;
        width: 100%;
      }
      .title {
        padding-top: 40px;
        display: flex;
        justify-content: center;
      }
      .sp {
        padding-right: 15px;
      }
      td {
        padding: 5px;        
        border-style: none none dotted none;

      }


      .table-container {
        display: flex;
        justify-content: center;
      }
      .Table {
        border: 1px solid;
        font-size: large;
        font-family: "Lucida Sans", "Lucida Sans Regular", "Lucida Grande",
          "Lucida Sans Unicode", Geneva, Verdana, sans-serif;
        width: 96%;
        display: flex;
        background-color: white;
        justify-content: center;
        border-radius: 5px;
      }
      body {
        font-family: Arial, sans-serif;
        background-color: #f5f5f5;
        margin: 0;
        padding: 0;
      }

      .container {
        width: 400px;
        margin: 30px auto;
        padding: 20px;
        background-color: #fff;
        border-radius: 5px;
        box-shadow: 0px 2px 10px rgba(0, 0, 0, 0.1);
      }

      form {
        display: flex;
        flex-direction: column;
      }

      input[type="text"] {
        padding: 8px;
        margin-bottom: 10px;
        border: 1px solid #ccc;
        border-radius: 3px;
      }

      input[type="Submit"] {
        background-color: #007bff;
        color: white;
        padding: 10px;
        border: none;
        border-radius: 3px;
        cursor: pointer;
      }
      body {
        background-image: url("image/bg_image.avif");
        background-repeat: no-repeat;
        background-size: cover;
      }
      img {
        width: 40px;
      }       
      .icon {
        width: 24px;
      }
      .end {
        background-color: cadetblue;
        padding: 8px;
        padding-right: 20px;
      }
        .emp {
        padding-left: 10px;
      }
    </style>
  </head>
  <body>
    <div>
      <div class="header-container">
          <a href="profile.jsp">
                    <div class="emp"><img src="image/photo_8873767.png" alt="Employee management system" /></div>
          </a>

        <div class="header">
          
          <div class="sp"></div>

          <a href="adminHome.jsp">
            <div><button class="view">VIEW TABLE</button></div>
          </a>
          <div class="sp"></div>
          <a href="index.html">
            <div><button class="add">ADD</button></div>
          </a>
          <div class="sp"></div>
          <a href="update.html">
            <div><button class="update">UPDATE</button></div>
          </a>
          <div class="sp"></div>
          <a href="delete.html">
            <div><button class="delete">DELETE</button></div>
          </a>
          <div class="sp"></div>
          <a href="performance.html">
            <div><button class="per">PERFORMANCE</button></div>
          </a>
        </div>
        <div class="end">
          <a href="login.html">
            <img class="icon" src="image/right-from-bracket-solid.svg" alt="" />
          </a>
        </div>
      </div>
      <br />
      <div class="title">
          <h1>EMPLOYEES TABLE</h1>
      </div><br/><br/>
            <%String username = (String) session.getAttribute("username"); %>
    <%                
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
            PreparedStatement ps = con.prepareStatement("select * from employee");
                    ResultSet rs=ps.executeQuery();
               %>   
                <div class="table-container">
                   
               
               <div class="Table">
            <table>
                <tr>
                  <th>First Name</th>
                  <th>Last Name</th>
                  <th>Gender</th>
                  <th>DOB</th>
                  <th>Email</th>
                  <th>Username</th>
                  <th>Password</th>
                  <th>Department</th>
                  <th>Job Title</th>
                  <th>Phone</th>
                  <th>Address</th>
                </tr>                  
               <%
                    while(rs.next()){%>
                    <tr>
                        <td><%=rs.getString(1)%></td>
                        <td><%=rs.getString(2)%></td>
                        <td><%=rs.getString(3)%></td>
                        <td><%=rs.getString(4)%></td>
                        <td><%=rs.getString(5)%></td>
                        <td><%=rs.getString(6)%></td>
                        <td><%=rs.getString(7)%></td>
                        <td><%=rs.getString(8)%></td>
                        <td><%=rs.getString(9)%></td>
                        <td><%=rs.getString(11)%></td>
                        <td><%=rs.getString(12)%></td>
                        <td><button name="<%=rs.getString(6)%>  ">leaves</button></td>

                    </tr>

                <%}
                %> 
               </table>
               </div>
  </div>  
</div>
  </body>
</html>

