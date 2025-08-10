package com.examplesb.demoSB;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String name;
private double marks;
private String hobbies;
public long getId() {
	return id;
}
public Student() {
	super();
	// TODO Auto-generated constructor stub
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
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}
public String getHobbies() {
	return hobbies;
}
public void setHobbies(String hobbies) {
	this.hobbies = hobbies;
}
public Student(long id, String name, double marks, String hobbies) {
	super();
	this.id = id;
	this.name = name;
	this.marks = marks;
	this.hobbies = hobbies;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", marks=" + marks + ", hobbies=" + hobbies + "]";
}

}
