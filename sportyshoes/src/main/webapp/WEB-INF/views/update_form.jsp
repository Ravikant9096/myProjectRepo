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
	
	<!-- <nav>
		<ul>
			<li> <a href="index.html">Home   </a>		    		</li>
			<li> <a href="NewRegistration.html">SignUp</a>			</li>
			<li> <a href="Login.html">Login</a>					</li>
			<li> <a href="contact.html">Contact</a>							</li>
		</ul>
	</nav> -->
	
<center>	
	
<form action="${pageContext.request.contextPath }/update1" method="get">
<table>
<h1> UPDATE PRODUCT FORM</h1>

<input type="number" name="id" value="${product.id }"/>
<tr>		
		<td><h2>Brand:</h2></td>
		<td><input type="text" name="brand" placeholder="Enter Shoe Brand" value="${product.brand }"></td>
</tr>
	
	<tr>		
		<td><h2>Size:</h2></td>
		<td><input type="text" name="size" placeholder="Enter Shoe Size" value="${product.size }"></td>
</tr>
		
	<tr>		
		<td><h2>Colour:</h2></td>
		<td><input type="text" name="colour" placeholder="Enter Shoe Colour" value="${product.colour }"></td>
</tr>

<tr>		
		<td><h2>Productdetail:</h2></td>
		<td><input type="text" name="productdetail" placeholder="Enter Shoe Productdetail" value="${product.productdetail }"></td>
</tr>

<tr>		
		<td><h2>Price:</h2></td>
		<td><input type="number" name="price" placeholder="Enter Shoe Price" value="${product.price }"></td>
</tr>

<tr>		
		<td><h2>Discount:</h2></td>
		<td><input type="text" name="discount" placeholder="Enter Shoe discount" value="${product.discount }"></td>
</tr>

<tr>		
		<td><h2>Shoe Image Path:</h2></td>
		<td><input type="text" name="image" placeholder="Enter Shoe image path" value="${product.image }"> <label for="fileupload"> Addresh of Image Path</label>

</td>
</tr>
	
	</table>
	
	   <input type="submit" name="SUBMIT" value="UPDATE">
	
</form>	
</center>
</body>
</html>