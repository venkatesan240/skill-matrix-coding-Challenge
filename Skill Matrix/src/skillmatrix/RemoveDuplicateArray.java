package skillmatrix;

import java.util.Scanner;

public class RemoveDuplicateArray {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int num = scanner.nextInt();
        int[] nums = new int[num];
        System.out.println("Enter the array element:"); 
        for(int i=0;i<num;i++) {
        	nums[i]=scanner.nextInt();
        }
       int index = removeDuplicate(nums);
        System.out.println("Length: " + index);
        System.out.print("Array: [");
        for (int i = 0; i < index; i++) {
            System.out.print(nums[i]);
            if (i < index - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
    
    public static int removeDuplicate(int[] nums) {
    	 int index = 1; 
         for (int i = 1; i < nums.length; i++) {
             if (nums[i] != nums[i - 1]) {
                 nums[index] = nums[i];
                 index++;
             }
         }
		return index;
    	
    }

}
