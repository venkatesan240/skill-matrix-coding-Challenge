package com.chainsys.codingchallenge;

public class CompaingPoints {
		public static void main(String[] args) {
			
			getPoints(new int[] {5,6,7}, new int[]{3,6,10});
			getPoints(new int[] {17,28,30}, new int[]{99,16,8});
		}

		public static void getPoints(int[] person1,int[] person2) {
			int person1Point=0;
			int person2Point=0;
			for(int i=0;i<person1.length;i++) {
				if(person1[i]>person2[i]) {
					person1Point++;
				}
				else if(person2[i]>person1[i]){
					person2Point++;
				}
			}
			System.out.println("Alice:"+person1Point+"\n"+"Bob:"+person2Point);
		}

}
