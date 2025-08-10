package com.all;


import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.*;
public class EmployeeDoa {
	private SessionFactory factory;

	// Constructor to initialize SessionFactory (Fix 5)
	public EmployeeDoa() {
		this.factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
	}
	public void insertEmployee(Employee emp) {
		try(Session session = factory.openSession()){
			Transaction tt = session.beginTransaction();
			session.save(emp);
			tt.commit();
		}
		}
		
	public void showallEmployee() {
	    try (Session session = factory.openSession()) {
	        List<Employee> empList = session.createQuery("FROM Employee", Employee.class).list();
	       
	            for (Employee employee : empList) {
	                System.out.println(employee);
	            }
	        
	    } 
	}
	public void insertProjects(List<Project> pros) {
		// TODO Auto-generated method stub
		try(Session session = factory.openSession()){
			Transaction tt = session.beginTransaction();
			for (Project project : pros) {
				session.save(project);
			}

			tt.commit();
		}
		
	}
		
	
}
