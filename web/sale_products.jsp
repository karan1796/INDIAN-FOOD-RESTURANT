<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html lang="en">

<head>
  <title>Sale Products Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <script src="js/sweetalert.min.js"></script>
<link rel="stylesheet" href="css/sweetalert.css">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/bootstrap.min.js"></script>
  <script src="js/jquerys.js"></script>
  <script src="js/myscript.js"></script>
  <link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="css/mystyle.css    " />
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css" />
<style>
* {
  -webkit-box-sizing: border-box;
  -moz-box-sizing: border-box;
  box-sizing: border-box;
}
.page-wrap {
  max-width: 75rem;
  margin: 0 auto;
}
h1 {
  color: #8e44ad;
  font-size: 1.5rem;
  letter-spacing: -1px;
  margin: 1.25rem 0;
}
input:focus ~ label, textarea:focus ~ label, input:valid ~ label, textarea:valid ~ label {
 font-size: 0.75em;
 color: red;
 top: -2.50rem;
 -webkit-transition: all 0.125s ease;
 transition: all 0.125s ease;
}
.styled-input {
  float: left;
  width: 33.3333%;
  margin: 2rem 0 1rem;
  position: relative;
}
.styled-input label {
  color: #000;
  padding: 1rem;
  position: absolute;
  top: 0;
  left: 0;
  -webkit-transition: all 0.25s ease;
  transition: all 0.25s ease;
  pointer-events: none;
}
.styled-input.wide { width: 100%; }
input,
textarea {
  padding: 1rem 1rem;
  border: 1;
  width: 100%;
  font-size: 1rem;
}
input ~ span,
textarea ~ span {
  display: block;
  width: 0;
  height: 3px;
  background: #8e44ad;
  position: absolute;
  bottom: 0;
  left: 0;
  -webkit-transition: all 0.125s ease;
  transition: all 0.125s ease;
}
input:focus,
textarea:focus { outline: 0; }
input:focus ~ span,
textarea:focus ~ span {
  width: 100%;
  -webkit-transition: all 0.075s ease;
  transition: all 0.075s ease;
}
textarea {
  width: 100%;
  min-height: 15em;
}
.panel-default{
  background: rgba(255, 255, 255, 0.5);
}
.panel-default .panel-heading{
  background: rgba(255, 255, 255, 0.9);
}
.panel-default .panel-body{
  background: rgba(255, 255, 255, 0.0);
}
</style>
<script>
    $(function(){
        $('#tabtn1').click(function(e){
                e.preventDefault();
                $('#mytabs a[href="#tab2"]').tab('show');
            });
            $('#tabtn2').click(function(e){
                e.preventDefault();
                $('#mytabs a[href="#tab3"]').tab('show');
            });
        }); 
    </script>
</head>
<body style="background-image: url('images/back1.jpeg');">
<div class="container-fluid top_bar" id="homeID">
<div class="container"> 
<div class="row">
<div class="col-sm-3">
 <a href="https://www.facebook.com/Desire-Car-422417681493621/"class= "social_icon"> <i class="fa fa-facebook" style ="color:blue; size:17px; font-size:17px"></i></a>
 <a href="https://www.twitter.com" class= "social_icon"> <i class="fa fa-twitter" style ="color:burlywood; size:17px; font-size:17px"></i></a>
 <a href="https://www.youtube.com" class= "social_icon"> <i class="fa fa-youtube-play" style ="color:red; size:17px; font-size:17px"></i></a>
 <a href="https://www.gmail.com" class= "social_icon"> <i class="fa fa-google-plus" style ="color:lightgreen; size:17px; font-size:17px"></i></a>
</div>
<div class="col-sm-9 text-right contact_info">
<span class="glyphicon glyphicon-envelope"></span> Desired Car's.,    
<span class="glyphicon glyphicon-earphone"></span>  +91-8285433485
</div>
</div>
</div>
</div> <!--end of header-->
			
<nav class="navbar navbar-inverse" style="margin-bottom:0px;">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
<a class="navbar-brand" href="#" style="color:#00FF7F">Desired Car's</a>
      <ul class="nav navbar-nav">
          <li><a href="home.jsp">Home</a></li>
        <li><a href="buy_product.jsp">Buy Products</a></li>
        <li class="active"><a href="sale_products.jsp">Sale Products</a></li>
        <li><a href="about_us.jsp">About Us</a></li>
        <li><a href="contact_us.jsp">Contact Us</a></li>
      </ul>
      <ul class="nav navbar-nav navbar-right">

          <!-- User Nmae -->
          <li><a href="#"><span class="glyphicon glyphicon-user"></span> <b style="color:green">Welcome </b><b style="color:Orange"> <%= request.getSession().getAttribute("userdb") %></b></a></li>
    	

<!-- User Registration Button -->
	<li ><a href="loginform.jsp"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
      </ul>
    </div>
  </div>
</nav>


<!--navigation section end -->


<form action="carupload" method="post" style="margin: auto; width: 80%; text-align: center;" enctype="multipart/form-data">
            <h1 style="font-size: 80px;color:black;   ">Car InformaTion</h1>
            <input type="hidden" value="<%= request.getSession().getAttribute("userdb") %>"  name="username">
            <input type="text" name ="name" class="form-control" placeholder="Your Car Name" required>
              <br>
              <input type="text" name ="price" class="form-control" placeholder="Your Car Price" required>
              <br>
              <center>

                  <input type="file" name="image" class="form-control" style="width: 550px;text-align: center" required>
              </center>
               <br>
            <input type="submit" value="Upload it " class="btn btn-danger" style="width: 80px">
        </form> 
    
     
 


 </body>
</html>
