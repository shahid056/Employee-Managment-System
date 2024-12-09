package com.jsp.entity;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name = "Emp")
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "Emp_Id")
	private int id;
	@Column(name = "Emp_Name",nullable = false)
	private String name;
	@Column(name = "Emp_phone",nullable = false,unique = true)
	private long phone;
	@Column(name = "Emp_email",nullable = false,unique = true)
	private String email;
	
	@CreationTimestamp
	private LocalDate dateOfJoin;
	
	@OneToMany
	@JoinColumn
	private Department deparment;
	
	@OneToOne(mappedBy = "employee")
	private Address address;
	
	@ManyToMany(mappedBy = "employees")
	private List<Project>project;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDateOfJoin() {
		return dateOfJoin;
	}

	public void setDateOfJoin(LocalDate dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}

	public Department getAeparment() {
		return deparment;
	}

	public void setAeparment(Department aeparment) {
		this.deparment = aeparment;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(String name, long phone, String email, LocalDate dateOfJoin, Address address
			) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.dateOfJoin = dateOfJoin;
		this.address = address;
		
	}

	public Employee(String name, long phone, String email, LocalDate dateOfJoin, Department deparment,
			Address address) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.dateOfJoin = dateOfJoin;
		this.deparment = deparment;
		this.address = address;
	}

	public Employee(String name, long phone, String email, LocalDate dateOfJoin, Department deparment, Address address,
			List<Project> project) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.dateOfJoin = dateOfJoin;
		this.deparment = deparment;
		this.address = address;
		this.project = project;
	}
	
	
	
	

}
