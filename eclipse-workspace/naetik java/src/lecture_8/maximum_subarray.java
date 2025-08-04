package lecture_8;

public class maximum_subarray {

	public static void main(String[] args) {
	int arr[] = {-2,1,-3,4,-1,2,1,-5,4};
	System.out.print(maximumsum(arr));
	
	}
	
	
	public static int maximumsum( int arr []) {
		int ans= Integer.MIN_VALUE;// there can be negative value so we took the most smallest number 
		for(int i = 0 ; i<arr.length;i++) {
			int sum = 0 ; // took sum to add the elements 
			for(int j = i; j<arr.length; j++) {
				sum = sum + arr[j];
				ans = Math.max(ans, sum); // maximum of both answer and sum and then store it in the answer only 
			}
		}
		return ans;
		
	}

}
//when we submit this code on leet code it gives time limit exceeded so for this there is a algorithm called kadens algorithm
