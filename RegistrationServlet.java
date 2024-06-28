package com.fauxy.backend;

@WebServlet("/register")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Userdao userdao = new Userdaoimpl();
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		Userr user = new Userr();
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(password);
		
		if(userdao.register(user)) {
			response.sendRedirect("register.jsp?register=success");
		}else {
			response.sendRedirect("register.jsp?error=1");
		}
	}

}
