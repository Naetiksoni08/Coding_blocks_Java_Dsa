package blind_45_days_sheet;

public class Subarray_sum_equal_to_k {

	public static void main(String[] args) {
     int[]arr = {1,2,3};
     int k = 3;
     System.out.println(subarray(arr, k));
	}
	public static int subarray(int []arr,int k) {
		int sum=0;
		int count = 0;
		int start = 0;
		int end = 0;
		if(k==0) {
			return 0; // if k is 0 and array has only 1 element
		}
		while(end<arr.length) {
			sum+=arr[end];
			
			while(sum>k) {
				sum-=arr[start];
				start++;
			}
			if(sum==k) {
				count++;
				
			}
			end++;
			
		}
		return count;
		
	}

}
