package programmingfundamentals;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter company name:");
		String companyName=scan.nextLine();
		System.out.println("Enter number of employee:");
		int employees=scan.nextInt();
		Employee employe[]=new Employee[employees];
		for(int i=0;i<employees;i++) {
			System.out.println("Enter the name:");
			String name=scan.next();
			System.out.println("Enter designation:");
			String designation=scan.next();
			System.out.println("Enter salary:");
			double salary=scan.nextDouble();
			employe[i]=new Employee(i+1,name,designation,salary);
		}
		Company company=new Company(companyName,employe,employees);
		System.out.println("Average salary:"+company.getAverageSalary());
		System.out.println("max salary:"+company.getMaxSalary());
		System.out.println("Employees with designation:");
		String designation=scan.next();
		Employee[] employee1 = company.getEmployeeByDesignation(designation);
		for(Employee emp:employee1) {
			System.out.println("Id:"+emp.getId()+",Name"+emp.getName()+",Designation"+emp.getDesignation()+",salary"+emp.getSalary());
		}
		
	}

}
