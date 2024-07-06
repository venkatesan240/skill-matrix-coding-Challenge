package com.chainsys.codingchallenge;

import java.util.Arrays;

public class DivideArrayByGcd {
	public static void main(String[] args) {
        int[] arr = {36 ,12,9 ,48, 15};       
        int gcd = findGcdOfArray(arr);        
        System.out.println("Original array of numbers: " + Arrays.toString(arr));
        System.out.println("The GCD is: " + gcd);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / gcd;
        }

        System.out.println("Resulting array: " + Arrays.toString(arr));
    }

    public static int findGcdOfArray(int[] arr) {
        int gcd = arr[0];
        for (int i = 1; i < arr.length; i++) {
            gcd = findGcd(gcd, arr[i]);
            if (gcd == 1) {
                break; 
            }
        }
        return gcd;
    }

    public static int findGcd(int a, int b) {
    	int min=(a>b)?a:b;
    	int gcd=1;
       for(int i=2;i<=min;i++) {
    	   if(a%i==0 && b%i==0) {
    		   gcd=i;
    	   }
       }
        return gcd;
    }
}
