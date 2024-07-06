package com.chainsys.codingchallenge;

public class LongestCommonPrefix {

	public static String longestCommonPrefix(String[] strs) {
        String shortest = strs[0];
        for (String str : strs) {
            if (str.length() < shortest.length()) {
                shortest = str;
            }
        }
        for (int i = 0; i < shortest.length(); i++) {
            char currentChar = shortest.charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != currentChar) {
                    return shortest.substring(0, i);
                }
            }
        }        
        return shortest;
    }

    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        String[] strs2 = {"dog", "racecar", "car"};
        String[] strs3 = {"interview", "internet", "internal", "interval"};
        String[] strs4 = {"apple", "ape", "april"};

        System.out.println(longestCommonPrefix(strs1)); 
        System.out.println(longestCommonPrefix(strs2)); 
        System.out.println(longestCommonPrefix(strs3)); 
        System.out.println(longestCommonPrefix(strs4)); 
    }
}
