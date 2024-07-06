package com.chainsys.codingchallenge;

import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] arr={4,5,3,7,1};
		int[] arr1 = sortIndex(new int[] {4,5,3,7,1});
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr1));
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[j]==arr1[i]) {
					System.out.print(j);
				}
			}
		}

	}
	public static int[] sortIndex(int[] arr1) {
        int temp;
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int j = 0; j < arr1.length - 1 - i; j++) {
                if (arr1[j] > arr1[j + 1]) {
                    temp = arr1[j];
                    arr1[j] = arr1[j + 1];
                    arr1[j + 1] = temp;
                }
            }
        }
        return arr1;
    }

}
