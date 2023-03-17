package com.Ankita;


	import java.io.IOException;

	import java.io.PrintWriter;
	

	import javax.servlet.ServletConfig;
	import javax.servlet.ServletException;
	import javax.servlet.annotation.WebServlet;
	import javax.servlet.http.HttpServlet;
	import javax.servlet.http.HttpServletRequest;
	import javax.servlet.http.HttpServletResponse;

	/**
	 * Servlet implementation class CreateUserServlet
	 */
	@WebServlet(urlPatterns="/addservlet")
	public class Testdemo  extends HttpServlet {
		private static final long serialVersionUID = 1L;
		
	       
	public void init(ServletConfig config)
	{

			
			
		

	}

		

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String firstName = request.getParameter("firstName");
			String LastName = request.getParameter("lastName");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			
				PrintWriter out = response.getWriter();
				
					{out.print("<H1>Hello! </H1>" +firstName+ " " +LastName+ " please gift me a new cloth else I will disclose your password...Heheee ");}
				
			
			
		

	}
	}


