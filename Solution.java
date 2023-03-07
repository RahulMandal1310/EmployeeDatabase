package edbms;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Welcome to Employee Database Mamagement System");
System.out.println("-----------------------------------------------");
Scanner sc=new Scanner(System.in);
EmployeeManagementSystem emp=new EmployeeManagementSystemImpl();
while(true) {

	System.out.println("1:Add Employee\n 2:Display Employee\n 3:Display All Employee");
	System.out.println("4:Remove Employee\n 5:Remove All Employee\n 6:Update Employee");
	System.out.println("7:Count Employee\n 8:Sort Employee\n 9:Get Employee with Highest Salary\n10:Get Employee with Lowest Salary");
	System.out.println("11:Exit\nEnter the choice");
	int choice=sc.nextInt();
	switch(choice) {
	case 1:
		emp.addEmployee();
		break;
	case 2:
		emp.displayEmployee();
		break;
	case 3:
		emp.displayAllEmployee();
		break;
	case 4:
		emp.removeEmployee();
		break;
	case 5:
		emp.removeAllEmployee();
		break;
	case 6:
		
	}
}
	}

}
