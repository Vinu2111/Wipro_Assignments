package com.all;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="adharinfo")
public class Adharinfo {
@Id
@Column(name="adhar_id")
private int adhar_id;
private String name;
private String address;


public Adharinfo() {
	super();
	// TODO Auto-generated constructor stub
}
public Adharinfo(int adhar_id,String name,String address) {
	this.adhar_id = adhar_id;
	this.name = name;
	this.address = address;
	
}
public void setadhar_id(int adhar_id) {
	this.adhar_id = adhar_id;
}
public int getadhar_id() {
	return adhar_id;
}
public void setname(String name) {
	this.name = name;
}

public String getname() {
	return name;
}
public void setaddress(String address) {
	this.address = address;
	
}
public String getaddress() {
	return address;
}
@Override
public String toString() {
	return "Adharinfo [adhar_id=" + adhar_id + ", name=" + name + ", address=" + address + "]";
}

}
