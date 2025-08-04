package lecture_6;

public class maximum_value_in_array {

	public static void main(String[] args) {
		int arr []= {3, 5 ,1 ,7 , 8 ,6};
		System.out.println(max(arr));
		

	}
	public static int max(int [] arr ) {
		int m = arr[0]; // take array[0] as maximum that is 3
		for(int i = 1 ; i < arr.length; i++) {
			if(arr[i]>m) {   // now we will check if the array[1] is greater than array[0]
				m = arr[i]; // if yes then store the maximum value of i in m.... and return m;
				
			}
		}
		return m;
		
	} // i = 1; 5>3 so m = 5; then i=2; 1>5 no then i++ i =3; 7>5 yes m = 7;
	// i++ 8>7 yes so m = 8; i++ i = 4; 6>8 no so return 8 the maximum number

}
