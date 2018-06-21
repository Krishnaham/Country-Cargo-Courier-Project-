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
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserServlet() {
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
		
		UserDAOImp userDAOimp = new UserDAOImp();
		String type = userDAOimp.verify(u);
		
		
		if(type==null)
		{
			out.println("Invalid UserName/PassWord please try again");
			RequestDispatcher rd = request.getRequestDispatcher("/index.html");
			rd.include(request, response);
		}else if(type.equalsIgnoreCase("admin")){
			RequestDispatcher rd = request.getRequestDispatcher("//AfterloginAdmin.jsp");
			rd.forward(request, response);
		}else if(type.equalsIgnoreCase("supervisor")){
				RequestDispatcher rd = request.getRequestDispatcher("//AfterloginSupervisor.jsp");
				rd.forward(request, response);
		}else{
			RequestDispatcher rd = request.getRequestDispatcher("/AfterloginUser.jsp");
			rd.forward(request, response);
		}
	}

}
