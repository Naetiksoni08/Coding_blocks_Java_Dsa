package assignment_questions;

import java.util.Scanner;

public class maximum_circular_sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t>0) {
            int size= sc.nextInt();
            int []arr = new int [size];
            for(int i = 0 ;i<arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println(maximum_subarraysum(arr));
            t--;


        }
	}
        

        public static int maximum_subarraysum(int []arr) {
            int linearsum = kadens(arr);
            int sum = 0;
            for(int i = 0 ;i<arr.length; i++) {
                sum+=arr[i];
                arr[i] = arr[i] * -1;
            }
            int mid = kadens(arr);
            int circular_sum = sum+mid;
            if (circular_sum == 0) {
            return linearsum;
        }
            return Math.max(linearsum,circular_sum);

        }
        public static int kadens(int[]arr) {
            int ans = Integer.MIN_VALUE;
            int sum = 0;
            for(int i = 0 ;i<arr.length; i++) {
                sum+=arr[i];
                ans= Math.max(ans,sum);
                if(sum<0) {
                    sum=0;
                }
            }
            return ans;

        }
       
}




