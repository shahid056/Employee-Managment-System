package com.jsp.entity;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import org.hibernate.annotations.CreationTimestamp;


@Entity
public class Project {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "project_Id")
	private int id;
	private String projectTitle;
	@CreationTimestamp
	@Column(nullable = false,updatable = false)
	private LocalDate StartingDate;
	@Column(nullable = false,updatable = false)
	private LocalDate deadLine;
	
	@ManyToMany
	@JoinTable(joinColumns=@JoinColumn ,inverseJoinColumns = @JoinColumn)
	private List<Employee> employees;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProjectTitle() {
		return projectTitle;
	}

	public void setProjectTitle(String projectTitle) {
		this.projectTitle = projectTitle;
	}

	public LocalDate getStartingDate() {
		return StartingDate;
	}

	public void setStartingDate(LocalDate startingDate) {
		StartingDate = startingDate;
	}

	public LocalDate getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(LocalDate deadLine) {
		this.deadLine = deadLine;
	}

	public List<Employee> getEmployee() {
		return employees;
	}

	public void setEmployee(List<Employee> employee) {
		this.employees = employee;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Project(String projectTitle, LocalDate startingDate, LocalDate deadLine) {
		super();
		this.projectTitle = projectTitle;
		StartingDate = startingDate;
		this.deadLine = deadLine;
	}


	
	
	
	
	
	
}
