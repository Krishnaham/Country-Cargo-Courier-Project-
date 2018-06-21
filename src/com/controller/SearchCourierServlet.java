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
 * Servlet implementation class SearchCourierServlet
 */
public class SearchCourierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchCourierServlet() {
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
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		

		
		System.out.println("dopost");
		   response.setContentType("text/html");
	        PrintWriter out=response.getWriter();
	        Courier courier=new Courier();
	        
	   
			courier.setCourierId(Integer.parseInt(request.getParameter("courierId")));
		
	       Supervisor supervisor=new Supervisor();
	        List<Courier> ul=supervisor.searchCourier(courier);
	        System.out.println("after method do post");
	      
	        if(ul!=null){
	        request.setAttribute("userlist", ul);
	        RequestDispatcher rd=request.getRequestDispatcher("SearchViewCourier.jsp");
	        rd.include(request, response);
	        }else{
	            out.println("Not found");
	          
	        }
	       
	       
		
		
		
		
		
		
		
		
		
	}

}
