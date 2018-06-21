


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



			<!-- =============================body====================================== -->




			<%@ page language="java" contentType="text/html; charset=UTF-8"
				pageEncoding="UTF-8"%>

			<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
			<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Courier Details</title>
	
	
	
	
	
	
	
	<script>
function validateform(){
var receiverName=document.myform.receiverName.value;
var senderName=document.myform.senderName.value;
var receiverMobileNumber=document.myform.receiverMobileNumber.value;
var senderMobileNumber=document.myform.senderMobileNumber.value;
var x=document.myform.receiverEmailId.value;
var atposition=x.indexOf("@");
var dotposition=x.lastIndexOf(".");
var y=document.myform.senderEmailId.value;
var atposition=y.indexOf("@");
var dotposition=y.lastIndexOf(".");
var receiverAddress=document.myform.receiverAddress.value;
var senderAddress=document.myform.senderAddress.value;
var courierWeight=document.myform.courierWeight.value;
 

 
 if ( receiverName==null || receiverName=="")
{
  alert("Receiver Name can't be blank");
  return false;
}
else if (!/^[a-zA-Z]*$/g.test(document.myform.receiverName.value)) {
     alert("Enter only  characters for Receiver Name");
     document.myform.receiverName.focus();
     return false;
 }

else if(senderName==null || senderName=="")
{
  alert("Sender Name can't be blank");
  return false;
}
else if (!/^[a-zA-Z]*$/g.test(document.myform.senderName.value)) {
     alert("Enter only  characters for Sender Name");
     document.myform.senderName.focus();
     return false;
 }

else if(senderAddress==null || senderAddress=="")
{
  alert("Sender Address can't be blank");
  return false;
}
else if(receiverAddress==null || receiverAddress=="")
{
  alert("Receiver Address can't be blank");
  return false;
}
  else if (isNaN(receiverMobileNumber))
  {
    document.getElementById("numloc").innerHTML="Enter only Numeric value for Mobile Number";
    return false;
  }
else if (isNaN(senderMobileNumber))
  {
    document.getElementById("numloc2").innerHTML="Enter only Numeric value for Mobile Number";
    return false;
  }

 
    else if (atposition<1 || dotposition<atposition+2 || dotposition+2>=x.length)
    {
  alert("Please enter a valid e-mail address \n atpostion:"+atposition+"\n dotposition:"+dotposition);
  return false;
  }
  else if (atposition<1 || dotposition<atposition+2 || dotposition+2>=y.length)
    {
  alert("Please enter a valid e-mail address \n atpostion:"+atposition+"\n dotposition:"+dotposition);
  return false;
  }
 
   else if (isNaN(courierWeight))
    {
      document.getElementById("numloc3").innerHTML="Enter only Numeric value for Courier weight";
      return false;
    }else if(courierWeight>200){
    alert("Sorry!,Enter Courier Weight upto 200 kg only")
    return false;}
 

    else
        {
        return true;
        }
}
 
</script> 
	
	
	
</head>
<body>
	<form action="./AddCourier" name="myform" onsubmit="return validateform()">
		<table border="5" bgcolor="orange" align="left" id="at">
			<tr>

				<td>Receiver name</td>
				<td><input type="text" name="receiverName"></td>
			</tr>
			<tr>
				<td>Receiver Address</td>
				<td><input type="text" name="receiverAddress"></td>
			</tr>
			<tr>
				<td>Receiver MobileNo</td>
				<td><input type="text" name="receiverMobileNumber"><span id="numloc"></span></td>
			</tr>

			<tr>
				<td>Receiver EmailId</td>
				<td><input type="text" name="receiverEmailId"></td>
			</tr>

			<tr>
				<td>Sender name</td>
				<td><input type="text" name="senderName"></td>
			</tr>
			<tr>
				<td>Sender Address</td>
				<td><input type="text" name="senderAddress"></td>
			</tr>

			<tr>
				<td>Sender MobileNo</td>
				<td><input type="text" name="senderMobileNumber"><span id="numloc2"></span></td>
			</tr>

			<tr>
				<td>Sender EmailId</td>
				<td><input type="text" name="senderEmailId"></td>
			</tr>
			<tr>
				<td> Courier Weight</td>
				<td><input type="text" name="courierWeight"><span id="numloc3"></span></td>
			</tr>
			<tr>
				<td> Status</td>
				<td><select name="status" Value="select">

						<option value="delivered">Delivered</option>
						<option value="dispatched">Dispatched</option>

						<option value="received">Received</option>
				</select> </select></td>
				<tr>
					<td><input type="submit" value="add" /></td>
				</tr>
		</table>
	</form>
	<style>
	#at {
padding: 50px;
margin: 60px 60px 55px -497px;
}
	</style>
</body>
			</html>


			<!-- =============================Footer============================= -->


			<!-- <!--Future Plans Part Starts -->
			<div id="futurePlan-bg">
				<!-- Future Plans Contant Part Starts -->
				<div id="futurePlanContant">
					<!-- Projects 2007 Part Starts -->
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
					<!-- Projects 2007 Part Ends
		Future Part Starts -->
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
						<li class="noDivider"><a href="index.html" title="Home">Home</a></li>
						<li><a href="#" title="About">About</a></li>
						<li><a href="#" title="Services">Services</a></li>
						<li><a href="#" title="Support">Support</a></li>
						<li><a href="#" title="Chat">Chat</a></li>
						<li><a href="#" title="History">History</a></li>
						<li><a href="ContactUs.jsp" title="Contact">Contact</a></li>
					</ul>
					<br class="spacer" />
					<p class="copyright">Copyright &copy; Package 2007 All Rights
						Reserved</p>
					<p class="copyright topPad">
						<a href="http://www.flashmint.com/show-type-flash.html">Flash
							Templates</a> by<a href="http://www.flashmint.com/">FlashMint</a>
					</p>
				</div>
				<!-- Footer Menu Part Ends -->
			</div>
			<!-- Footer Part Ends -->
</body>
</html>












