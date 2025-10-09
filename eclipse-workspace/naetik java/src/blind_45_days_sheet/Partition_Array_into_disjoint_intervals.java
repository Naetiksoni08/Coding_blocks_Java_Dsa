package blind_45_days_sheet;

public class Partition_Array_into_disjoint_intervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5,0,3,8,6};
		System.out.println(Partition_Array(arr));

	}
	public static int  Partition_Array(int[]arr) {
		int leftmax = arr[0]; // keeps the track of the maximum so far mtlb abhi iteration tk konsa maximum element hai uska track rakhta hai 
		int currentmax = arr[0]; // keeps the track of overrall maximum in the array
		int count = 0 ; // for counting the size of the left subarray
		for (int i = 1; i < arr.length; i++) {
			currentmax = Math.max(currentmax, arr[i]); 
			// updating the currentmax before is a bit safer otherwise both works fine
			
			if(arr[i]<leftmax) { // if the arr[i] is smaller than the leftmax then 
				count = i; // include that i in the count
				leftmax = currentmax; // and update the left max 
			}
		}
		return count+1; // cuz index starts from 0 so index+1;
	}

}
