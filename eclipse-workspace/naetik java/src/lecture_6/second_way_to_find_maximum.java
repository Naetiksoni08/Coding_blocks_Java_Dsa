package lecture_6;

public class second_way_to_find_maximum {

	public static void main(String[] args) { 
		int arr []= {3, 5 ,1 ,7 , 8 ,6};
		System.out.println(max(arr));

	}
	public static int max(int [] arr ) {
		int m = Integer.MIN_VALUE; // -2^31= 214748e49 // SMALLEST VALUE OF THE WORLD
		for(int i = 1 ; i < arr.length; i++) {
			if(arr[i]>m) {   
				m = arr[i]; 
				
	   }
			
	}
		return m ;

	}
}
// here everything will be same but just for the very first time when the loop
// start we will check if 3>-2^31 yes so m  = 3 and then i++ 5>3 yes m = 5