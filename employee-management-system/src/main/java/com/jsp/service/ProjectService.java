package com.jsp.service;

import java.time.LocalDate;
import java.util.Scanner;

import com.jsp.dao.EmployeeDao;
import com.jsp.dao.ProjectDao;
import com.jsp.entity.Employee;
import com.jsp.entity.Project;

public class ProjectService {

	
	static Scanner sc = new Scanner(System.in);
	 
	public static void projectService()
 {
	
		
		System.out.println("Enter 1 To Add New Project : ");
		System.out.println("Enter 2 To Fetch  The Details Of Existing Project :");
		System.out.println("Enter 3 To Update Existing Project Details :");
		System.out.println("Enter 4 To Delete The Existing Project :");
		int choice = sc.nextInt();
		
		System.out.println("************************************************************");
		
		if(choice==1)
		{
			addNewProject();
		}
		else if(choice==2)
		{
			getProId();
		}
		else if(choice==3)
		{
			//updateDept();
		}
		else if (choice==4)
		{
			//deleteDept();
		}
		
		
	}
	
	public static void addNewProject() {
		
		sc.nextLine();
		
		System.out.println("Enter The Project title:");
		String proTitle = sc.nextLine();
		
		System.out.println("Project Deadline Details:");
		System.out.println("*********************************************");
		
		System.out.println("Enter the Project Deadline Date:");
		int date = sc.nextInt();
		
		System.out.println("Enter the Project Deadline Month:");
		int month = sc.nextInt();
		
		System.out.println("Enter the Project Deadline Year:");
		int year = sc.nextInt();
		
		Project project = new Project(proTitle, LocalDate.of(year, month, date));
		
		ProjectDao.addNewProject(project);
	}
	
	public static void getProId()
	{
		System.out.println("Enter the Project Id Whose Details Needs To be Fetched:  ");
		int id = sc.nextInt();
		
	 Project project = ProjectDao.getProById(id);
		 
		 if(project!= null ) {
			 System.out.println("Project Details Are: ");
			 System.out.println("Project Id is : "+project.getId());
			 System.out.println("Project Title is : "+project.getTitle());
			 System.out.println("Project Start Date is : "+project.getStartdate());
			 System.out.println("Project Deadline is : "+project.getDeadline());
			 
		 }
		 else
		 {
		 System.out.println("Project with "+id+ "Doesn't Exist");
		 }
	}
	
	public static void updatePro()
	{
		System.out.println("Enter the Project Id Whose Details Needs To be Updated:  ");
		int id = sc.nextInt();
		
		 Project project = ProjectDao.getProById(id);
		 
		
		if(project !=null)
		{
			sc.nextLine();
			System.out.println("Enter The new Project Title:");
			String proTitle = sc.nextLine();
			System.out.println("Enter The New Project Start date:");
			int proStartDate = sc.nextInt();
			System.out.println("Enter The New Project Deadline:");
			int proDeadline = sc.nextInt();
			
			project.set
			
		}
		else 
		{
			System.out.println("Employee with "+id+ "Doesn't Exist");
		}
	}	
	
	
	
}
