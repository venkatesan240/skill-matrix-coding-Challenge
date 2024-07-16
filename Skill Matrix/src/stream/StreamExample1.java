package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample1 {

	public static void main(String[] args) {
		
		Student student1 = new Student(
	            "Jayesh",
	            20,
	            new Address("1234"),
	            Arrays.asList(new MobileNumber("1233"), new MobileNumber("1234")));
		Student student2=new Student(
				"ram",
				21,
				new Address("7890"),
				Arrays.asList(new MobileNumber("6578765676"),new MobileNumber("7654345678")));

		List<Student> students=Arrays.asList(student1,student2);

		List<Student> asList = Arrays.asList(student1,student2);
				asList.stream().map(student ->new Student(student.getName(),student.getAge(),student.getAddress(),student.getMobileNumbers())).collect(Collectors.toList());
			System.out.println(asList);
			
			
			List<String> collect = asList.stream().map(Student::getName).collect(Collectors.toList());
			System.out.println(collect.stream().collect(Collectors.joining(",")));
			System.out.println(collect.stream().collect(Collectors.joining(",","[","]")));
			
			 String name = students.stream()
		                .map(Student::getName)
		                .collect(Collectors.joining(",", "[", "]"));
		            System.out.println(name);
		            System.out.println("--------------------");
		            
		            
		   List<String> nameList=Arrays.asList("jayesh","ram","sanjay");
		   
		   nameList.stream().map(String::toUpperCase).forEach(System.out::println);
		   
		   boolean sortConditionFlag = true;
		     
           Stream<Student> conditionalFilterResult = students.stream()
               .filter(std -> std.getName().startsWith("J"));
    
           if(sortConditionFlag){
               conditionalFilterResult = conditionalFilterResult.sorted(Comparator.comparing(Student::getName));
           }
    
           System.out.println("Before sorting :");
           students.forEach(s -> System.out.println(s.getName()));
    
           List<Student> list = conditionalFilterResult.collect(Collectors.toList());
           System.out.println("After filter and conditional sorting :");
           list.forEach(s -> System.out.println(s.getName()));
	}

}
