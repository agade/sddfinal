<%-- 
    Document   : read
    Created on : Oct 13, 2015, 8:13:31 PM
    Author     : agade
--%>
<link rel="stylesheet" type="text/css" href="./style.css" /> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Display Customers</title>
    </head>
    <div class="wrap">
        <div class="header">
            <h1>Customer Database</h1>
            <div> 
                <ul class="navlist">
                    <li><a href="index.jsp">Home</a></li>
                    <li><a href="read">View All Customers</a></li>
                    <li><a href="add">Add a new Customer</a></li>
                </ul>
            </div>
            <p1>
                <form name="searchForm" action="search" method="get">

                    <input type="text" name="searchVal" value=""/>

                    <br>

                    <input type="submit" name="submit" value="Search"/>

                </form>
            </p1>
        </div>
        <div class="main">
            <% String table = (String) request.getAttribute("table");%>

            <body>

                <%= table%>
                <br><br>
                <a href ="add">Add a new Customer</a>
                <br> <br>
                <a href="search.jsp">Search Customers</a>

            </body>
        </div>
        <div class="footer">
            <h2>
                Software Development and Design. Alex Gade
            </h2>
        </div>
    </div>
</html>
