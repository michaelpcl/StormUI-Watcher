package com.weibo.stormUI.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TopologyServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2301587146057570485L;
	
	public void doGet(HttpServletRequest request,
			HttpServletResponse response)throws IOException,ServletException{
		String clientName=request.getParameter("clientName");
		if(clientName!=null)
			clientName=new String(clientName.getBytes("ISO-8859-1"),"GB2312");
		else{
			clientName="�ҵ�����";
		}
		request.setAttribute("clientName", clientName + " ,���ã�");
		request.getRequestDispatcher("/somePage.jsp").forward(request, response); 
	}
	
}
