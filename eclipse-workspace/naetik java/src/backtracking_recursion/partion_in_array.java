package backtracking_recursion;

public class partion_in_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5,7,2,1,8,3,4};
		System.out.println(partition(arr,0,arr.length-1));
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}

	}
	public static int partition(int [] arr , int si , int ei) {
		int val = arr[ei] , idx = si;
		for(int i = si; i<ei; i++) {
			if(arr[i]<val) {
				int temp = arr[i];
				arr[i] = arr[idx];
				arr[idx] =  temp;
				idx++;
			}
		}
		int temp = arr[ei];
		arr[ei]  = arr[idx];
		arr[idx] = temp;
		return idx; // position of 4 index number 
	}
	

}
// generic wala 
// agar userne koi bhi value di h aur voh value last index nai h then uss number ko last mai bhej denge aur fir same code kardenge 
