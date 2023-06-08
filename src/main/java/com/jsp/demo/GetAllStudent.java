package com.jsp.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetAll")
public class GetAllStudent extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=1;
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("rohith");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		for(int i=1;i==id;i++) {
			Student student= entityManager.find(Student.class, id);
			if(student != null) {
				PrintWriter printWriter=resp.getWriter();
				printWriter.print("<html><body><center><h1 style=color:red;>STUDENT DETAILS:</h1>"
						+"<h1>"+"ID:"+student.getId()+"</h1>"
						+"<h1>"+"NAME:"+student.getName()+"</h1>"
						+"<h1>"+"AGE:"+student.getAge()+"</h1></center></body></html>");
				id++;
			}
		}
	}

}
