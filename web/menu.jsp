<%-- 
    Document   : index2
    Created on : Oct 26, 2017, 12:12:28 PM
    Author     : Karan Singh
--%>

<!DOCTYPE html>
<html lang="en">
<head>
<title>INDIAN FOOD Restaurant | Menu</title>
<meta charset="utf-8">
<link rel="icon" href="images/favicon.ico">
<link rel="shortcut icon" href="images/favicon.ico">
<link rel="stylesheet" href="css/style.css">
<script src="js/jquery.js"></script>
<script src="js/jquery-migrate-1.1.1.js"></script>
<script src="js/superfish.js"></script>
<script src="js/jquery.easing.1.3.js"></script>
<script src="js/sForm.js"></script>
<!--[if lt IE 9]>
<script src="js/html5shiv.js"></script>
<link rel="stylesheet" media="screen" href="css/ie.css">
<![endif]-->
</head>
<body>
<div class="main">
  <header>
    <div class="container_12">
      <div class="grid_12">
          <h1><a href="home_1.jsp"><img src="images/indian food1.jpg" alt=""></a></h1>
        <div class="menu_block">
          <nav>
            <ul class="sf-menu">
                <li><a href="home_1.jsp">Home</a></li>
              
                <li class="with_ul"><a href="about us.jsp">About Us</a>
                <ul>
                  <li><a href="#"> cuisine</a></li>
                  <li><a href="#">Good rest</a></li>
                  <li><a href="#">Services</a></li>
                </ul>
              </li>
              <li class="current"><a href="menu.jsp">Menu</a></li>
              <li><a href="contact_us.jsp">Contacts</a></li>
              <li><a><span class="glyphicon glyphicon-user"></span> <b style="color:green">Welcome </b><b style="color:Orange"> <%= request.getSession().getAttribute("userdb") %></b></a></li>
            <li ><a href="Login .jsp"><span class="glyphicon glyphicon-log-out"></span> Logout</a></li>
     
            </ul>
          </nav>
          <div class="clear"></div>
        </div>
        <div class="clear"></div>
      </div>
    </div>
  </header>
  <div class="content">
    <div class="container_12">
      <div class="grid_6">
        <h2>INDIAN CUISINE</h2>
        <p class="col2 inn1"><a href="#">Indian cuisine encompasses a wide variety of regional and traditional cuisines native.Given the range of diversity in soil type, climate, culture, ethnic groups, and occupations, these cuisines vary substantially from each other and use locally available spices, herbs, vegetables, and fruits.</a></p>   
        <p> Indian food is also heavily influenced by religious, in particular Hindu and cultural choices and traditions. Also, Middle Eastern and Central Asian influences have occurred on North Indian cuisine from the years of Mughal rule. Indian cuisine is still evolving, as a result of the nation's cultural interactions with other societies. </p>
        <div class="menu">
          <div class="grid_3 alpha"> <img src="images/page3_img1.jpg" alt="" class="img_inner">
            <h3><a href="Login .jsp">Donec</a></h3>
          </div>
          <div class="grid_3 omega"> <img src="images/page3_img2.jpg" alt="" class="img_inner">
            <h3><a href="#">Murtyio</a></h3>
          </div>
          <div class="grid_3 alpha"> <img src="images/page3_img3.jpg" alt="" class="img_inner">
            <h3><a href="#">Holity as Polfh</a></h3>
          </div>
          <div class="grid_3 omega"> <img src="images/page3_img4.jpg" alt="" class="img_inner">
            <h3><a href="#">Kiperty</a></h3>
          </div>
          <div class="grid_3 alpha"> <img src="images/page3_img5.jpg" alt="" class="img_inner">
            <h3 class="mb0"><a href="#">Gyloit</a></h3>
          </div>
          <div class="grid_3 omega"> <img src="images/page3_img6.jpg" alt="" class="img_inner">
            <h3 class="mb0"><a href="#">Liotymer</a></h3>
          </div>
        </div>
        <div class="clear"></div>
      </div>
      <div class="grid_5 prefix_1">
        <h2 class="head2">NORTH INDIAN</h2>
        <ul class="list l1">
          <li><a href="Shahi Paneer.jsp"> SHAHI PANEER</a></li>
          <li><a href="dal makhani.jsp">DAL MAKHANI</a></li>
          <li><a href="kadhai paneer.jsp">KADAI PANEER</a></li>
          <li><a href="mix vegetable.jsp">MIX VEGETABLE</a></li>
          <li><a href="dum aloo.jsp">DUM ALOO</a></li>
          <li><a href="chana masala.jsp">CHANA MASALA</a></li>
          <li><a href="aloo baingan.jsp">ALOO BAINGAN</a></li>
          <li><a href="matar paneer.jsp">MATAR PANEER</a></li>
          <li><a href="bhindi ki sabji.jsp">BHINDI ki SABJI</a></li>
          <li><a href="matar mushroom.jsp">MATAR MUSHROOM</a></li>
          
        </ul>
        <h2 class="head1">SOUTH INDIAN</h2>
        <ul class="list">
            <li><a href="wheat dosa.jsp">WHEAT DOSA</a></li>
            <li><a href="masala dosai.jsp">MASALA DOSAI</a></li>
            <li><a href="spring dosai.jsp">SPRING DOSAI</a></li>
            <li><a href="upma"> UPMA</a></li>
            <li><a href="palak paneer dosai.jsp">PALAK PANEER DOSAI</a></li>
            <li><a href="sambar vadai.jsp">SAMBAR VADAI</a></li>
            <li><a href="dahi vadai.jsp">DAHI VADAI</a></li>
        </ul>
        
          <h2 class="head1">DESSERT</h2>
        <ul class="list">
            <li><a href="rasmalai.jsp">RASMALAI</a></li>
            <li><a href="gajar halwa.jsp">GAJAR HALWA</a></li>
            <li><a href="aam shirkhand.jsp">AAM SHIRKHAND</a></li>
            <li><a href="kesar faluda.jsp"> KESAR FALUDA</a></li>
            <li><a href="payasam.jsp">PAYASAM</a></li>
            <li><a href="pasta payasam.jsp">PASTA PAYASAM</a></li>
            <li><a href="mango kesar.jsp">MANGO KESRI</a></li>
        </ul>
          <h2 class="head1">BREAD</h2>
        <ul class="list">
            <li><a href="butter naan.jsp">BUTTER NAAN</a></li>
            <li><a href="roti.jsp">ROTI</a></li>
            <li><a href="single naan.jsp">SINGLE NAAN</a></li>
            
      </div>
      <div class="clear"></div>
      <div class="bottom_block">
        <div class="grid_6">
          <h3>Follow Us</h3>
          <div class="socials"> <a href="#"></a> <a href="#"></a> <a href="#"></a> </div>
          <nav>
            <ul>
                <li><a href="home_1.jsp">Home</a></li>
              <li><a href="about-us.html">About Us</a></li>
              <li class="current"><a href="menu.jsp">Menu</a></li>
           
              <li><a href="contact_us.jsp">Contacts</a></li>
            </ul>
          </nav>
        </div>
        <div class="grid_6">
          <h3>Email Updates</h3>
          <p class="col1">Join our digital mailing list and get news<br>
            deals and be first to know about events</p>
          <form id="newsletter" action="#">
            <div class="success">Your subscribe request has been sent!</div>
            <label class="email">
              <input type="email" value="Enter e-mail address" >
              <a href="#" class="btn" data-type="submit">subscribe</a> <span class="error">*This is not a valid email address.</span> </label>
          </form>
        </div>
      </div>
      <div class="clear"></div>
    </div>
  </div>
</div>
<footer>
  <div class="container_12">
    <div class="grid_12"> INDIAN Traditional Restaurant &copy; 2045 | <a href="#">Privacy Policy</a> | Design by: <a href="http://www.templatemonster.com/">TemplateMonster.com</a> </div>
    <div class="clear"></div>
  </div>
</footer>
</body>
</html>