<%--
  Created by IntelliJ IDEA.
  User: nowic
  Date: 20.07.2019
  Time: 10:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>

        <h1><% out.print("Hello World from JSP!");%></h1>


        <form action="FormServlet" method="post">
            <p>
                Login
                </br>
                <input type="text" name="login">
            </p>
            <p>
                Password
                </br>
                <input type="password" name="password">
            </p>
            </br>
            <input type="submit" value="Logi in">

        </form>

        <p>
            <%
                for(int i = 1; i <10; i++)
                {
                    out.println(i);
                }
            %>
        </p>


  </body>
</html>
