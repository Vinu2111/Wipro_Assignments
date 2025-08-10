package com.all;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="projectinfo")
public class Project {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int proj_id;
	private String proj_name;
	
	@ManyToMany(mappedBy = "project", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	private List<Employee> emp;

	public int getProj_id() {
		return proj_id;
	}

	public void setProj_id(int proj_id) {
		this.proj_id = proj_id;
	}

	public String getProj_name() {
		return proj_name;
	}

	public void setProj_name(String proj_name) {
		this.proj_name = proj_name;
	}

	public List<Employee> getEmp() {
		return emp;
	}

	public void setEmp(List<Employee> emp) {
		this.emp = emp;
	}

	public Project(int proj_id, String proj_name, List<Employee> emp) {
		super();
		this.proj_id = proj_id;
		this.proj_name = proj_name;
		this.emp = emp;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Project [proj_id=" + proj_id + ", proj_name=" + proj_name + ", emp=" + emp + "]";
	}
	
	
}
