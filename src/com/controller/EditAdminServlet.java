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
import com.daoImpl.Administrator;

/**
 * Servlet implementation class EditAdminServlet
 */
public class EditAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditAdminServlet() {
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
		
 response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		
		UserBean bean=new UserBean();
		bean.setUserName(request.getParameter("uname"));
		bean.setPassWord(request.getParameter("pass"));
		bean.setType(request.getParameter("type"));
		bean.setEmail(request.getParameter("emailid"));
		
		try {
			
			
			bean.setMobileNumber((Long.parseLong(request.getParameter("mobilenumber"))));
		} catch (Exception e) {
			
			out.println("enter valid input");
			
		}
		
		Administrator admin=new Administrator();
		
		
		
		int i=admin.editEmployee(bean);
		if(i>=1)
		{
			RequestDispatcher rd=request.getRequestDispatcher("./Viewadmin?id=view");
			rd.forward(request, response);
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
