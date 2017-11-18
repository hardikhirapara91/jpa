package com.hardik.jpa.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Employee Bean
 * 
 * @author HARDIK HIRAPARA
 *
 */
@Entity
@Table(name = "emp_record")
public class Employee {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int empid;
	private String firstname;
	private String lastname;
	private String email;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [firstname=" + firstname + ", lastname=" + lastname
				+ ", email=" + email + "]";
	}
}
