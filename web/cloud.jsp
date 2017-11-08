<%-- 
    Document   : cloud
    Created on : Oct 31, 2017, 12:34:28 PM
    Author     : sandeep
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Upload Product Page</title>
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
           <a class="navbar-brand" href="home_1.jsp" style="color:#F08080">INDIAN FOOD RESTAURANT</a>
      <ul class="nav navbar-nav">
        <li><a href="ViewProfiles.jsp">ViewProfiles</a></li>
        <li class="active" style="background-color: #F08080"><a href="cloud.jsp">Upload Product</a></li>
        <li><a href="fooddetails.jsp">Products Details</a></li>
        <li ><a href="contact_us.jsp">Contact Us</a></li>
        
        
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
        <h1 style="border:1px solid brown; margin: auto; width: 80%; text-align: center;">Upload Products</h1>
        <br><BR>
        <form action="foodsupload" method="post" style="margin: auto; width: 80%; text-align: center;" enctype="multipart/form-data">            
            <h1 style="font-size: 80px;color:black;   ">Food Information</h1>
            <input type="hidden" value="<%= request.getSession().getAttribute("userdb") %>"  name="username">
            <input type="text" name ="name" class="form-control" placeholder="Your Food Name" required>
              <br>
              <input type="text" name ="price" class="form-control" placeholder="Your Food Price" required>
              <br>
              <center>
                  <input type="file" name="image" class="form-control" style="width: 550px;text-align: center" required>
              </center>
               <br>
            <input type="submit" value="Upload it " class="btn btn-danger" style="width: 80px">
        </form> 
    
        
        
    </body>
</html>
