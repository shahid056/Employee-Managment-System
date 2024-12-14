package com.jsp.service;

import java.util.Scanner;

import com.jsp.dao.EmployeeDao;
import com.jsp.entity.Address;
import com.jsp.entity.Employee;

public class EmployeeService {

	static Scanner sc = new Scanner(System.in);
	 
	public static void empService()
 {
	
		
		System.out.println("Enter 1 To Add New Employee : ");
		System.out.println("Enter 2 To Fetch  The Details Of Existing Employee :");
		System.out.println("Enter 3 To Update Existing Employee Details :");
		System.out.println("Enter 4 To Delete The Existing Employee :");
		int choice = sc.nextInt();
		
		System.out.println("************************************************************");
		
		if(choice==1)
		{
			addNewEmp();
		}
		else if(choice==2)
		{
			getEmpId();
		}
		else if(choice==3)
		{
			updateEmp();
		}
		else if (choice==4)
		{
			deleteEmp();
		}
		
		
	}
	
	public static void addNewEmp() {
		
		sc.nextLine();
		
		System.out.println("Enter The Employee Name:");
		String empName = sc.nextLine();
		System.out.println("Enter The Employee Phone:");
		long empPhone = sc.nextLong();
		sc.nextLine();
		
		System.out.println("Enter The Employee Email:");
		String empEmail = sc.nextLine();
		System.out.println("**********************************************************");
		
		System.out.println("Enter the Address Details: ");
		System.out.println("**********************************************************");
		
		System.out.println("Enter the street: ");
		String street = sc.nextLine();
		
		System.out.println("Enter the city: ");
		String city = sc.nextLine();
		System.out.println("Enter the state: ");
		String state = sc.nextLine();
		
		System.out.println("Enter the Country: ");
		String country = sc.nextLine();
		
		System.out.println("Enter the Pincode: ");
		int pincode = sc.nextInt();
		
		Employee employee = new Employee(empName, empPhone, empEmail);
		Address address = new Address(street, city, state, country, pincode, employee);
		employee.setAddress(address);
		EmployeeDao.addNewEmp(employee);
		

	}
	
	public static void getEmpId()
	{
		System.out.println("Enter the Employee Id Whose Details Needs To be Fetched:  ");
		int id = sc.nextInt();
		
	 Employee employee = EmployeeDao.getEmpById(id);
		 
		 if(employee!= null ) {
			 System.out.println("Employee Details Are: ");
			 System.out.println("Employee Id is : "+employee.getId());
			 System.out.println("Employee Name is : "+employee.getName());
			 System.out.println("Employee Phone is : "+employee.getPhone());
			 System.out.println("Employee Email is : "+employee.getEmail());
			 
		 }
		 else
		 {
		 System.out.println("Department with "+id+ "Doesn't Exist");
		 }
	}
	
	public static void updateEmp()
	{
		System.out.println("Enter the Employee Id Whose Details Needs To be Updated:  ");
		int id = sc.nextInt();
		
		Employee employee = EmployeeDao.getEmpById(id);
		
		if(employee !=null)
		{
			sc.nextLine();
			System.out.println("Enter The Employee Name:");
			String empName = sc.nextLine();
			System.out.println("Enter The Employee Phone:");
			long empPhone = sc.nextLong();
			sc.nextLine();
			System.out.println("Enter The Employee Email:");
			String empEmail = sc.nextLine();
			
			employee.setName(empName);
			employee.setPhone(empPhone);
			employee.setEmail(empEmail);
			EmployeeDao.updateEmp(employee);
			
		}
		else 
		{
			System.out.println("Employee with "+id+ "Doesn't Exist");
		}
	}	
		public static void deleteEmp()
		{
			System.out.println("Enter the Employee Id Whose Details Needs To be Deleted:  ");
			int id = sc.nextInt();
			
			Employee employee = EmployeeDao.getEmpById(id);
			
			
			if(employee !=null)
			{
				EmployeeDao.deleteEmp(employee);
			}
			else 
			{
				System.out.println("Department with "+id+ "Doesn't Exist");
			}
	}
	
	
	
}
