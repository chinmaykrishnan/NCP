<%-- 
    Document   : dashboard
    Created on : 15 Oct, 2019, 11:20:06 PM
    Author     : ckris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://www.w3schools.com/lib/w3-theme-teal.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css">
</head>
<body>
<header class="w3-container w3-theme w3-padding" id="myHeader">
  <br><br>
  <div class="w3-center">
  <h3 class="w3-xxxlarge w3-animate-bottom">Dashboard</h3>
    <div class="w3-padding-32">
        <a href = "index.html"><button class="w3-btn w3-xlarge w3-theme-dark w3-hover-black" href = "index.html" style="font-weight:900;">LOGOUT</button></a>
    </div>
  </div>
</header>

<div class="w3-row-padding w3-center w3-margin-top">

<div class="w3-third">
  <div class="w3-card w3-container w3-red" style="min-height:460px">
  <h3>Events</h3><br>
  <a class="fa fa-binoculars w3-margin-bottom w3-text-white" style="font-size:200px" href="searchEvents.html"></a>
  <h3>See events that might interest you</h3>

  </div>
</div>

<div class="w3-third">
  <div class="w3-card w3-container w3-blue" style="min-height:460px" >
  <h3>Participate!</h3><br>
   <a class="fa fa-money w3-margin-bottom w3-text-white" style="font-size:200px" href="participate.html"></a>
  <h3>Register for an Event</h3>
  </div>
</div>

<div class="w3-third">
  <div class="w3-card w3-container w3-green" style="min-height:460px">
  <h3>Feedback</h3><br>
  <a class="fa fa-edit w3-margin-bottom w3-text-white" style="font-size:200px" href="feedback.html"></a>
  <h3>Please tell us how you feel about our website</h3>
  </div>
</div>
</div>
</body>
</html>
