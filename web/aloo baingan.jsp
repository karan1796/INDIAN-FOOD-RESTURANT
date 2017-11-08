<%-- 
    Document   : aloo baingan
    Created on : Sep 29, 2017, 11:27:37 AM
    Author     : Karan Singh
--%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en-US">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-compatable" Content="IE-edge>"
<meta name="viewport" content = "width-device-width"> 

<title>aloo baingan</title>
  <script src="js/sweetalert.min.js"></script>
<link rel="stylesheet" href="css/sweetalert.css">
<link rel="stylesheet" href="css/bootstrap.css" />
<link rel="stylesheet" href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.6.3/css/font-awesome.min.css" />

<style>
.btn-danger{
margin-right:50px;
}

.btn-info{
margin-right:50px;
}

.nano_head {
border-style: outset;
padding-top:10px;
padding-bottom:20px;
margin-top:30px;
box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
  text-align: center;

}

button[type=submit] {
background-color: #222222;
width:80px;
color:#fff;
    display: inline-block;
    border: 1px solid #000;
	border-radius:1px;
    box-sizing: border-box;
}

input[type=text], select {
    width: 10%;
    margin: 8px 0;
	border-radius:1px;
    display: inline-block;
    border: 1px solid #000;
    box-sizing: border-box;
}
.top_bar {background:#5a1320; padding:5px 0;
padding-top:20px;
padding-bottom:20px;
}
.social_icon {margin-right:5px;}
.contact_info{color:#fff; font-size:16px; }

.nanolist_head {
border-style: outset;
padding-top:10px;
padding-bottom:20px;
margin-top:30px;
margin-bottom:50px;
box-shadow: 0 4px 8px 0 rgba(0, 0, 0, 0.2), 0 6px 20px 0 rgba(0, 0, 0, 0.19);
}
</style>
</head>

<!--header -->
<body>
   
<div class="container-fluid top_bar" id="homeID">
<div class="container"> 
<div class="row">
<div class="col-sm-3">
 <a href="https://www.facebook.com" class= "social_icon"> <i class="fa fa-facebook" style ="color:#fff; size:17px; font-size:17px"></i></a>
 <a href="https://www.twitter.com" class= "social_icon"> <i class="fa fa-twitter" style ="color:#fff; size:17px; font-size:17px"></i></a>
 <a href="https://www.youtube.com" class= "social_icon"> <i class="fa fa-youtube-play" style ="color:#fff; size:17px; font-size:17px"></i></a>
 <a href="https://www.gmail.com" class= "social_icon"> <i class="fa fa-google-plus" style ="color:#fff; size:17px; font-size:17px"></i></a>
</div>
<div class="col-sm-9 text-right contact_info">
<span class="glyphicon glyphicon-envelope"></span>  karansingh1796@gmail.com   
<span class="glyphicon glyphicon-earphone"></span>  +91-9911997260
</div>
</div>
</div>
</div> <!--end of header-->
</body>
<body>

    <b>
        <div class="panel-body">
            <br>
        <div id="root_img" style="width:100%;height:100%">
    <div id="id_immagine" align="center" style="width: 100%; height: 100%;">
        <a id="a_img_id" href="images/aloo-baingan-masala-14.jpg">
            <img id="img_id" src="images/aloo-baingan-masala-14.jpg" />
        </a>
    </div>
</div>
        </div>
        </div>
    </b>
    <div class="container nano_head"> <!-- main contain of car-->
        
        
        <div class="container-fluid top_bar"align="center" style="color:#ffffff" ><b>aloo baingan</b></div>      
</div>

<div class="col-sm-7" align="right">
        <h3><b>aloo baingan</b></h3>
		<img src="images/rating_full.png" />
		<img src="images/rating_full.png" />
		<img src="images/rating_full.png" />
		<img src="images/rating_half.png" />
		<img src="images/rating_empty.png" />
		
	<hr>
		
		<h4 style="color:#F08080"><img src="images/ic_pink.png" /><b>150</b> </h4>
                <div class="col-sm-7">
              
<div>   
</div>
</div><hr>		
<p><a href="#" data-toggle="modal" data-target="#myModal" class="btn btn-success glyphicon glyphicon-hand-right"> ORDER</a>

</p></div><br>
</div>
</div>


<!-- Modal -->
  <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header" style="background-color:grey; color:orange">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">Place Your Order</h4>
        </div>
        <div class="modal-body">
            <form action="ordr1.jsp">
    <div class="form-group">
        <label for="pwd">Name:</label>
     <input type="plain" class="form-control"  align="center"placeholder="Enter your name" name="bname" required>
    </div>
     <div class="form-group">
         <label for="pwd">Email:</label>
     <input type="email" class="form-control" placeholder="Enter your email" name="bemail" required>
    </div>
    <div class="form-group">
      <label>Contact:</label>
      <input type="plain" class="form-control" placeholder="Enter your mobile number" name="bnumber" required maxlength="10" onchange="CheckIndianNumber(this.value)">
    </div>
              <script>
function CheckIndianNumber(IndianNumber)
{
var IndNum = /^([0|\+[0-9]{1,5})?([7-9][0-9]{9})$/;
if(IndNum.test(IndianNumber))
       {
           swal(
  'Success!',
  'Valid Mobile Number',
  'success'
)
       }
       else
       {
           swal(
      'Error!',
      'Mobile number is not valid!',
      'error'
    )
       }
}
</script>
     <div class="form-group">
     <label>Your Address:</label>
  <textarea class="form-control" rows="5" name="bcomment" required></textarea> 
    </div>
      <div class="modal-footer"><button type="submit" class="btn btn-primary">SUBMIT</button></div>
  </form>
        </div>
      </div>
      
      
    </div>
  </div>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</body>

</html>
