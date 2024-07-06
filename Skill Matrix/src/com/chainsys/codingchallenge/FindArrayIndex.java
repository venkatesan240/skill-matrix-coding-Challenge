package com.chainsys.codingchallenge;

public class FindArrayIndex {

	public static void main(String[] args) {
		int[] array= {4,3,7,6,7,2,2};
		int number=76;
		
		for(int i=0;i<array.length-1;i++) {
			if((array[i]*10)+array[i+1]==number) {
				System.out.println(array[i-1]);
				break;
			}
		}
	}

}
