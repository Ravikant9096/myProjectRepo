<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0/css/all.min.css" integrity="sha512-9usAa10IRO0HhonpyAIVpjrylPvoDwiPUiKdWk5t3PyolY1cOd4DSE0Ga+ri4AuTroPR5aQvXU9xC6qOPnzFeg==" crossorigin="anonymous" referrerpolicy="no-referrer" /> 
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
	background-image: url("https://colibriwp.com/blog/wp-content/uploads/2021/06/5243028.jpg");
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
table, th, td {
  border: 1px solid black;
}

h1{
color:green;
font-size:40px;
}
h2{
color:red;
}
h3{
color:blue;
}
h4{
color:yellow  ;
}

td {
  text-align: center;
  text-transform: uppercase;
}
</style>
<title>Home Page</title>
</head>
<body>
<img src="https://previews.123rf.com/images/choreograph/choreograph1605/choreograph160500208/57630599-athletes-foot-close-up-healthy-lifestyle-and-sport-concepts-.jpg" width="190" height="80" >
	
	<hr>
	

	
<center>	
	
<form action="add-product" method="get">
<table>
			<tr>
					<th scope="col"><h2> ID</h2></th>
					<th scope="col"><h2>BRAND</h2></th>
					<th scope="col"><h2>COLOUR</h2></th>					
					<th scope="col"><h2>SIZE</h2></th>
					<th scope="col"><h2>SHOE IMAGE</h2></th>
					<th scope="col"><h2>PRICE</h2></th>
					<th scope="col"><h2>DISCOUNT</h2></th>
					<th scope="col"><h2>OFFER PRICE</h2></th>
					<th scope="col"><h2>PRODUCT DETAILS</h2></th>
					
					<th scope="col"><h2>ACTION</h2></th>
					 
			</tr>
	
	<c:forEach items="${products }" var="p">
				<tr>
					<th scope="row"><h4>RAVITECH${p.id }</h4></th>
					
					<td><h3>${p.brand }</h3></td>
					<td><h3>${p.colour }</h3></td>
					
					<td><h3>${p.size }</h3></td>
					<td><img src="${p.image }" width="100" height="50"/></td>					
					<td><h3>&#x20B9 ${p.price }</h3></td>
					<td><h3>${p.discount } %</h3></td>
					<td><h3>&#x20B9 ${p.price-(p.price*p.discount)/100 }</h3></td>
					<td><h3>${p.productdetail }</h3></td>
					<td><a href="delete/${p.id }"><i class="fa-solid fa-trash " style="font-size: 30px;"></i></a> &nbsp;
						<a href="update/${p.id }"><i class="fa-solid fa-pen" style="font-size: 30px;"></i></a>
					</td>
					
				</tr>
			
	</c:forEach>
	
	
	
	</table>
	
	   <input type="submit" name="SUBMIT" value="Add Product">
	
</form>	
</center>
</body>
</html>