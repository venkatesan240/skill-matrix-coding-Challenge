package members;

public class MainMember {

	public static void main(String[] args) {
			Employee employee=new Employee("raj",20,1234567890, "madurai",1000.0,"develor","it");
			Manager manager=new Manager("kumar",22,1234567890,"madurai",2000.0,"manager","it");
			System.out.println(employee.toString());
			System.out.println(manager.toString());
	}

}
