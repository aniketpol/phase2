<%@ page language="java" contentType="text/html; charset=US-ASCII"
    pageEncoding="US-ASCII"%>

<html>

<head>
          
     <style>
     body {
	margin: 0;
	padding: 0;
}
h1 {
	
	text-align : center;
	font-family: "SIMPSON";
}
form {
	    padding-top: 20%;
    padding-left: 7%;
}

#centerDiv{
    background-color : #D3D3D3;
    border: 1px solid black;
    font-size: 24px;
    margin-top: 10%;
    margin-right: 30%;
    margin-left: 30%;
    height: 50%;
    
    
	}

#call{

 font-size: 17px;
}
#titleBar{
     margin-left: 26%;
}

 </style>
<title>Phase II </title>
</head>
<body background="fizzbuzz.png">
<div id="centerDiv">
 <span id="titleBar">Phase-II PhoneBuzz</span>
<form action="/phase2/index" method="POST">
Please enter valid phone no with country code: <input type="text" name="phone_number" style="width: 100px;" maxLength="12">
<input id ="call" type="submit" value="Call" />
</form>
</div>

</body>
</html>
