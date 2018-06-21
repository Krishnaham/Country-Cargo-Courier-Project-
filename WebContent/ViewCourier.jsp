

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
				<li><a href="AddCourier.jsp" title="AddCourier">AddCourier</a></li>
				<li><a href="./ViewCourier?id=view" title="ViewCourier">ViewCourier</a></li>
				<li><a href="./ViewCourier?id=edit" title="EditCourier">EditCourier</a></li>
				<li><a href="./ViewCourier?id=delete" title="DeleteCourier">DeleteCourier</a></li>
				<li><a href="index.html" title="Chat">LogOut</a></li>




				<li class="noBg"><a href="ContactUs.jsp" title="Contact">Contact
						Us</a></li>
			</ul>




			<!-- ======================body=================== -->





			<%@page import="java.util.Iterator"%>
			<%@page import="com.beans.Courier"%>
			<%@page import="java.util.List"%>
			<%@ page language="java" contentType="text/html; charset=UTF-8"
				pageEncoding="UTF-8"%>
			<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
			<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
</head>

<body >
	<table border="5" bgcolor="lightGreen" align="left" id="vt">
		<th>Courier Id</th>
		<th>Receiver Name</th>
		<th>Receiver Address</th>
		<th>Receiver MobileNo</th>
		<th>Receiver EmailId</th>
		<th>Sender Name</th>
		<th>Sender Address</th>
		<th>Sender MobileNo</th>
		<th>Sender EmailId</th>
		<th>Courier Weight</th>
		<th>Status</th>

		<%
			List<Courier> u = (List) request.getAttribute("userlist");
			Iterator<Courier> itr = u.iterator();
			while (itr.hasNext()) {
				Courier courier = itr.next();
		%>
		<tr>
			<td><%=courier.getCourierId()%> </td>
			<td><%=courier.getReceiverName()%></td>
			<td><%=courier.getReceiverAddress()%></td>
			<td><%=courier.getReceiverMobileNumber()%></td>
			<td><%=courier.getReceiverEmailId()%></td>

			<td><%=courier.getSenderName()%></td>
			<td><%=courier.getSenderAddress()%></td>
			<td><%=courier.getSenderMobileNumber()%></td>
			<td><%=courier.getSenderEmailId()%></td>
			<td><%=courier.getCourierWeight()%></td>
			<td><%=courier.getStatus()%></td>



		</tr>
		<%
			}
		%>
	</table>
	<style type="text/css">
#vt {
	padding: 135px;
	margin: 30px 60px 55px -214px;
}
</style>
</body>
			</html>








			<!-- =========================Footer=============================== -->






			<!-- <!--Future Plans Part Starts -->
			<!-- <div id="futurePlan-bg">
				Future Plans Contant Part Starts
				<div id="futurePlanContant">
					Projects 2007 Part Starts
					<div id="projPart">
						<h2 class="proj-hdr">
							Projects <span>2017</span>
						</h2>
						<ul class="pic">
							<li><a href="#"><img src="images/domestic.png"
									alt="Pic 1" title="Pic 1" width="82" height="74" /></a></li>
							<li><a href="#"><img
									src="images/courier-clipart-k3963408.jpg" alt="Pic 2"
									title="Pic 2" width="82" height="74" /></a></li>
							<li class="noRightMargin"><a href="#"><img
									src="images/th.jpeg" alt="Pic 3" title="Pic 3" width="82"
									height="74" /></a></li>
						</ul>
						<br class="spacer" />
						<h3 class="sub-hdr">We Have For This year:</h3>
						<p>Be more customer friendly and achieve brand enhancement by
							the exploitation of IT and other technologies for sustained
							quality standards, training and motivation.</p>
						<a href="#" class="more-btn" title="READ MORE"></a>
					</div>
					Projects 2007 Part Ends
		Future Part Starts
					<div id="futurePart">
						<h2 class="future-hdr">Future Plans</h2>
						<h3 class="future-subHdr">VISION OF TOMORROW</h3>
						<p>We at The Country Cargo Couriers are committed to satisfy
							the expectations of our customers through timely and safe
							delivery of their consignments.</p>
						<p>We achieve this through our management, team work and
							continuous refinement of our services.</p>
						<img src="images/banner.jpg" alt="Image" title="Image" width="127"
							height="141" /> <br class="spacer" />
					</div>
					Future Part Ends
					<br class="spacer" />
				</div>
				Future Plans Contant Part Ends
			</div>
			Footer Part Starts
			<div id="footer-bg">
				Footer Menu Part Starts
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
					<p class="copyright">Copyright &copy; Package 2007 All Rights
						Reserved</p>
					<p class="copyright topPad">
						<a href="http://www.flashmint.com/show-type-flash.html">Flash
							Templates</a> by<a href="http://www.flashmint.com/">FlashMint</a>
					</p>
				</div>
				Footer Menu Part Ends
			</div>
			Footer Part Ends
</body>
</html> -->




