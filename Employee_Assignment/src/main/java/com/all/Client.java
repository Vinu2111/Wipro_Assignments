package com.all;

import java.util.Arrays;
import java.util.List;

public class Client {
	public static void main(String[] args) {
		EmployeeDoa ed = new EmployeeDoa();
		Adharinfo ad = new Adharinfo(6737, "prajwal", "namgpur");
		Adharinfo ar = new Adharinfo(0656, "nilesh", "amravtei");
		zdepartinfo dd = new zdepartinfo(111, "software", null);
		zdepartinfo dc = new zdepartinfo(121, "tester",null);
		Project p1 = new Project(101,"Adfluence",null); 
		Project p2 = new Project(102, "Upstox",null);
		Project p3 = new Project(103,"Zomato",null);

		List<Project> pros = Arrays.asList(p1, p2, p3);

		ed.insertProjects(pros);

		
		Employee emp = new Employee(101, "prajwalemp", 8000, ad,dd,pros);
		Employee emc = new Employee(102, "nileshemp", 8000, ar,dc,pros);
        ed.insertEmployee(emp);
        ed.insertEmployee(emc);
		ed.showallEmployee();
	}

}
