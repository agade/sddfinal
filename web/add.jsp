<!DOCTYPE html>
<link rel="stylesheet" type="text/css" href="./style.css" /> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add a new Customer</title>
    </head>
    <body>
        <div class="wrap">
            <div class="header">
                <h1>Add a new Customer</h1>
                <p1>
                    <div> 
                        <ul class="navlist">
                            <li><a href="index.jsp">Home</a></li>
                            <li><a href="read">List All Records </a></li>
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
                <form name="addForm" action="addcustomer" method="get"/>
                <p>
                    <label>First Name</label>
                    <input type="text" name="firstName" value="" pattern="[A-Za-z]{1,}" title="Please type a valid first name"  required/>
                    <br>
                    <br>

                </p>
                <p>

                    <label>Last Name</label>
                    <input type="text" name="lastName" value="" pattern="[A-Za-z]{1,}" title="Please type a valid last name" required/>
                    <br>
                    <br>

                </p>
                <p>
                    <label>Address 1</label>
                    <input type="text" name="addr1" value=""  required/>
                    <br>
                    <br>
                </p>
                <p>
                    <label>Address 2</label>
                    <input type="text" name="addr2" value=""  required/>
                    <br>
                    <br>
                </p>
                <p>
                    <label>City</label>
                    <input type="text" name="city" value="" pattern="[A-Za-z\s]{1,}" title="Please type a valid city name"  required/>
                    <br>
                    <br>
                </p>
                <p>
                    <label>State:</label>
                    <select name="state" required>
                        <option value="">Please choose a state...</option>
                        <option value="AL">Alabama</option>
                        <option value="AK">Alaska</option>
                        <option value="AZ">Arizona</option>
                        <option value="AR">Arkansas</option>
                        <option value="CA">California</option>
                        <option value="CO">Colorado</option>
                        <option value="CT">Connecticut</option>
                        <option value="DE">Delaware</option>
                        <option value="DC">District of Columbia</option>
                        <option value="FL">Florida</option>
                        <option value="GA">Georgia</option>
                        <option value="HI">Hawaii</option>
                        <option value="ID">Idaho</option>
                        <option value="IL">Illinois</option>
                        <option value="IN">Indiana</option>
                        <option value="IA">Iowa</option>
                        <option value="KS">Kansas</option>
                        <option value="KY">Kentucky</option>
                        <option value="LA">Louisiana</option>
                        <option value="ME">Maine</option>
                        <option value="MD">Maryland</option>
                        <option value="MA">Massachusetts</option>
                        <option value="MI">Michigan</option>
                        <option value="MN">Minnesota</option>
                        <option value="MS">Mississippi</option>
                        <option value="MO">Missouri</option>
                        <option value="MT">Montana</option>
                        <option value="NE">Nebraska</option>
                        <option value="NV">Nevada</option>
                        <option value="NH">New Hampshire</option>
                        <option value="NJ">New Jersey</option>
                        <option value="NM">New Mexico</option>
                        <option value="NY">New York</option>
                        <option value="NC">North Carolina</option>
                        <option value="ND">North Dakota</option>
                        <option value="OH">Ohio</option>
                        <option value="OK">Oklahoma</option>
                        <option value="OR">Oregon</option>
                        <option value="PA">Pennsylvania</option>
                        <option value="RI">Rhode Island</option>
                        <option value="SC">South Carolina</option>
                        <option value="SD">South Dakota</option>
                        <option value="TN">Tennessee</option>
                        <option value="TX">Texas</option>
                        <option value="UT">Utah</option>
                        <option value="VT">Vermont</option>
                        <option value="VA">Virginia</option>
                        <option value="WA">Washington</option>
                        <option value="WV">West Virginia</option>
                        <option value="WI">Wisconsin</option>
                        <option value="WY">Wyoming</option>
                    </select>
                    <br>
                    <br>
                </p>
                <p>
                    <label>Zip</label>
                    <input type="text" pattern="[0-9]{5}"name="zip" value="" maxlength="5"  required/>
                    <br>
                    <br>
                </p>
                <p>
                    <label>Email Address</label>
                    <input type="email" name="emailAddr" value=""  required/>
                    <br>
                    <br>
                </p>
                <p>
                    <label>Age</label>
                    <input type="text"  pattern="[0-9]{1,}" name="age" value="" required/>
                    <br>
                    <br>
                    <br>
                    <br>
                </p>
                <p>

                    <input type="submit"  name="submit" value="Submit"/>
                </p>
                </form>
            </div>
            <div class="footer">
                <h2>
                    Software Development and Design. Alex Gade
                </h2>
            </div>
        </div>

    </body>
</html>
