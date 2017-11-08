<%-- 
    Document   : fooddetails
    Created on : Oct 31, 2017, 2:18:40 PM
    Author     : sandeep
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="java.util.ArrayList"%>
<%@page import="foodupload.foodgettersetter"%>
<%@page import="foodupload.foodinterImpl"%>
<%@page import="foodupload.foodinterface"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Food Details Page</title>
              <link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/bootstrap.min.js"></script>
  <script src="js/jquerys.js"></script>
  <script src="js/myscript.js"></script>
  
  <link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/mystyle.css" />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="js/bootstrap/bootstrap.min.js" type="text/javascript"></script>
<link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css" />
    </head>
    <body style="background-color: lightgoldenrodyellow">
  <div class="collapse navbar-collapse" id="myNavbar">
<a class="navbar-brand" href="#" style="color:#F08080">INDIAN FOOD RESTAURANT</a>
      <ul class="nav navbar-nav">
        <li><a href="ViewProfiles.jsp">ViewProfiles</a></li>
        <li><a href="cloud.jsp">Upload Product</a></li>
        <li class="active" style="background-color: #f08080"><a href="fooddetails.jsp">Products Details</a></li>
        <li ><a href="contactus1.jsp">Contact Us</a></li>
        
        
        <!--li><a href="sale_products.jsp">Upload Details</a></li-->
        </ul>
      <ul class="nav navbar-nav navbar-right">

          <!--Admin User Nmae -->
          <li><a href="#"><span class="glyphicon glyphicon-user"></span> <b style="color:green">Welcome </b><b style="color:Orange">KARAN</b></a></li>
          

<!-- User Logout Button -->
<li ><a href="Login .jsp"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
      </ul>
    </div>
        <br><Br>
        <h1 style="border:1px solid brown; margin: auto; width: 80%; text-align: center;">Products Details</h1>
        <br><BR>
        
          <%
            foodinterImpl impl = new foodinterImpl();
            ArrayList list = (ArrayList) impl.getcar_info();
        %>
        
       <c:set var="value" value="<%=list%>" />
       <table align="center" cellpadding="5" cellspacing="5" border="1"id="RegisU" style="width: 80%" >
            
                                    <tr bgcolor="#808B96" style="color:white;">
                                        <td style="text-align:center; height: 50px"><b>Image</b></td>
                                        <td style="text-align:center; height: 50px"><b>Food Name</b></td>
                                        <td style="text-align:center; height: 50px"><b>Food Price</b></td>
                                   <td style="text-align:center; height: 50px"><b>Delete</b></td>
                                   <td style="text-align:center; height: 50px"><b>Update</b></td>
                                    </tr>
                                    <c:forEach var="a" items="${value}" >   
                                    <tr bgcolor="white" style="color:black;">
                                        <th style="width: 20%;"><img src="${a.getCarimage()}" class="img-responsive" /></th>
                                    <th style="text-align:center">${a.getCarname()}</th>
                                    <th style="text-align:center">${a.getCarprice()}</th>
                                    
                                    
   <th style="text-align: center"><a href="DeleteFromDBP?id=${a.getId()}" class="btn btn-danger">Delete</a></th>
   <th style="text-align: center"><a href="UpDateP.jsp?id=${a.getId()}" class="btn btn-success">Update</a></th>
                      
                                    </tr>
                                    </c:forEach>
                                    
            </tbody>
        </table>
        
    </body>
</html>
