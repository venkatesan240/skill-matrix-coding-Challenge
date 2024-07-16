package programmingfundamentals;

import java.util.ArrayList;
import java.util.List;

public class Company {
	
	private String companyName;
	private Employee[] employees;
	private int numEmployees;
	
	public Company(String companyname, Employee[] employees, int numEmployees) {
		super();
		this.companyName = companyname;
		this.employees = employees;
		this.numEmployees = numEmployees;
	}
	
	public double getAverageSalary() {
		double averageSalary = 0;
		double temp = 0;
		for(int i=0;i<employees.length;i++) {
			double salary=employees[i].getSalary();
			temp=temp+salary;
			averageSalary=temp/employees.length;
		}
		return averageSalary;
		
	}
	
	public double getMaxSalary() {
		double highSalary = 0;
		double salary=employees[0].getSalary();		
		for(int i=0;i<employees.length;i++) {
			if(salary<employees[i].getSalary()) {
				highSalary=employees[i].getSalary();
			}
		}
		return highSalary;
		
	}
	
	public Employee[] getEmployeeByDesignation(String designation) {
	    List<Employee> employeeList = new ArrayList<>();

	    for (int i = 0; i < employees.length; i++) {
	        if (designation.equals(employees[i].getDesignation())) {
	            employeeList.add(employees[i]);
	        }
	    }

	    Employee[] result = new Employee[employeeList.size()];
	    result = employeeList.toArray(result);
	    return result;
	}
}
