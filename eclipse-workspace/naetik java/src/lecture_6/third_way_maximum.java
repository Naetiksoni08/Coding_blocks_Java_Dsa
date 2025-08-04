package lecture_6;

public class third_way_maximum {

	public static void main(String[] args) {
		int arr []= {3, 5 ,1 ,7 , 8 ,6};
		System.out.println(max(arr));

	}
	public static int max(int [] arr ) {
		int m = Integer.MIN_VALUE; // -2^31= 214748e49 // SMALLEST VALUE OF THE WORLD
		for(int i = 1 ; i < arr.length; i++) {
			m = Math.max(m,arr[i]);	
	   }
		return m ;

     }
}

// what will this function will do is
//array {3, 5 ,1 ,7 , 8 ,6};
//for the very first time i = 0 m = -2^31 , 3 what this function will do is is the maximum value from both of them it will store in the m  