package com.all;
import java.util.List;

import javax.persistence.*;
import javax.persistence.Entity;
//import javax.persistence.OneToMany;
//import javax.persistence.Table;

@Entity

public class zdepartinfo {
	@Id
	private int dept_id;
	
	private String dept_name;
	
	@OneToMany(mappedBy="dept_id",cascade=CascadeType.ALL)
	private List<Employee> emp;

	public zdepartinfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getDept_id() {
		return dept_id;
	}

	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}

	public String getDept_name() {
		return dept_name;
	}

	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}



	

	public zdepartinfo(int dept_id, String dept_name, List<Employee> emp) {
		super();
		this.dept_id = dept_id;
		this.dept_name = dept_name;
		this.emp = emp;
	}

	@Override
	public String toString() {
		return "zdepartinfo [dept_id=" + dept_id + ", dept_name=" + dept_name + ", emp=" + emp + "]";
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}
	
	
}
