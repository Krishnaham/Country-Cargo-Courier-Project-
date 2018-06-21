package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.Employee;
import com.beans.UserBean;
import com.daoImpl.Administrator;

/**
 * Servlet implementation class DeleteAdminServlet
 */
public class DeleteAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteAdminServlet() {
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
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("Text/html");
        PrintWriter out=response.getWriter();
        UserBean bean=new UserBean();
        bean.setUserName(request.getParameter("uname"));
        
        bean.setType(request.getParameter("type"));
        Administrator admin=new Administrator();
        int i=admin.deleteEmployee(bean);
       
        if(i==1)
        {
        	System.out.println("Succesfully Deleted");
        	RequestDispatcher rd=request.getRequestDispatcher("AfterloginAdmin.jsp");
        	rd.include(request, response);
        }
        else{
        	System.out.println(" Record not Deleted");
        	RequestDispatcher rd=request.getRequestDispatcher("DeleteAdmin.jsp");
        	rd.include(request, response);
        }
        
		
		
		
		
		
		
		
		
		
		
		
	}

}
