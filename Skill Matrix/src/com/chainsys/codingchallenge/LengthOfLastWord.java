package com.chainsys.codingchallenge;

public class LengthOfLastWord {
	
	 public static int lengthOfLastWord(String s) {
	        int length = 0;
	        int i = s.length() - 1;
	        while (i >= 0 && s.charAt(i) == ' ') {
	            i--;
	        }
	        while (i >= 0 && s.charAt(i) != ' ') {
	            length++;
	            i--;
	        }
	        return length;
	    }

	    public static void main(String[] args) {
	        String s1 = "Hello World";
	        String s2 = "   ";
	        String s3 = "Hello";
	        String s4 = "Hello World   ";

	        System.out.println(lengthOfLastWord(s1)); 
	        System.out.println(lengthOfLastWord(s2)); 
	        System.out.println(lengthOfLastWord(s3)); 
	        System.out.println(lengthOfLastWord(s4)); 
	    }

}
