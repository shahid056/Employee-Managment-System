package com.jsp.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Dept")
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Dept_Id" )
	private int id;
	@Column(name = "Dept_Name",nullable = false)
	private String name;
	@Column(name = "Dept_phone",nullable = false,unique = true)
	private long phone;
	@Column(name = "Dept_location")
	private String Location;

	@OneToMany(mappedBy = "deparment")
	private List<Employee> employee;

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

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public List<Employee> getEmployee() {
		return employee;
	}

	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(String name, long phone, String location, List<Employee> employee) {
		super();
		this.name = name;
		this.phone = phone;
		Location = location;
		this.employee = employee;
	}

	public Department(String name, long phone, String location) {
		super();
		this.name = name;
		this.phone = phone;
		Location = location;
	}

}
