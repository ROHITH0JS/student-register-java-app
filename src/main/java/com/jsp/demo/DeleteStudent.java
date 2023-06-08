package com.jsp.demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DeleteStudent")
public class DeleteStudent extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		Student student=new Student();
		student.setId(id);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("rohith");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Student student2=entityManager.find(Student.class, id);
		entityTransaction.begin();
		entityManager.remove(student2);
		entityTransaction.commit();
		System.out.println("Data Deleted");
		PrintWriter printWriter=resp.getWriter();
		printWriter.print("<html><body><h1>Student Data Deleted</h1></body></html>");
	}

}
