package LECTURE_7;

import java.util.Scanner;

public class majority_element {

	  public int majorityElement(int[] nums) {
		 Scanner sc=new Scanner(System.in);
		 int n = sc.nextInt();
	     int c = nums[0] , count = 1;
			for(int  i = 1 ; i<nums.length; i++) {
				if(nums[i] == c) {
					count++;
				}
				else {
					count--;
					if(count==0) {
						c = nums[i];
						count = 1;
					}
				}
			}
			return c;   
	    }
	}



