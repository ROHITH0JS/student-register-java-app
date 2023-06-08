package com.jsp.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Demo extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	     PrintWriter pw = res.getWriter();
	     String html="<html><body><h1>Rohith Raj</h1></body></html>";
	     pw.print(html);
		
	}

}
