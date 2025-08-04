package assignment_questions;

import java.util.Scanner;

public class Maximum_Sum_Path_in_Two_Arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();  

        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] arr = new int[n];
            int[] arr1 = new int[m];

            
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            
            for (int i = 0; i < m; i++) {
                arr1[i] = sc.nextInt();
            }

          
            t--;
            System.out.println(maximum_sum(arr, arr1));
        }
    }

    public static int maximum_sum(int[] arr, int[] arr1) {
        int i = 0, j = 0;
        int sum1 = 0, sum2 = 0, result = 0;

        while (i < arr.length && j < arr1.length) {
            if (arr[i] < arr1[j]) {
                sum1 += arr[i];
                i++;
            } else if (arr[i] > arr1[j]) {
                sum2 += arr1[j];
                j++;
            } else {
                // Common element
                result += Math.max(sum1, sum2) + arr[i];
                i++;
                j++;
                sum1 = 0;
                sum2 = 0;
            }
        }

      
        while (i < arr.length) {
            sum1 += arr[i++];
        }

        while (j < arr1.length) {
            sum2 += arr1[j++];
        }

        result += Math.max(sum1, sum2);

        return result;
    }
}

