package com.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.Courier;
import com.daoImpl.Supervisor;

/**
 * Servlet implementation class AddCourierServlet
 */
public class AddCourierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCourierServlet() {
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
	        PrintWriter out = response.getWriter();
	        Courier courier = new Courier();
	        try {
	            courier.setReceiverName(request.getParameter("receiverName"));
	            courier.setReceiverAddress(request.getParameter("receiverAddress"));

	            courier.setReceiverMobileNumber(Long.parseLong(request
	                    .getParameter("receiverMobileNumber")));
	            courier.setReceiverEmailId(request.getParameter("receiverEmailId"));
	            courier.setSenderName(request.getParameter("senderName"));
	            courier.setSenderAddress(request.getParameter("senderAddress"));

	            courier.setSenderMobileNumber(Long.parseLong(request
	                    .getParameter("senderMobileNumber")));

	            courier.setSenderEmailId(request.getParameter("receiverEmailId"));
	            courier.setCourierWeight(Integer.parseInt(request
	                    .getParameter("courierWeight")));
	            courier.setStatus(request.getParameter("status"));
	        } catch (NumberFormatException e) {
	       
	            e.printStackTrace();
	        }

	        Supervisor supervisor = new Supervisor();

	        int i = supervisor.addCourier(courier);
	        if (i == 1) {
	            out.println("record inserted");

	            RequestDispatcher rd = request.getRequestDispatcher("/AddCourier.jsp");
	            rd.forward(request, response);
	        } else {

	            out.println("not inserted");
	        }
	    }
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


