package com.all;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private double salary;
@OneToOne(cascade = CascadeType.ALL)
@JoinColumn(name="adhar_id",referencedColumnName = "adhar_id",unique=true)
private Adharinfo adhar_id;

@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name="dept_id")
private zdepartinfo dept_id;

@ManyToMany(cascade = {CascadeType.PERSIST , CascadeType.MERGE})
@JoinTable(name = "employee_project", 
joinColumns = @JoinColumn(name = "id"), 
inverseJoinColumns = @JoinColumn(name = "proj_id"))
private List<Project> project;

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public Adharinfo getAdhar_id() {
	return adhar_id;
}
public void setAdhar_id(Adharinfo adhar_id) {
	this.adhar_id = adhar_id;
}

public zdepartinfo getDept_id() {
	return dept_id;
}
public void setDept_id(zdepartinfo dept_id) {
	this.dept_id = dept_id;
}


public List<Project> getProject() {
	return project;
}
public void setProject(List<Project> project) {
	this.project = project;
}
public Employee(int id, String name, double salary, Adharinfo adhar_id, zdepartinfo dept_id) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.adhar_id = adhar_id;
	this.dept_id = dept_id;
}

public Employee(int id, String name, double salary, Adharinfo adhar_id, zdepartinfo dept_id, List<Project> project) {
	super();
	this.id = id;
	this.name = name;
	this.salary = salary;
	this.adhar_id = adhar_id;
	this.dept_id = dept_id;
	this.project = project;
}
@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", adhar_id=" + adhar_id + ", dept_id="
			+ dept_id + "]";
}


}
