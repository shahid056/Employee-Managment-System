package com.jsp.service;

import java.util.Scanner;

import com.jsp.dao.DepartmentDao;
import com.jsp.entity.Department;

public class DepartmentService {
	
	 static Scanner sc = new Scanner(System.in);
	 
	public static void deptService()
 {
	
		
		System.out.println("Enter 1 To Add New Department : ");
		System.out.println("Enter 2 To Fetch  The Details Of Existing Employee :");
		System.out.println("Enter 3 To Update Existing Department Details :");
		System.out.println("Enter 4 To Delete The Existing Department :");
		int choice = sc.nextInt();
		
		System.out.println("************************************************************");
		
		if(choice==1)
		{
			addNewDepartment();
		}
		else if(choice==2)
		{
			getDeptId();
		}
		else if(choice==3)
		{
			updateDept();
		}
		else if (choice==4)
		{
			deleteDept();
		}
		
		
	}
	
	public static void addNewDepartment() {
		
		sc.nextLine();
		
		System.out.println("Enter The Department Name:");
		String deptName = sc.nextLine();
		System.out.println("Enter The Department Phone:");
		long deptPhone = sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter The Department Location:");
		String deptLocation = sc.nextLine();
		
		Department department = new Department(deptName, deptPhone, deptLocation);
		DepartmentDao.addNewDepartment(department);
	}
	
	public static void getDeptId()
	{
		System.out.println("Enter the Department Id Whose Details Needs To be Fetched:  ");
		int id = sc.nextInt();
		
		 Department department= DepartmentDao.getDeptById(id);
		 
		 if(department!= null ) {
			 System.out.println("Department Details Are: ");
			 System.out.println("Department Id is : "+department.getId());
			 System.out.println("Department Name is : "+department.getName());
			 System.out.println("Department Phone is : "+department.getPhone());
			 System.out.println("Department Location is : "+department.getLocation());
			 
		 }
		 else
		 {
		 System.out.println("Department with "+id+ "Doesn't Exist");
		 }
	}
	
	public static void updateDept()
	{
		System.out.println("Enter the Department Id Whose Details Needs To be Updated:  ");
		int id = sc.nextInt();
		
		Department department = DepartmentDao.getDeptById(id);
		
		if(department !=null)
		{
			sc.nextLine();
			System.out.println("Enter The Department Name:");
			String deptName = sc.nextLine();
			System.out.println("Enter The Department Phone:");
			long deptPhone = sc.nextLong();
			sc.nextLine();
			System.out.println("Enter The Department Location:");
			String deptLocation = sc.nextLine();
			
			department.setName(deptName);
			department.setPhone(deptPhone);
			department.setLocation(deptLocation);
			DepartmentDao.updateDept(department);
			
		}
		else 
		{
			System.out.println("Department with "+id+ "Doesn't Exist");
		}
	}
	
	public static void deleteDept()
	{
		System.out.println("Enter the Department Id Whose Details Needs To be Deleted:  ");
		int id = sc.nextInt();
		
		Department department = DepartmentDao.getDeptById(id);
		
		if(department !=null)
		{
			DepartmentDao.deleteDept(department);
		}
		else 
		{
			System.out.println("Department with "+id+ "Doesn't Exist");
		}
		
	}
	
	

}
