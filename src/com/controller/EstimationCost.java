package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daoImpl.Supervisor;

/**
 * Servlet implementation class EstimationCost
 */
public class EstimationCost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EstimationCost() {
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
		

		
		response.setContentType("text/html");
        PrintWriter out=response.getWriter();
       Supervisor supervisor=new Supervisor();
        List<EstimationCost> ul=(List)supervisor.estimationCost();
        if(ul!=null){
        request.setAttribute("userlist", ul);
        RequestDispatcher rd=request.getRequestDispatcher("/EstimationCost.jsp");
        rd.include(request, response);
        }else{
            RequestDispatcher rd=request.getRequestDispatcher("index.html");
            rd.forward(request, response);
          
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
