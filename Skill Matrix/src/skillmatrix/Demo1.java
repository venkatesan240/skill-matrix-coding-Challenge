package skillmatrix;

import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the limit:");
		int limit=scanner.nextInt();
		String arr[]=new String[limit];
		System.out.println("Enter the Strings:");
		for(int i=0;i<limit;i++) {
			arr[i]=scanner.next();
		}
		  System.out.println("Longest common prefix: " + longestCommonPrefix(arr));
	        scanner.close();
	    }

	    public static String longestCommonPrefix(String[] strs) {
	        if (strs == null || strs.length == 0) {
	            return "";
	        }

	        String prefix = strs[0];
	        for (int i = 1; i < strs.length; i++) {
	            while (strs[i].indexOf(prefix) != 0) {
	                prefix = prefix.substring(0, prefix.length() - 1);
	                if (prefix.isEmpty()) {
	                    return findLongestCommonPrefix(strs);
	                }
	            }
	        }

	        return prefix;
	    }

	    public static String findLongestCommonPrefix(String[] strs) {
	        String longestPrefix = "";
	        for (int i = 0; i < strs.length; i++) {
	            for (int j = i + 1; j < strs.length; j++) {
	                String prefix = strs[i];
	                while (strs[j].indexOf(prefix) != 0) {
	                    prefix = prefix.substring(0, prefix.length() - 1);
	                    if (prefix.isEmpty()) {
	                        break;
	                    }
	                }
	                if (prefix.length() > longestPrefix.length()) {
	                    longestPrefix = prefix;
	                }
	            }
	        }
	        return longestPrefix;
	    }
}
