<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style type="text/css">
*{
box-sizing:border-box;
}

body{
	margin:0;
	background-image: url("https://post.healthline.com/wp-content/uploads/2021/03/910265-The-8-Best-Running-Shoes-for-Wide-Feet-in-2021-1200x628-Facebook-1200x628.jpg");
}

nav{
	background:#594848;
	width:100%;
	overflow:auto;
}

ul{
	margin:0;
	padding:0;
	list-style:none;
	
}

li{
	float:left;
}
nav a{
	width:120px;
	display:block;
	text-decoration:none;
	text-align:center;
	background:#594848;
	font-size:17px;
	color:white;
	padding:20px 10px;
	font-family:Arial;
}

nav a:hover{
	background:pink;
	color:black;
}
button{
	text-align:center;
}	
img {
  border-radius: 50%;
}

h1{
color:yellow;
font-size:40px;
}
h2{
color:red;
}
h3{
color:red;
}
</style>
<title>Home Page</title>
</head>
<body>
<img src="https://previews.123rf.com/images/choreograph/choreograph1605/choreograph160500208/57630599-athletes-foot-close-up-healthy-lifestyle-and-sport-concepts-.jpg" width="190" height="80" >
	
<div style="position: absolute; top: 0; right: 0; width: 100px; text-align:right;"><a href="login.jsp"> <h2>Login</h2></a></div>	
	<hr>
	
	
	
<center>	
	
<form action="process" method="post">
<table>
<%
	String name=(String) request.getAttribute("name");
%>
	<h1>Sporty Shoes</h1>
	
	<h2>${msg }</h2>
	
	<!-- This is form fill up area -->
	
	<tr>		
		<td><h2>Name:</h2></td>
		<td><input type="text" name="user_name" placeholder="Enter your name"></td>
	</tr>
	
	<tr>
		
		<td><h2>Email:</h2></td>
		<td><input type="email" name="user_email" placeholder="Enter your email"></td>
	</tr>
	
	
	
	<tr>
		
		<td><h2>Password:</h2></td>
		<td><input type="password" name="user_pass" placeholder="Enter your password"></td>
	</tr>
	
	</table>
	
	   <input type="submit" name="SUBMIT" value="Sign Up">
	   &nbsp
	   
	  
	
</form>	
</center>
</body>
</html>