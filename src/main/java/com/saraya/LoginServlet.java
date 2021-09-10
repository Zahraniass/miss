package com.saraya;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/login.do")
public class LoginServlet extends HttpServlet {
	UserValidation id = new UserValidation();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		//System.out.println(request.getParameter("name"));
		
		String nomDeU = request.getParameter("nom");
		String pw = request.getParameter("pass");
		
		boolean valid = id.isValid(nomDeU, pw);
		if(valid) {
		request.getSession().setAttribute("name", nomDeU);
		request.getSession().setAttribute("password", pw);
		response.sendRedirect("/bag.do");
		}else {
			request.setAttribute("errorMessage", "Sorry Wrong Credential");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);	
		}
	}
}

