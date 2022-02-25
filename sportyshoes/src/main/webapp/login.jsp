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
color:green;
font-size:40px;
}
h2{
color:red;
}
h3{
color:red;
}
h4{
color:green;
}
</style>
<title>Home Page</title>
</head>
<body>
<img src="https://previews.123rf.com/images/choreograph/choreograph1605/choreograph160500208/57630599-athletes-foot-close-up-healthy-lifestyle-and-sport-concepts-.jpg" width="190" height="80" >
	<h4>Sporty Shoes</h4>
	<hr>
	

	
<center>	
	
<form action="login_admin" method="get">
<table>

	<%
	String name=(String) request.getAttribute("name");
%>
	
	<h2>${msg }</h2>
	
	
	<tr>
		
		<td><h2>Email:</h2></td>
		<td><input type="email" name="user_email" placeholder="Enter your email"></td>
	</tr>
	
	
	
	<tr>
		
		<td><h2>Password:</h2></td>
		<td><input type="password" name="user_pass" placeholder="Enter your password"></td>
	</tr>
	
	</table>
	
	   <input type="submit" name="SUBMIT" value="Log In">
	   
	
</form>	
</center>
</body>
</html>