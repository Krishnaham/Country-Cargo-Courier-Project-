package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.UserBean;
import com.daoImpl.Administrator;

/**
 * Servlet implementation class ViewAdminServlet
 */
public class ViewAdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ViewAdminServlet() {
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
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		Administrator ad = new Administrator();
		if (request.getParameter("id").equals("view")) {
			List<UserBean> b = ad.viewEmployees();

			if (b != null) {
				request.setAttribute("list", b);
				RequestDispatcher rd = request
						.getRequestDispatcher("ViewAdmin.jsp");
				rd.include(request, response);

			} else {
				RequestDispatcher rd = request
						.getRequestDispatcher("AfterloginAdmin.jsp");
				rd.include(request, response);

			}
		} else if (request.getParameter("id").equals("edit")) {
			List<UserBean> b = ad.viewEmployees();
			

			if (b != null) {
				request.setAttribute("list", b);
				RequestDispatcher rd = request
						.getRequestDispatcher("EditAdmin.jsp");
				rd.include(request, response);

			} else {
				RequestDispatcher rd = request
						.getRequestDispatcher("AfterloginAdmin.jsp");
				rd.include(request, response);

			}
		}
			
			else if (request.getParameter("id").equals("delete")) {
				List<UserBean> b = ad.viewEmployees();
				

				if (b != null) {
					request.setAttribute("list", b);
					RequestDispatcher rd = request
							.getRequestDispatcher("DeleteAdmin.jsp");
					rd.include(request, response);

				} else {
					RequestDispatcher rd = request
							.getRequestDispatcher("AfterloginAdmin.jsp");
					rd.include(request, response);

				}
			
			
			
			
			
			

		}

	}
}
