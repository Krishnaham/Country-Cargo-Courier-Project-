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
				<li><a href="./index.html" class="selectMenu" title="Home">Home</a></li>
			<li><a href="AboutUs.jsp" title="About">AboutUs</a></li>
			<li><a href="./EstimationCost" title="Estimation">Estimation</a></li>
			<li><a href="ContactUs.jsp" title="Services">Contact Us</a></li>
			<li><a href="Benefits.jsp" title="Support">Benefits</a></li>
			</ul>





			=============================================body=================================






<head>
<script>
function validateform(){
var uname=document.myform.uname.value;
var pass=document.myform.pass.value;
var type=document.myform.type.value;

var emailid=document.myform.emailid.value;
var atposition=emailid.indexOf("@");
var dotposition=emailid.lastIndexOf(".");
var mobilenumber=document.myform.mobilenumber.value;
if ( uname==null || uname=="")
{
  alert("User Name can't be blank");
  return false;
}
else if (!/^[a-zA-Z]*$/g.test(document.myform.uname.value)) {
    alert("Enter only  characters as User Name");
    return false;
}
else if ( pass==null ||pass=="")
{
  alert("Password can't be blank");
  return false;
}

   
if (isNaN(mobilenumber) || mobilenumber==null || mobilenumber=="" || mobilenumber.length!=10)
  {
    document.getElementById("numloc").innerHTML="Enter only Numeric value 10 digit Mobile Number ";
    return false;
  }
else if (atposition<1 || dotposition<atposition+2 || dotposition+2>=x.length)
    {
  alert("Please enter a valid e-mail address \n atpostion:"+atposition+"\n dotposition:"+dotposition);
  return false;
  }
else{
	return true;
}
}
function test(inputtxt)
{
	var type=inputtxt.value;
	if(type=="user" || type=="admin"|| type=="supervisor" )
	   {
	  /* alert('Your type  has accepted....');  */

	   return true;
	   }
	   else
	   {
	   alert('Please input value must be either user or admin or supervisor');
	   document.form1.uname.focus();
	   return false;
	   }
	}
	

</script>
</head>











<!-- <td>User Type</td>
     <td><input type="text" name="uname" onblur="test(document.form1.uname)"/><td>
    </tr>
   </table>
  </form>
  <script type="text/javascript">
   function test(inputtxt)
   {
      var type=inputtxt.value;
      if(type=="user" || type=="admin" )
      {
      alert('Your type  has accepted....');

      return true;
      }
      else
      {
      alert('Please input value must be either user or admin');
      document.form1.uname.focus();
      return false;
      }
 -->





















			<body bgcolor="skyblue">
				<table bgcolor="pink" border="5">
					<form action="./signup" method="post" name="myform" onsubmit="return validateform()">
						<tr>
							<td>UserName</td>
							<td><input type="text" name="uname"></td>
						</tr>
						<tr>
							<td>Password</td>
							<td><input type="password" name="pass"></td>
						</tr>


						
						
						
						<td>Type</td>
				<td><select name="type" Value="select">

						<option value="admin">Admin</option>
						<option value="user">User</option>

						<option value="supervisor">Supervisor</option>
				</select> </select></td>
						
						
						
						
						
 



						<!-- <tr>

							<td>Type</td>
							
							<td><input type="text" name="type" onblur="test(document.myform.type)"></td>
						</tr>  -->
						<tr>
							<td>Email Id</td>
							<td><input type="text" name="emailid"></td>
						</tr>
						<tr>
							<td>MobileNumber</td>
							<td><input type="text" name="mobilenumber"><span id="numloc"></td>
						</tr>

						<tr>
							<td><input type="submit" value=SignUp></td>
						</tr>


					</form>




				</table>
			</body>



			<%@ include file="Footer.jsp"%>