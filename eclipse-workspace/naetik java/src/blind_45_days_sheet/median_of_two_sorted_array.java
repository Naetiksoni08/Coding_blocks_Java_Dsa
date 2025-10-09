package blind_45_days_sheet;

public class median_of_two_sorted_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 3, 4, 7, 10, 12 };
		int[] arr2 = { 2, 3, 6, 15 };
		System.out.println(median(arr1, arr2));

	}
	public static double median(int[]arr1,int[]arr2) {
		int a1 = arr1.length;
		int a2 = arr2.length;
		if(a1>a2) { // in our case in this input the swap will happen cuz 6>4 after swap a1 will be 4 and a2 will be 6
			return median(arr2,arr1); // swap so we binary-search the smaller array
		}
		int low = 0; // 0
		int high = a1; // 4 cuz s1 is 4
		int left = (a1+a2+1)/2; //number of elements that should be on left side
		int a  = a1+a2; // total elements (used to check odd/even) total 10 
		while(low<=high) {
			int mid1 = (high+low) >> 1; // or /2 
		int mid2 = left-mid1; //   we did this becuase if 1 is the mid from 1st array so we need to pick 1 element from the first array and the total no of element we want is 5 then 4 elements we have to pick from the second array
 		int l1 = Integer.MIN_VALUE; // 4 lines if l1 or l2 or r1 or r2 is missing or not present
		int l2 = Integer.MIN_VALUE;
		int r1 = Integer.MAX_VALUE;
		int r2 = Integer.MAX_VALUE;
		if(mid1<a1) r1 = arr1[mid1]; // if mid1<a1 mtlb agar mid1 jo hai agar chota hua a1 yani total no of elements from arr 1 then r1 will be mid1 
		if(mid2<a2) r2 = arr2[mid2]; // if mid2<a2 so mtlb agar mid2 jo hai agar chota hua a2 yani total no of elements from arr 2 then r2 will be mid2 
		if(mid1-1>=0) l1 = arr1[mid1-1]; // if mid1-1 bada ya equal hai 0 ke then l1 joh hoga voh mid1-1 hoga
		if(mid2-1>=0) l2 = arr2[mid2-1];  // if mid2-1 bada ya equal hai 0 ke then l2 joh hoga voh mid2-1 hoga
		if(l1<=r2 && l2<=r1)  { // if that so then this is a valid symmetry go ahead correct partition
			if(a%2==1) return Math.max(l1, l2); // for odd
			return (double) (Math.max(l1, l2)+ Math.min(r1, r2))/2.0; // for even
		}
		else if(l1>r2) high = mid1-1; // but if l1 is greater than r2 then we need to change the high that means we need to reduce the no of elements we have picked
		else low = mid1+1;  // we need to increase the no of elements we have to pick 
		
			
		}
		return 0.0;
		
	}

}

















//code swaps arrays because a1 > a2 initially (6 > 4), so the real variables inside the algorithm become:

//arr1 (the smaller one we will binary-search) = {2, 3, 6, 15} (length a1 = 4)

//arr2 = {1, 3, 4, 7, 10, 12} (length a2 = 6)

//total a = 10

//left = (a1 + a2 + 1)/2 = (4 + 6 + 1)/2 = 11/2 = 5

//Initialize:

//low = 0, high = a1 = 4

//We will iterate while low <= high.

//Iter	low	 high	mid1 = (low+high)/2	  mid2 = left-mid1	l1 (arr1[mid1-1] or MIN)	l2 (arr2[mid2-1] or MIN)	r1 (arr1[mid1] or MAX)	r2 (arr2[mid2] or MAX)	Check (l1<=r2 && l2<=r1)
//1	     0	  4	     mid1 = (0+4)/2 = 2	  mid2 = 5 - 2 = 3	l1 = arr1[1] = 3	        l2 = arr2[2] = 4	        r1 = arr1[2] = 6	    r2 = arr2[3] = 7	    3 <= 7 && 4 <= 6 → true	Partition found → compute median

//So we find a correct partition on the first iteration.

//Now compute the median:

//total a = 10 is even, so median = (max(l1,l2) + min(r1,r2)) / 2
//max(l1,l2) = max(3,4) = 4
//min(r1,r2) = min(6,7) = 6
//median = (4 + 6) / 2.0 = 5.0
//So your function returns 5.0.
