package com.fauxy.backend;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import com.fauxy.dao.*;

@WebServlet("/login")
public class LoginServlett extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static Userdao userdao = new Userdaoimpl();
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String username = request.getParameter("username");
		 String password = request.getParameter("password");
		 
		 if(userdao.isValidUser(username,password)) {
			 HttpSession session = request.getSession();
			 session.setAttribute("username", username);
			 response.sendRedirect("welcome.jsp");
		 }else {
			 response.sendRedirect("login.jsp?error=1");
		 }
	}

}
