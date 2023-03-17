package com.Ankita;


	import java.io.IOException;

	import java.io.PrintWriter;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Statement;

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
		private Connection connection;
	       
	public void init(ServletConfig config)
	{

			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection("jdbc:mysql://localhost/mybd","root","Ankuanshu@123");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		

	}

		

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String firstName = request.getParameter("firstName");
			String LastName = request.getParameter("lastName");
			String email = request.getParameter("email");
			String password = request.getParameter("password");
			try {
				Statement statement = connection.createStatement();
				int result = statement.executeUpdate("insert into user values('"+firstName+"','"+LastName+"','"+email+"','"+password+"')");
				PrintWriter out = response.getWriter();
				if(result>0)
					{out.print("<H1>USER CREATED</H1>");}
				else
				{
					out.print("<H1>ERROR</H1>");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		public void destroy()
		{
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}


