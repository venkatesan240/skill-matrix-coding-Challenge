package employee;

import java.util.Scanner;

public class MyClass {
	
	public static int  findCountOfEmployeesUsingCompTransport(Employee[] employee,String branch) {
		int count=0;
		for(int i=0;i<employee.length;i++) {
		if(	employee[i].getBranch().equals(branch)) {
			count++;
		}
		}
		return count;
		
	}
	
	public static Employee findEmployeeWithSecondHighestRating(Employee[] employees) {
	    Employee highest = null;
	    Employee secondHighest = null;

	    for (Employee employee : employees) {
	        if (!employee.getCompanyTransport()) {
	            if (highest == null || employee.getRating() > highest.getRating()) {
	                secondHighest = highest;
	                highest = employee;
	            } else if (secondHighest == null || employee.getRating() > secondHighest.getRating()) {
	                secondHighest = employee;
	            }
	        }
	    }

	    return secondHighest;
	}

	public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the no. of employee");
			int num=scan.nextInt();
			Employee[] employe=new Employee[num];
			for(int i=0;i<num;i++) {
				System.out.println("Enter the employeeId:");
				int employeeId=scan.nextInt();
				System.out.println("Enter the name:");
				String name=scan.next();
				System.out.println("Enter the branch:");
				String branch=scan.next();
				System.out.println("Enter the rating:");
				double rating=scan.nextDouble();
				System.out.println("company transport(true,false)");
				boolean companyTransport=scan.nextBoolean();
				employe[i]=new Employee(employeeId,name,branch,rating,companyTransport);
			}
			System.out.println("Enter the branch:");
			String branch=scan.next();
			int countOfEmployeesUsingCompTransport = findCountOfEmployeesUsingCompTransport(employe,branch);
			System.out.println(countOfEmployeesUsingCompTransport);
			Employee employeeWithSecondHighestRating = findEmployeeWithSecondHighestRating(employe);
			System.out.println(employeeWithSecondHighestRating.getEmployeeId());
			System.out.println(employeeWithSecondHighestRating.getName());
	}

}
