package com.chainsys.codingchallenge;

import java.util.Arrays;

public class ProductElement {

	public static void productOfElement(int[] arr) {
		int[] arr1=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			int sum=1;
			for(int j=0;j<arr.length;j++) {
				if(i!=j) {
					sum=sum*arr[j];
				}
			}
			arr1[i]=sum;
		}
		System.out.println(Arrays.toString(arr1));
	}
	public static void main(String[] args) {
		productOfElement(new int[]{1,3,2,4,5});
		productOfElement(new int[]{4,10,3});
	}

}
