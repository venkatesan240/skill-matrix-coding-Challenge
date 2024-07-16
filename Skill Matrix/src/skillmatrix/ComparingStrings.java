package skillmatrix;

import java.util.Scanner;

public class ComparingStrings {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String name1= scanner.nextLine();

        System.out.print("Enter the second string: ");
        String name2 = scanner.nextLine();

        if (name1.equals(name2)) {
            System.out.println("The strings are equal.");
        } else {
            System.out.println("The strings are not equal.");
        }
	}

}
