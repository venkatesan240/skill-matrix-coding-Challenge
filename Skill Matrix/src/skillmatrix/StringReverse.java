package skillmatrix;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();

	        String result = reverseWords(input);

	        System.out.println("Reversed string: " + result );
	}
	
		public static String reverseWords(String s) {
	        String[] words = s.split(" ");
	        StringBuilder reversedString = new StringBuilder();

	        for (int i = words.length - 1; i >= 0; i--) {
	            if (!words[i].isEmpty()) {
	                reversedString.append(words[i]).append(" ");
	            }
	        }
	        return reversedString.toString().trim();
	    }

}
