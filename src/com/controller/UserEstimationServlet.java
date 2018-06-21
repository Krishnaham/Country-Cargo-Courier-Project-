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

import com.daoImpl.Supervisor;

/**
 * Servlet implementation class UserEstimationServlet
 */
public class UserEstimationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserEstimationServlet() {
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
        PrintWriter out=response.getWriter();
       Supervisor supervisor=new Supervisor();
        List<EstimationCost> ul=(List)supervisor.estimationCost();
        if(ul!=null){
        request.setAttribute("userlist", ul);
        RequestDispatcher rd=request.getRequestDispatcher("UserEstimation.jsp");
        rd.include(request, response);
        }else{
            RequestDispatcher rd=request.getRequestDispatcher("AfterloginUser.jsp");
            rd.forward(request, response);
          
        }
		
		
		
		
		
		
		
		
		
		
	}

}
