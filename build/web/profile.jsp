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

          </head>
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
              padding: 18px;
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
              width: 70%;
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

            .left {
              border-radius: 20px 0px 0px 20px;
            }
            .profile_card {
              height: 450px;
              width: 700px;
              background-color: #f5c7f9;
              border-radius: 20px;
              display: flex;
            }
            .profile {
              display: flex;
              height: 100%;
              justify-content: center;
              padding-top: 87px;
            }
            .left {
              height: 100%;
              width: 35%;
              background-color: #696eff;
            }
            .right {
              height: 100%;
              width: 65%;
            }
            .infodetail {
              display: flex;
              justify-content: space-between;
              padding: 20px 40px 25px 40px;
            }

            .sub-class {
              padding: 10px;
            }

            .headers {
              padding-top: 5%;
              padding-left: 50px;
            }

            .line {
              margin: 15px 0px 0px 50px;
            }
            .b-container {
              display: flex;
              padding-left: 40px;
            }

            .b1,
            .b2,
            .b3 {
              height: 60px;
              width: 60px;
              background-color: #696eff;
              margin: 10px;
              border-radius: 10px;
               display: flex;
              justify-content: center;
              align-items: center;
            }

            .left {
              display: flex;
              justify-content: center;
              align-items: center;
            }
            .name,
            .job {
              padding-top: 20px;
              display: flex;
              justify-content: center;
            }
          </style>
          <body>
            <div>
              <div class="header-container">
                <a href="profile.jsp">
                  <div class="emp">
                    <img src="image/photo_8873767.png" alt="Employee management system" />
                  </div>
                </a>

                <div class="header">
                  <div class="sp"></div>

                  <a href="home.jsp">
                    <div><button class="view">VIEW TABLE</button></div>
                  </a>
                  <div class="sp"></div>

                  <a href="leave.html">
                    <div><button class="per">APPLY LEAVE</button></div>
                  </a>
                </div>
                <div class="end">
                  <a href="login.html">
                    <img class="icon" src="image/right-from-bracket-solid.svg" alt="" />
                  </a>
                </div>
              </div>
              <br />

            <%                
                    String username = (String) session.getAttribute("username");

                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/sample", "app", "app");
                    PreparedStatement ps = con.prepareStatement("select * from employee where username =?");
                    ps.setString(1,username);
                            ResultSet rs=ps.executeQuery();
                       %>   

                       <%
                            while(rs.next()){%>


              <div class="profile">
                <div class="profile_card">
                  <div class="left">
                    <div class="r-container">
                      <b><div class="name"><%=rs.getString(1)%></div></b>
                      <div class="job"><%=rs.getString(9)%></div>
                    </div>
                  </div>
                  <div class="right">
                    <div>
                      <div class="headers"><h2>INFORMATION</h2></div>
                      <hr class="line" width="360px" color="black" />
                      <div class="infodetail">
                        <div class="sub-class">
                          <div>Email</div>
                          <div><%=rs.getString(5)%></div>
                        </div>
                        <div class="sub-class">
                          <div>Phone</div>
                          <div>+91 <%=rs.getString(11)%></div>
                        </div>
                      </div>
                      <div class="headers"><h2>DETAILS</h2></div>
                      <hr class="line" width="360px" color="black" />
                      <div class="infodetail">
                        <div class="sub-class">
                          <div>address</div>
                          <div><%=rs.getString(12)%></div>
                        </div>
                        <div class="sub-class">
                          <div>username</div>
                          <div><%=rs.getString(6)%></div>
                        </div>
                      </div>
                      <div>
                        <div></div>
                      </div>
                    </div>
                    <div class="b-container">
                      <div class="b1"><img src="image/facebook-app-symbol.png" alt="" /></i></div>
                      <div class="b2"><img src="image/github.png" alt="" /></div>
                      <div class="b3"><img src="image/instagram.png" alt="" /></div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
                        <%        }
                        %> 
          </body>
        </html>


