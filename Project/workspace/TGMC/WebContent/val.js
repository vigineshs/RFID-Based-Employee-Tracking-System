function name1()
{
 var d=document.fname.value;
if(d=="")
alert("Enter the name");
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
 var d=document.fname.value;
if(d=="")
alert("Enter the name");
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
   if(document.age.value=="")
     alert("Enter age");
   else
    if(document.age.value<25) 
     alert("Enter age above 18 years");
   var a=document.age.value;
    var b=new RegExp("^\\d\\d\$") ;
  if(!b.test(a))
     alert("enter number");
}

function email()
{
	
var x=document.mail.value;
atpos=x.indexOf("@");
dotpos=x.lastIndexOf(".");
if(atpos<1 || dotpos<atpos+2 || dotpos+3>=x.length)
alert("Enter valid ID");
}

function username()
{
var u=document.uname.value;
if(u.length==0)
alert("enter username");

}

function password()
{
var l=document.password.value;
if(l.length==0)
alert("Enter password");
else if(l.length<6)
alert("password should be minimum 6 characters");
}

function confirm()
{
var c=document.password1.value;
var l=document.password.value;
if(l!=c)
alert("passwords don't match!!");
}

function gender()
{
if((!document.gender[0].checked)&&(!document.gender[1].checked))
alert("Choose any one gender");
}

function check()
{
if((!document.accept.checked))
alert("Accept the condition!");
}

function validate()
{

name1();
age();
email();
password();
confirm();
gender();

}