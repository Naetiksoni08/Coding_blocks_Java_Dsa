package blind_45_days_sheet;

public class Find_the_Highest_Altitude {

	public static void main(String[] args) {
		int[] arr = { -5, 1, 5, 0, -7 };
		int maxaltitude = 0;
		int currentaltitude = 0;
		for (int i = 0; i < arr.length; i++) {
			currentaltitude += arr[i]; // -5 , -4 , 1, 1 , -6
			maxaltitude = Math.max(currentaltitude, maxaltitude); // 0 , 0 , 1 , 1 , 1 ans
		}
		System.out.println(maxaltitude);
	}

}




//gain = [-5, 1, 5, 0, -7]

//Step	gain[i]	currentAltitude	maxAltitude
//start	-	0	0
//i=0	-5	-5	0
//i=1	1	-4	0
//i=2	5	1	1
//i=3	0	1	1
//i=4	-7	-6	1