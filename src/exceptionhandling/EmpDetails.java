package exceptionhandling;
/*
 *create exception class name as "EmployeeException" (user defined exception) in a package name as "com.cg.eis.exception"
 *and throw an exception if salary of the employee is below than 3000.
 *use exception handling mechanism to handle exception properly.
 */

import java.util.Scanner;

public class EmpDetails {
	
	String eName;
	int eId;
	double eSalary;
	String eDesignation;
	
	
	EmpDetails() {
		super();
		this.eName = eName;
		this.eId = eId;
		this.eSalary = eSalary;
		this.eDesignation = eDesignation;
	}
	public static void main(String[] args) {

		Scanner scn= new Scanner(System.in);
		System.out.println("");
		String name= scn.nextLine();
		int id= scn.nextInt();
		double salary= scn.nextDouble();
		String desig= scn.nextLine();

		EmpDetails emp1= new EmpDetails();

//		EmpDetails emp1= new EmpDetails();

	}

}
