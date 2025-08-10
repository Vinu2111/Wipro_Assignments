package wiprohibernateassisment.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import wiprohibernateassisment.entities.collegedata;

public class collegeservice {

	private SessionFactory factory;


	 public collegeservice() {
	
			this.factory = new Configuration().configure("configure.cfg.xml").buildSessionFactory();
	}

	 
	 public void insertintocollegedata(collegedata data) {
		 try(Session session = factory.openSession()){
			 Transaction tt = session.beginTransaction();
			 session.save(data);
			 tt.commit();
		 }
		 
	 }
}
