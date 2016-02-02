 function validate_required(field)
{
with(field)
{
if(value==null||value=="")
{
field.focus();
field.style.background="#FFE87C";
return false;
}
else
{
return true;
}
}
}

 
 function IsNumeric(field)
 {
 with(field)
 {

 var ValidChars = "0123456789-/";
 var IsNumber=true;
 var Char;
 var sText=field.value;

 for (i = 0; i < sText.length && IsNumber == true; i++)
 {
 Char = sText.charAt(i);
 if (ValidChars.indexOf(Char) == -1)
 {
 IsNumber = false;
 }
 }
 if(IsNumber==false)
 field.focus();
 field.style.background="#FFE87C";
 return IsNumber;

 }
 }


 
function validate()
{
  var firstname = document.getElementById("fname");
  var lastname = document.getElementById("lname");
  var age = document.getElementById("age");
   var gender = document.getElementById("gender");
    var day = document.getElementById("day");
     var month = document.getElementById("month");
      var year = document.getElementById("year");
      var empid = document.getElementById("empid");
      var emailid = document.getElementById("mail");
      
var username = document.getElementById("uname");
  var password = document.getElementById("password");
  var repassword = document.getElementById("password1");
  var resaddr = document.getElementById("resaddr");
      var resno = document.getElementById("resno");
      var mobno = document.getElementById("mobno");
   	var acc1 = document.getElementById("acc1");
   	var acc2 = document.getElementById("acc2");
   	var acc3 = document.getElementById("acc3");
   	var acc4 = document.getElementById("acc4");
   
   	
  var sqans = document.getElementById("sqans");
  
  var flag = 0;
      var i = 1;

     
if(validate_required(firstname)==false) {flag = 1;}
       if(validate_required(lastname)==false) {flag = 1;}
       if(validate_required(age)==false) {flag = 1;}  
       
       if(validate_required(gender)==false) {flag = 1;}
       if(validate_required(dob)==false) {flag = 1;} 
       if(validate_required(empid)==false) {flag = 1;} 
       if(validate_required(emailid)==false) {flag = 1;}
       if(validate_required(username)==false) {flag = 1;}
       if(validate_required(password)==false) {flag = 1;}
       if(validate_required(repassword)==false) {flag = 1;}  
       if(validate_required(resaddr)==false) {flag = 1;} 
       if(validate_required(resno)==false) {flag = 1;} 
       if(validate_required(mobno)==false) {flag = 1;} 
       if(validate_required(acc1)==false) {flag = 1;} 
       if(validate_required(acc2)==false) {flag = 1;} 
       if(validate_required(acc3)==false) {flag = 1;} 
       if(validate_required(acc4)==false) {flag = 1;} 
       if(validate_required(sqans)==false) {flag = 1;} 
       
       if( IsNumeric(age) == false)
        {
           msg.innerHTML= "<font color='red'>Age must be filed with numbers</font>";
           return false;
        }
        
        if( IsNumeric(acc1) == false)
        {
           msg.innerHTML= "<font color='red'>Account no must be filed with numbers</font>";
           return false;
        }
        if( IsNumeric(acc2) == false)
        {
           msg.innerHTML= "<font color='red'>Account no must be filed with numbers</font>";
           return false;
        }
        if( IsNumeric(acc3) == false)
        {
           msg.innerHTML= "<font color='red'>Account no must be filed with numbers</font>";
           return false;
        }
        if( IsNumeric(acc4) == false)
        {
           msg.innerHTML= "<font color='red'>Account no must be filed with numbers</font>";
           return false;
        }
        if( IsNumeric(resno) == false)
        {
           msg.innerHTML= "<font color='red'>res. no must be filed with numbers</font>";
           return false;
        }
        if( IsNumeric(mobno) == false)
        {
           msg.innerHTML= "<font color='red'>Mob No. must be filed with numbers</font>";
           return false;
        }


if(flag == 1)
        {
               
        msg.innerHTML="<font color='red'>The highlighted fields must be filled</font>";
        return false;
        }
else
    return true;

}


function fpvalidate()
{
	  var sqans = document.getElementById("sqans");
	  alert("hi");
	  var flag = 0;
	      
	var username = document.getElementById("uname");
	
	  if(validate_required(username)==false) {flag = 1;}
      if(validate_required(sqans)==false) {flag = 1;}  


      if(flag == 1)
       {
              
       msg.innerHTML="<font color='red'>The highlighted fields must be filled</font>";
       return false;
       }
      else	
    	  return true;

}

function login_validate()
{
	var username = document.getElementById("uname");
	  var password = document.getElementById("password");
	
	  var flag = 0;
	        if(validate_required(username)==false) {flag = 1;}
       if(validate_required(password)==false) {flag = 1;}  
       
       if(flag == 1)
               {
                      
               msg.innerHTML="<font color='red'>The highlighted fields must be filled</font>";
               return false;
               }
       else
           return true;

}
