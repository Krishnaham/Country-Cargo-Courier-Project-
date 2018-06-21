package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.Courier;
import com.daoImpl.Supervisor;

/**
 * Servlet implementation class ViewCourierServlet
 */
public class ViewCourierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewCourierServlet() {
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
		

		
		PrintWriter out=response.getWriter();
	       Supervisor supervisor=new Supervisor();
	       if(request.getParameter("id").equals("view"))
	       {
	        List<Courier> ul=supervisor.viewCourier();
	        if(ul!=null){
	        request.setAttribute("userlist", ul);
	        RequestDispatcher rd=request.getRequestDispatcher("ViewCourier.jsp");
	        rd.include(request, response);
	        }else{
	           /* RequestDispatcher rd=request.getRequestDispatcher("SignUp.jsp");
	            rd.forward(request, response);*/
	         out.println("no rcrd");
	        }
	       }
	       else if(request.getParameter("id").equals("edit"))
	       {
	    	   
	    	   List<Courier> ul=supervisor.viewCourier();
		        if(ul!=null){
		        request.setAttribute("userlist", ul);
		        RequestDispatcher rd=request.getRequestDispatcher("EditCourier.jsp");
		        rd.include(request, response);
		        }else{
		           /* RequestDispatcher rd=request.getRequestDispatcher("SignUp.jsp");
		            rd.forward(request, response);*/
		         out.println("no rcrd");
		        }
	    	   
	    	   
	       }
	       else if(request.getParameter("id").equals("delete"))
	       {
	    	   
	    	   List<Courier> ul=supervisor.viewCourier();
		        if(ul!=null){
		        request.setAttribute("userlist", ul);
		        RequestDispatcher rd=request.getRequestDispatcher("DeleteCourier.jsp");
		        rd.include(request, response);
		        }else{
		        	out.println("Row Not Deleted");
		            RequestDispatcher rd=request.getRequestDispatcher("DeleteCourier.jsp");
		            rd.include(request, response);		         
		        }
	    	   
	    	   
	       }
	       
	       
	       
	       
	    }

	

		
		
		
		
		
		
		
		

}

