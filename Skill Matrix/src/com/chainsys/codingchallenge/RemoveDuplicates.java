package com.chainsys.codingchallenge;

public class RemoveDuplicates {
	
	 public static int removeDuplicates(int[] nums) {
	        if (nums.length == 0) return 0;

	        int j = 0; 
	        for (int i = 1; i < nums.length; i++) {
	            if (nums[i] != nums[j]) {
	                j++;
	                nums[j] = nums[i];
	            }
	        }
	        return j + 1;
	    }

	    public static void main(String[] args) {
	        int[] nums1 = {1, 1, 2};
	        int length1 = removeDuplicates(nums1);
	        System.out.println("Length: " + length1); 
	        for (int i = 0; i < length1; i++) {
	            System.out.print(nums1[i] + " "); 
	        }
	        System.out.println();

	        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
	        int length2 = removeDuplicates(nums2);
	        System.out.println("Length: " + length2); 
	        for (int i = 0; i < length2; i++) {
	            System.out.print(nums2[i] + " "); 
	        }
	    }

}
