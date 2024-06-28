<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="stylecss.css">

</head>
<body>
    <div class="container">
        <h1>Register</h1>
        <form action="register" method="post">
            <label for="username">Username:</label>
            <input type="text" id="username" name="username" required><br>
            <label for="email">Email:</label>
            <input type="text" id="username" name="email" required><br>   
            <label for="password">Password:</label>
            <input type="password" id="password" name="password" required><br>
            <button type="submit">Register</button>
        </form>
    
        <p><a href="index.html">Back to Home</a></p>
        
        
      <%
        //IF MY REGISTRATION GOT FAILED I'LL DISPLAY THIS 
        String error = request.getParameter("error");  
        if(error == "1" && error != null){ %>
        <!-- Error display-->
        	<p style="color: red;">Registration Failed. Please try again.</p>
        	
      <% } %> 
      
      <div class="linkss">
      <%
       //Display message if register successfully
        String success = request.getParameter("register");
        if(success != null && success.equals("success")) { %>
        
          <!-- if registration succussfuly client will get login link if not success display error-->
        <a href="login.jsp">LOGIN</a>
   
      <%} %>
      </div>
   </div>
</body>
</html>