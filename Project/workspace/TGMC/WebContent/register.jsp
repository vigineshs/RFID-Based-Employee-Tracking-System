<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Company | Leading India</title>
<link rel="stylesheet" href="css/style.css">
<script type="text/javascript" >
function name1()
{
 var d=document.f1.fname.value;
if(document.f1.fname.value=="")
alert("Enter first name");
  var i;
for(i=0;i<d.length;i++)
  {  
var temp=d.charAt(i);
var tt=new RegExp("^\\d\$") ;
if(tt.test(temp))
{
alert("Enter only character");
break;
}}}

function ans()
{
 var d=document.f1.sqans.value;
if(document.f1.sqans.value=="")
alert("Enter answer");
  var i;
for(i=0;i<d.length;i++)
  {  
var temp=d.charAt(i);
var tt=new RegExp("^\\d\$") ;
if(tt.test(temp))
{
alert("Enter only character");
break;
}}}

function name2()
{
 d=document.f1.lname.value;
if(document.f1.lname.value=="")
alert("Enter last name");
  var i;
for(i=0;i<d.length;i++)
  {  
var temp=d.charAt(i);
var tt=new RegExp("^\\d\$") ;
if(tt.test(temp))
{
alert("Enter only character");
break;
}}}

function age()
{
   if(document.f1.age.value=="")
     alert("Enter age");
   else
    if(document.f1.age.value<25) 
     alert("Enter age above 25 years");
   var a=document.f1.age.value;
    var b=new RegExp("^\\d\\d\$") ;
  if(!b.test(a))
     alert("enter age in number");
}



function username()
{
var u=document.f1.uname.value;
if(u=="")
alert("enter username");
else if(u.length<6)
alert("username should be minimum 6 characters");

}

function emp()
{
	
var x=document.f1.empid.value;
if(x=="")
alert("enter employee ID");
atpos=x.indexOf("@");
ashpos=x.IndexOf("#");
if((atpos!=1 || ashpos!=7) && (atpos!=7 || ashpos!=1))
alert("Enter valid employee ID");
}

function email()
{
	
var e=document.f1.mail.value;
if(e=="")
alert("enter mail ID");
atpos=e.indexOf("@");
dotpos=e.lastIndexOf(".");
if(atpos<1 || dotpos<atpos+1 || dotpos+3>=e.length)
alert("Enter valid email ID");
}

function password()
{
var l=document.f1.password.value;
if(l=="")
alert("Enter password");
else if(l.length<6)
alert("password should be minimum 6 characters");
}

function confirm()
{
var c=document.f1.password1.value;
var l=document.f1.password.value;
if(l!=c)
alert("passwords don't match!!");
}

function gender()
{
if((!document.f1.gender[0].checked)&&(!document.f1.gender[1].checked))
alert("Choose any one gender");
}

function check()
{
if((!document.f1.accept.checked))
alert("Accept the condition!");
}

function validate()
{

name1();
name2();
age();
gender();
emp();
email();
password();
confirm();
ans();
check();


} </script>
</head>
<body
	style="background-image: url('images/header1.png'); background-repeat: no-repeat;">
<div id="container">
<div id="heading">
<h1 style="margin-left: 30px;">Company | Leading India</h1>
</div>
<div id="content">
<div id="form1">


<form name="f1" action="http://localhost:8090/TGMC/Signup" method="get">
<table>

	<tr>
		<td>First Name</td>
		<td><input type="text" size=25 name="fname"  /></td>
	</tr>
	<tr>
		<td>Last Name</td>
		<td><input type="text" size=25 name="lname"  /> <br />
		</td>
	</tr>
	<tr>
		<td>Age</td>
		<td><input type="text" name="age"  ></input></td>
	</tr>
	<tr>
		<td>Gender</td>
		<td><input type="radio" name="gender" value="Male" >Male<input
			type="radio" name="gender" value="Female" >Female</td>
	</tr>
	<tr>
		<td>Date of Birth</td>
		<td><select name="day">
			<option value="00">Date</option>
			<option value="01">1</option>
			<option value="02">2</option>
			<option value="03">3</option>
			<option value="04">4</option>
			<option value="05">5</option>
			<option value="06">6</option>
			<option value="07">7</option>
			<option value="08">8</option>
			<option value="09">9</option>
			<option value="10">10</option>
			<option value="11">11</option>
			<option value="12">12</option>
			<option value="13">13</option>
			<option value="14">14</option>
			<option value="15">15</option>
			<option value="16">16</option>
			<option value="17">17</option>
			<option value="18">18</option>
			<option value="19">19</option>
			<option value="20">20</option>
			<option value="21">21</option>
			<option value="22">22</option>
			<option value="23">23</option>
			<option value="24">24</option>
			<option value="25">25</option>
			<option value="26">26</option>
			<option value="27">27</option>
			<option value="28">28</option>
			<option value="29">29</option>
			<option value="30">30</option>
			<option value="31">31</option>
		</select> <select name="month">
			<option value="00">Month</option>
			<option value="01">JAN</option>
			<option value="02">FEB</option>
			<option value="03">MAR</option>
			<option value="04">APR</option>
			<option value="05">MAY</option>
			<option value="06">JUN</option>
			<option value="07">JUL</option>
			<option value="08">AUG</option>
			<option value="09">SEP</option>
			<option value="10">OCT</option>
			<option value="11">NOV</option>
			<option value="12">DEC</option>
		</select> <select name="year">
			<option value="0000">Year</option>
			<option value="1970">1970</option>
			<option value="1971">1971</option>
			<option value="1972">1972</option>
			<option value="1973">1973</option>
			<option value="1974">1974</option>
			<option value="1975">1975</option>
			<option value="1976">1976</option>
			<option value="1977">1977</option>
			<option value="1978">1978</option>
			<option value="1979">1979</option>
			<option value="1980">1980</option>
			<option value="1981">1981</option>
			<option value="1982">1982</option>
			<option value="1983">1983</option>
			<option value="1984">1984</option>
			<option value="1985">1985</option>
			<option value="1986">1986</option>
			<option value="1987">1987</option>
			<option value="1988">1988</option>
			<option value="1989">1989</option>
			<option value="1990">1990</option>
			<option value="1991">1991</option>
			<option value="1992">1992</option>
			<option value="1993">1993</option>
			<option value="1994">1994</option>
			<option value="1995">1995</option>
			<option value="1996">1996</option>
			<option value="1997">1997</option>
			<option value="1998">1998</option>
			<option value="1999">1999</option>
		</select></td>
	</tr>

	<tr>
		<td>Employee ID</td>
		<td><input type="text" size=7 name="empid" /></td>
		<td>Email-ID</td>
		<td><input type="text" size=25 name="mail" /></td>
	</tr>

	<tr>
		<td>Username</td>
		<td><input type="text" size=25 name="uname" /></td>
	</tr>

	<tr>
		<td>Password</td>
		<td><input type="password" size=25 name="password" /></td>

		<td>Re-enter Password</td>
		<td><input type="password" size=25 name="password1" /></td>
	</tr>

	<tr>
		<td>Secret Question</td>
		<td><select name="sq">
			<option value="1">Who is your favorite Actor?</option>
			<option value="2">What is name of the your birth place?</option>
			<option value="3">What is the name of your first teacher?</option>
		</select></td>
	</tr>
	<tr>
		<td>Answer</td>
		<td><input type="text" name="sqans"></td>
	</tr>
	<tr>
	 
	<td colspan="4"><input type="checkbox" name="accept" /> I Hereby Declare that all the above mentioned details are true to my knowledge failing which actions can be taken against Me </td>
	</tr>
	<tr>
		<td colspan="4">
		<center><input type="submit" value="Register" onfocus="validate()" style="background-color: #5C92E9; color: #fff;"/></center>
		</td>
	</tr>

</table>
</form>

</div>
</div>
</div>
</body>
</html>