package wiprohibernateassisment.Testcollege;

import wiprohibernateassisment.entities.collegedata;
import wiprohibernateassisment.service.collegeservice;

public class TestCollege {
public static void main(String[] args) {
	System.out.println("collegeproject");
	collegedata std = new collegedata(1,"prajwal","anand",22,"male");
	collegeservice service = new collegeservice();
	service.insertintocollegedata(std);;
}
}
