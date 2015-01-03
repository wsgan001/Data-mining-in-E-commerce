package com.datamining.nextservlets;
 
import java.io.IOException;
import java.io.PrintWriter;
 
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;

import com.datamining.frequentpathalgorithm.FrequentPath;

import java.sql.Connection;


public class FifthServletNext extends HttpServlet
 {

	String user_name=null;
	RequestDispatcher rd=null;
 	PrintWriter out=null;
	FrequentPath fp=null;
	String current_page="a.htmle.html";
	String next_page="f.html";

	@Override
	
	public void init(ServletConfig config) throws ServletException 
		{
			super.init(config);
		}
 

 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
 		{



			response.setContentType("text/html");
 
 			out = response.getWriter();

			fp=new FrequentPath(); 
			
			fp.updatePath(current_page,next_page);


			rd=request.getRequestDispatcher("/pages/f.jsp");

			rd.forward(request,response);

		}
 
 
	public void destroy( ) 
	{
 
	}
} 
