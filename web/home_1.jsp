
<!DOCTYPE html>

<html lang="en">
<head>
<title>INDIAN FOOD RESTAURANT</title>
<meta charset="utf-8">
<link rel="icon" href="images/favicon.ico">
<link rel="shortcut icon" href="images/favicon.ico">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="css/slider.css">
<script src="js/jquery.js"></script>
<script src="js/jquery-migrate-1.1.1.js"></script>
<script src="js/superfish.js"></script>
<script src="js/jquery.easing.1.3.js"></script>
<script src="js/sForm.js"></script>
<script src="js/jquery.carouFredSel-6.1.0-packed.js"></script>
<script src="js/tms-0.4.1.js"></script>
<script>
$(window).load(function () {
    $('.slider')._TMS({
        show: 0,
        pauseOnHover: false,
        prevBu: '.prev',
        nextBu: '.next',
        playBu: false,
        duration: 800,
        preset: 'fade',
        pagination: true, //'.pagination',true,'<ul></ul>'
        pagNums: false,
        slideshow: 8000,
        numStatus: false,
        banners: false,
        waitBannerAnimation: false,
        progressBar: false
    })
});
$(window).load(function () {
    $('.carousel1').carouFredSel({
        auto: false,
        prev: '.prev',
        next: '.next',
        width: 960,
        items: {
            visible: {
                min: 1,
                max: 4
            },
            height: 'auto',
            width: 240,
        },
        responsive: false,
        scroll: 1,
        mousewheel: false,
        swipe: {
            onMouse: false,
            onTouch: false
        }
    });
});
</script>
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
                <li class="current"><a href="home_1.jsp">Home</a></li>
              
                <li class="with_ul"><a href="about us.jsp">About Us</a>
                <ul>
                  <li><a href="#"> cuisine</a></li>
                  <li><a href="#">Good rest</a></li>
                  <li><a href="#">Services</a></li>
                </ul>
              </li>
              <li><a href="menu.jsp">Menu</a></li>
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
  <div class="slider-relative">
    <div class="slider-block">
      <div class="slider">
        <ul class="items">
            <li><img src="images/nav3.jpeg" alt=""/></li>
        
            <li><img src="images/nav2.jpeg" alt=""></li>
            <li class="mb0"><img src="images/nav1.jpeg" alt=""></li>
        </ul>
      </div>
    </div>
  </div>
  <div class="content page1">
    <div class="container_12">
      <div class="grid_7">
        <h2>Welcome</h2>
        <div class="page1_block col1"> <img src="images/welcome_img.png"style="width:40%" alt="">
          <div class="extra_wrapper">more</a> </div>
          <div class="clear"></div>

             
            
          <div class="clear"></div>
        </div>
      </div>
      <div class="grid_5">
        <h2>Features</h2>
        <ul class="list">
          <li><a href="#">Unlimited consultations and/or planning</a></li>
          <li><a href="#">Expert advice on traditions, customs, aetiquette</a></li>
          <li><a href="#">Determine and stay within budget</a></li>
          <li><a href="#">Choosing the right Wedding Venue</a></li>
          <li><a href="#">Provide preferred vendor's list</a></li>
          <li><a href="#">Assist with wedding scheme and design</a></li>
        </ul>
      </div>
      <div class="clear"></div>
      <div class="grid_12">
        <div class="hor_separator"></div>
      </div>
      <div class="grid_12">
        <div class="car_wrap">
          <h2>Best Choice</h2>
          <a href="#" class="prev"></a><a href="#" class="next"></a>
          <ul class="carousel1">
            <li>
                <div><img src="images/rajma-chawal1_1.jpg" alt="">
                    <div class="col1 upp"> <a href="Rajmachawal.jsp">Rajma CHAWAL</a></div>
                <span> </span>
                <div class="price">120&#8377</div>
              </div>
            </li>
            <li>
                <div><img src="images/indian thali.jpg" alt="">
                    <div class="col1 upp"> <a href="indian thali.jsp">INDIAN THALI</a></div>
                <span> </span>
                <div class="price">120&#8377</div>
              </div>
            </li>
            <li>
                <div><img src="images/upma-recipe28.jpg" alt="">
                    <div class="col1 upp"> <a href="upma.jsp">UPMA</a></div>
                <span></span>
                <div class="price">60&#8377</div>
              </div>
            </li>
            <li>
                <div><img src="images/avial2.jpg" alt="">
                    <div class="col1 upp"> <a href="avival.jsp">AVIAL</a></div>
                <span> </span>
                <div class="price">60&#8377</div>
              </div>
            </li>
            <li>
                <div><img src="images/veg biryani 4_1.jpg" alt="">
                    <div class="col1 upp"> <a href="veg biryani.jsp">VEG BIRYANI</a></div>
                <span></span>
                <div class="price">120&#8377$</div>
              </div>
            </li>
          </ul>
        </div>
      </div>
      <div class="clear"></div>
      <div class="bottom_block">
        <div class="grid_6">
          <h3>Follow Us</h3>
          <div class="socials"> <a href="#"></a> <a href="#"></a> <a href="#"></a> </div>
          <nav>
            <ul>
              <li class="current"><a href="index.html">Home</a></li>
              <li><a href="about-us.html">About Us</a></li>
              <li><a href="menu.html">Menu</a></li>
              <li><a href="portfolio.html">Portfolio</a></li>
              <li><a href="news.html">News</a></li>
              <li><a href="contacts.html">Contacts</a></li>
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
    <div class="grid_12"> INDIAN FOOD RESTAURANT &copy; 2045 | <a href="#">Privacy Policy</a> | Design by: <a href="http://www.templatemonster.com/">TemplateMonster.com</a> </div>
    <div class="clear"></div>
  </div>
</footer>
</body>
</html>