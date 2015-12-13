



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" type="text/css" href="./style.css" /> 

<html>


    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Customers</title>
    </head>
    <div class="wrap">
        <div class="header">

            <body>
                <h1>Search Customers</h1>
                <div> 
                    <ul class="navlist">
                        <li><a href="index.jsp">Home</a></li>
                        <li><a href="read">View All Customers</a></li>
                        <li><a href="add">Add a new Customer</a></li>
                    </ul>
                </div>
        </div>
        <div class="main">
            <form name="searchForm" action="search" method="get">

                <input type="text" name="searchVal" value=""/>

                <br>

                <input type="submit" name="submit" value="Search"/>

            </form>
        </div>
        <div class="footer">
            <h2>
                Software Development and Design. Alex Gade
                
            </h2>
        </div>
    </body>
</div>
</html>
