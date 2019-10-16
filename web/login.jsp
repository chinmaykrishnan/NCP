<%-- 
    Document   : login
    Created on : 15 Oct, 2019, 9:05:02 PM
    Author     : ckris
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%  
String profile_msg=(String)request.getAttribute("profile_msg");  
if(profile_msg!=null){  
out.print(profile_msg);  
}  
String login_msg=(String)request.getAttribute("login_msg");  
if(login_msg!=null){  
out.print(login_msg);  
}  
 %>  
<html class = "login-bg">
<head>
<title>Login</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel = "stylesheet" type = "text/css" href = "style.css">
</head>
<body>
  <div class = "navbar1">
    <a href = "index.html"><i class="fa fa-fw fa-home"></i> Home</a>
  </div>
<div class = "loginbox">
  <img src = "pic8.jpg" class="avatar">
  <h1>LOGIN</h1>
  <form action="/Project/LoginServlet">
  <p>Username</p>
  <input type = "text" name= "uname" placeholder="Enter username">
  <p>Password</p>
  <input type = "password" name = "password" placeholder="Enter password"><br><br>
  <input type = "submit" name = "ok" value = "LOGIN"><br><br>
  <a href="forgot.html">Forgot password?</a><br>
  <a href= "create.html">Haven't signed up yet?</a><br>
  </form>
</div>
</body>
</html>
