package com.saraya;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/bag.do")
public class BagServlet extends HttpServlet {
	BagService bgs = new BagService();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		request.setAttribute("bags", bgs.getAllBags());
		request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		int year = Integer.parseInt(request.getParameter("yr"));
		String make = request.getParameter("mk");
		String model = request.getParameter("md");
		String image = request.getParameter("im");
		
	   bgs.addBag(year, make, model, image);
	   response.sendRedirect("/bag.do");

	}

}





