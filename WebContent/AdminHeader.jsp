<%@page import="com.beans.UserBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>




<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Package</title>
<link href="style.css" rel="stylesheet" type="text/css" />
</head>

<body>
	<!--Header Background Part Starts -->
	<div id="header-bg">
		<!--Header Contant Part Starts -->
		<div id="header">
			<a href="index.html"><img src="images/we-care.png" alt="Package"
				width="205" height="62" border="0" class="logo" title="Package" /></a>
			<!--Login Background Starts -->
			<!-- <div id="login-bg">
			Login Area Starts
			<div id="login-area">
				<form action="./login" method="post" name="Login" id="Login">
					<label>Members Login:</label>
					<input type="text" name="uname" id="username" />
					<input type="password" name="pass" id="pass" />
					<input type="image" src="images/login-btn.gif" class="login-btn" alt="Login" title="Login" />
					<br class="spacer" />
				</form>
			</div>
			Login Area Ends
		</div> -->
			<!--Login Background Ends -->
			<br class="spacer" />
		</div>
		<!--Header Contant Part Ends -->
	</div>
	<!--Header Background Part Ends -->
	<!--Navigation Background Part Starts -->
	<div id="navigation-bg">
		<!--Navigation Part Starts -->
		<div id="navigation">
			<ul class="mainMenu">
					<li><a href="index.html" class="selectMenu" title="Home">Home</a></li>
			<li><a href="AddAdmin.jsp" title="AddEmployee">ADD</a></li>
			<li><a href="./Viewadmin?id=view" title="ViewEmployee">VIEW</a></li>
			<li><a href="./Viewadmin?id=edit" title="EditEmployee">EDIT</a></li> 
			<li><a href="./Viewadmin?id=delete" title="DeleteEmployee">DELETE</a></li> 
			<li><a href="index.html" title="Chat">LOGOUT</a></li>
     
			
			<li class="noBg"><a href="ContactUs.jsp" title="Contact">ContactUs</a></li>

