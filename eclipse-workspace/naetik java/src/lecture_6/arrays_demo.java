package lecture_6;

public class arrays_demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a;
//		int [] arr = null ;
//	System.out.println(arr);
		int a ;
		int [] arr = new int[5];
		System.out.println(arr);
		int [] other = arr;
		arr[0] = 10;
		arr[1] = 5;
		arr[2] = 8;
		arr[3] = 1;
		arr[4] = 9;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		System.out.println(other.length); // size of array or length of array
	}   

}
