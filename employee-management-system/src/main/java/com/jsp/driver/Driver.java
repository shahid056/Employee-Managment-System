package com.jsp.driver;

import java.util.Scanner;

import com.jsp.service.DepartmentService;
import com.jsp.service.EmployeeService;
import com.jsp.service.ProjectService;

public class Driver {

	public static void main(String[] args) {
		
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("************************************************************");
	System.out.println("Enter 1 To work with Department Related Details:    ");
	System.out.println("Enter 2 To work with Employee   Related Details:    ");
	System.out.println("Enter 3 To work with Address    Related Details:    ");
	System.out.println("Enter 4 To work with Project    Related Details:    ");
	
	int choice = sc.nextInt();
	
	System.out.println("************************************************************");
	
	if(choice==1)
	{
		DepartmentService.deptService();
	}
	else if(choice==2)
	{
		EmployeeService.empService();
	}
	else if(choice==4)
	{
		ProjectService.projectService();
	}
		
		
		
		
		
		
		
		
	}

}
