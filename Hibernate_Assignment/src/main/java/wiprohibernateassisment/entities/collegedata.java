package wiprohibernateassisment.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="collegedata")
public class collegedata {

	@Id
	private int rno;
	private String fname;
	private String lname;
	private int age;
	private String gender;
	
	private collegedata() {
		super();
		// TODO Auto-generated constructor stub
	}
	public collegedata(int rno, String fname, String lname, int age, String gender) {
		super();
		this.rno = rno;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
		this.gender = gender;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
}
