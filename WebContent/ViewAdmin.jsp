<%@page import="com.beans.UserBean"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%-- <%@ include file="Header.jsp" %> --%>



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







				<!-- =======================body===============================
 -->







				<body>


					<table border="5" bgcolor="skyblue" id="vdt">


                 <th>UserName</th>
                 <th>Password</th>
                 <th>Type</th>
                 <th>Email</th>
                 <th>MobileNumber</th>
              




						<%
							List<UserBean> l = (List) request.getAttribute("list");

							Iterator<UserBean> itr = l.iterator();
							System.out.println("Before while");

							while (itr.hasNext()) {

								UserBean ub = itr.next();
						%>


						<tr>
							<td><%=ub.getUserName()%></td>
							<td><%=ub.getPassWord()%></td>
							<td><%=ub.getType()%></td>
							<td><%=ub.getEmail()%></td>
							<td><%=ub.getMobileNumber()%></td>
						</tr>



						<%System.out.println("in while");
						
							}
							System.out.println("after while");
						%>
					</table>
				
                  <style>
                  #vdt{
                    padding:10px;
                    margin:10px 10px 10px 10px;
                  }
                  </style>
				</body>


















				<!-- ====================================Footer========================== -->
				




<!-- <!--Future Plans Part Starts -->
<div id="futurePlan-bg">
	<!-- Future Plans Contant Part Starts -->
	<div id="futurePlanContant">
		<!-- Projects 2007 Part Starts -->
		<div id="projPart">
			<h2 class="proj-hdr">Projects <span>2017</span></h2>
			<ul class="pic">
				<li><a href="#"><img src="images/domestic.png" alt="Pic 1" title="Pic 1" width="82" height="74" /></a></li>
				<li><a href="#"><img src="images/courier-clipart-k3963408.jpg" alt="Pic 2" title="Pic 2" width="82" height="74" /></a></li>
				<li class="noRightMargin"><a href="#"><img src="images/th.jpeg" alt="Pic 3" title="Pic 3" width="82" height="74" /></a></li>
			</ul>
			<br class="spacer" />
			<h3 class="sub-hdr">We Have For This year:</h3>
			<p>Be more customer friendly and achieve brand enhancement by the exploitation of IT and other technologies for sustained quality standards, training and motivation.</p>
			<a href="#" class="more-btn" title="READ MORE"></a>
		</div>
		<!-- Projects 2007 Part Ends
		Future Part Starts -->
		<div id="futurePart">
			<h2 class="future-hdr">Future Plans</h2>
			<h3 class="future-subHdr">VISION OF TOMORROW</h3>
			<p>We at The Country Cargo Couriers are committed to satisfy the expectations of our customers through timely and safe delivery of their consignments.

</p>
			<p>We achieve this through our management, team work and continuous refinement of our services.</p>
			<img src="images/banner.jpg" alt="Image" title="Image" width="127" height="141" />
			<br class="spacer" />
		</div>
		<!-- Future Part Ends -->
		<br class="spacer" />
	</div>
	<!-- Future Plans Contant Part Ends -->
</div>
<!-- Footer Part Starts -->
<div id="footer-bg">
	<!-- Footer Menu Part Starts -->
	<div id="footer-menu">
		<ul class="footMenu">
			<li class="noDivider"><a href="#" title="Home">Home</a></li>
			<li><a href="#" title="About">About</a></li>
			<li><a href="#" title="Services">Services</a></li>
			<li><a href="#" title="Support">Support</a></li>
			<li><a href="#" title="Chat">Chat</a></li>
			<li><a href="#" title="History">History</a></li>
			<li><a href="#" title="Contact">Contact</a></li>
		</ul>
		<br class="spacer" />
		<p class="copyright">Copyright &copy; Package 2007 All Rights Reserved</p>
		<p class="copyright topPad"><a href="http://www.flashmint.com/show-type-flash.html">Flash Templates</a>  by<a href="http://www.flashmint.com/">FlashMint</a></p>
	</div>
	<!-- Footer Menu Part Ends -->
</div>
<!-- Footer Part Ends -->
</body>
</html> 
