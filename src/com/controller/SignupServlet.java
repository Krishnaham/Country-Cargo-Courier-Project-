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
import com.daoImpl.signupdaoimp;

/**
 * Servlet implementation class SignupServlet
 */
public class SignupServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignupServlet() {
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
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		UserBean u = new UserBean();
		u.setUserName(request.getParameter("uname"));
		u.setPassWord(request.getParameter("pass"));
		try {
			u.setType(request.getParameter("type"));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		u.setEmail(request.getParameter("emailid"));
		try {
			u.setMobileNumber(Long.parseLong(request.getParameter("mobilenumber")));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		signupdaoimp signUp=new signupdaoimp();
		int n=signUp.insertIntoDataBase(u);
		
		if(n!=0)
		{
			out.println("Succesfully Registered");
			RequestDispatcher rd=request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}
		else{
			out.println(" Not Succesfully  Registered");
			RequestDispatcher rd=request.getRequestDispatcher("/Signup.jsp");
			rd.include(request, response);
		}
		
		
		
		
		
	}

}
