<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<body>

<%
HttpSession session1 = request.getSession(false);

if(session1 != null){
	session1.invalidate();
}

response.sendRedirect("index.html");
%>


</body>
</html>