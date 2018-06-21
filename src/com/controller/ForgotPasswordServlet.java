package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.UserBean;
import com.daoImpl.UserDAOImp;

/**
 * Servlet implementation class ForgotPasswordServlet
 */
public class ForgotPasswordServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ForgotPasswordServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		UserBean u = new UserBean();
		u.setUserName(request.getParameter("uname"));
		u.setEmail(request.getParameter("email"));
		UserDAOImp udi=new UserDAOImp();
		String Password=udi.getPassword(u);
		System.out.println(Password);
		if(Password!=null)
		{
			request.setAttribute("pass", Password);
			RequestDispatcher rd=request.getRequestDispatcher("ViewForgotPassword.jsp");
			rd.include(request, response);
			
			
		}
		else{
			
			out.println("Enter valid UserName or Email");
			RequestDispatcher rd=request.getRequestDispatcher("ForgotPassword.jsp");
			rd.include(request, response);
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
