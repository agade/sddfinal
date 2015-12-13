<!DOCTYPE html>
<link rel="stylesheet" type="text/css" href="./style.css" /> 

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>

        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer Database</title>
    </head>
    <body>
        <div class="wrap">
            <div class="header"> 
                <h1>Customer Database</h1>
                <p1>
                    <div> 
                        <ul class="navlist">
                            <li><a href="index.jsp">Home</a></li>
                            <li><a href="read">View All Customers</a></li>
                            <li><a href="add">Add a new Customer</a></li>
                        </ul>
                    </div>
                    <form name="searchForm" action="search" method="get">

                        <input type="text" name="searchVal" value=""/>

                        <br>

                        <input type="submit" name="submit" value="Search"/>

                    </form>
                </p1>
            </div>
            <div class="main">

                
            </div>
            <div class="footer">

                <h2>
                    Software Development and Design. Alex Gade
                </h2>
            </div>




        </div>
    </body>
</html>
