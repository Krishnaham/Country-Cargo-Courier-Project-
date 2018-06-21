<%@ include file="AdminHeader.jsp"%>




<!-- =============================================body================================= -->




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
    document.getElementById("numloc").innerHTML="Enter  10 digit Mobile Number ";
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

















<body bgcolor="skyblue">
	<table bgcolor="pink" border="5" id="adt">
		<form action="./addadmin" method="post" name="myform"
			onsubmit="return validateform()">
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
				<td><input type="text" name="mobilenumber"><span
					id="numloc"></td>
			</tr>

			<tr>
				<td><input type="submit" value=Add></td>
			</tr>


		</form>




	</table>
	<style>
	#adt {
padding: 10px 61px 3px 59px;
margin: 60px 60px 50px -175px;
}
	</style>

</body>



<%@ include file="Footer.jsp"%>