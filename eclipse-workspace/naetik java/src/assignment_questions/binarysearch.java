package assignment_questions;

public class binarysearch {
	public static void main(String[] args) {
		int [] arr = {4,6,6,7,0,1,2,3};
		int item = 0;
		System.out.println(search1(arr,item));
		
	}
	public static int search1(int []arr,int item) {
		int lo  = 0;
		int hi = arr.length-1;
		while(lo<=hi) {
			int mid= (lo+hi)/2;
			if(arr[mid] == item) {
				return mid;
			}
			else if(arr[mid]>=arr[lo]) { //upper line
				if(item>=arr[lo] && arr[mid]>item) {
					hi = mid-1;
				}else {
					lo = mid+1;
				}
				
			}
			else { // lower line par
				if(arr[mid]<=arr[hi] && arr[mid]<item) {
					lo = mid+1;
				}else {
					hi = mid-1;
				}
				
			}
		}
		return -1;
	}
}
