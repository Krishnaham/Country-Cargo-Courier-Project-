<<style>
 #login-area{
    padding:10px 10px 10px 10px;
 }
</style>
<%@ include file="Header.jsp" %>
<head>
<script type="text/javascript">
function validateform(){
var uname=document.myform.uname.value;
var pass=document.myform.pass.value;


if ( uname==null || uname=="")
{
  alert("User Name can't be blank");
  return false;
}
else if ( pass==null ||pass=="")
{
  alert("Password can't be blank");
  return false;
}
}
</script>
</head>


		<div id="login-bg">
			<!--Login Area Starts -->
			<div id="login-area">
				 <form action="/login" method="post" name="myform" onsubmit="return validateform()">
		<table border="4" align="center" bgcolor="skyblue">
			<tr>
				<td>UserName</td>
				<td><input type="text" name="uname" /></td>
			</tr>
			<tr>
				<td>PassWord</td>
				<td><input type="password" name="pass" /></td>
			</tr>
			<tr>
				<td><input type="submit" value="LogIn"></td>
				<td><a href="forgot.html">ForgotPassWord</a></td>
			</tr>
		</table>
	</form>
			</div>
			<!--Login Area Ends -->
		</div>
		<!--Login Background Ends -->
		<%@ include file="Footer.jsp"%>