<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="indexstyle.css">
</head>
<body>

<%
   //RETRIVE SESSION OBJECT BACK
   HttpSession session1 = request.getSession(false);
   //CHECKING IF SESSION IS EMPTY OR NOT
   if(session1 != null && session1.getAttribute("username") != null){
	   //GET THE USERNAME FROM THE SESSION
	   String username = (String) session1.getAttribute("username");
%>
 <div class="container">
        <h1>Welcome, <%= username %>! </h1>
        <p>We're delighted to have you on our platform. 🌟</p>
        <h3>Explore, learn, and connect with our vibrant community! 🚀</h3>
        <p>Feel free to stay as long as you like, and when you're ready,</p> 
        you can <a href="logout.jsp">LOGOUT</a> securely.
    </div>
    
<% } else{
   response.sendRedirect("login.jsp");
}%>
</body>
</html>