package com.amit.Hibernate.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
 
	@Id
	private int Eid;
	private String Ename;
	private String city;
	private int salary;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getEid() {
		return Eid;
	}
	public void setEid(int eid) {
		Eid = eid;
	}
	public String getEname() {
		return Ename;
	}
	public void setEname(String ename) {
		Ename = ename;
	}
	@Override
	public String toString() {
		return "Employee [Eid=" + Eid + ", Ename=" + Ename + ", city=" + city + ", salary=" + salary + "]";
	}
	
	
}
