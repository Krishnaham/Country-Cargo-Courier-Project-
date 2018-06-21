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
 * Servlet implementation class EditCourierServlet
 */
public class EditCourierServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EditCourierServlet() {
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
       
    Courier courier=new Courier();
        courier.setCourierId(Integer.parseInt(request.getParameter("courierId")));
        
        courier.setReceiverName(request.getParameter("receiverName"));
      /* if(courier.getReceiverName().equals(null) || courier.getReceiverName()=="")
       {
    	   out.println("Enter valid Receiver name");
       }*/
        courier.setReceiverName(request.getParameter("receiverName"));
        courier.setReceiverAddress(request.getParameter("receiverAddress"));

        courier.setReceiverMobileNumber(Long.parseLong(request
                .getParameter("receiverMobileNumber")));
        courier.setReceiverEmailId(request.getParameter("receiverEmailId"));
        courier.setSenderName(request.getParameter("senderName"));
        courier.setSenderAddress(request.getParameter("senderAddress"));

        try {
			courier.setSenderMobileNumber(Long.parseLong(request
			        .getParameter("senderMobileNumber")));
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

        courier.setSenderEmailId(request.getParameter("receiverEmailId"));
        courier.setCourierWeight(Integer.parseInt(request
                .getParameter("courierWeight")));
        courier.setStatus(request.getParameter("status"));
   
        Supervisor supervisor=new Supervisor();
        int i = supervisor.editCourier(courier);
        System.out.println(i);
        if(i==1)
        {
            out.println("Details edited successfully");
           
            RequestDispatcher rd=request.getRequestDispatcher("./ViewCourier?id=view");
            rd.forward(request, response);
        }
        else
        {
            out.println("updation failed");
           
        }
       
       
    }
    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


