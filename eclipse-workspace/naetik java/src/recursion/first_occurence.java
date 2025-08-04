package recursion;

public class first_occurence {

	public static void main(String[] args) {
		int [] arr = {2,4,3,5,6,3,7,3,56,3,11};
		int item = 3;
		System.out.println(print(arr,item,0));

	}
	
	public static int print(int [] arr, int item, int i ) {
		if(i==arr.length) { //  i ko itna increase kardia ki arr.length se bhar nikal gaya 
			return -1;
		}
		if(item == arr[i]) {
			return i;
		}
		return print(arr,item,i+1); // if ith index do not have the item then we will search from i+1 and go till arr.lenght-1;
		//big o n time complexity 
			
		}
	}

