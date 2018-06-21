package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daoImpl.Supervisor;

/**
 * Servlet implementation class DeleteCourierServlet
 */
public class DeleteCourierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCourierServlet() {
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
		

		
		 int courierId;
	        response.setContentType("Text/html");
	        PrintWriter out=response.getWriter();
	        courierId=((Integer.parseInt(request.getParameter("courierId"))));
	       
	        Supervisor supervisor=new Supervisor();
	        int i=supervisor.deleteCourier(courierId);
	       
	        if(i==1){
	           
	            out.println("record deleted");
	            
	            RequestDispatcher rd=request.getRequestDispatcher("deleteCourier.jsp");
	            rd.include(request, response);
	           

	    }
	        else{
	            out.println("not deleted");
	            
	        }
	}
		
		
		
		
	}


