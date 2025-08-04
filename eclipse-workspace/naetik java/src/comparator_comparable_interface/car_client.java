package comparator_comparable_interface;

import java.util.Arrays;
import java.util.Comparator;

public class car_client {

	public static void main(String[] args) {
		cars[] arr = new cars[5]; // 5 spaces o cars are placed
		arr[0] = new cars(200, 10, "White");// P S C
		arr[1] = new cars(1000, 20, "Black");
		arr[2] = new cars(345, 3, "Yellow");
		arr[3] = new cars(34, 89, "Grey");
		arr[4] = new cars(8907, 6, "Red");
		Arrays.sort(arr,new Comparator<cars>() {
			@Override
			public int  compare(cars o1,cars o2) {
				return o1.speed - o2.speed;
				
			}

	});
//		sort(arr);
	Display(arr);

	}

	public static <T extends Comparable<T>> void sort(T[] arr) {
		for (int turn = 1; turn < arr.length; turn++) {
			for (int i = 0; i < arr.length - turn; i++) { // 5-1 = 4 //5-2 = 3// 5-3 = 2//5-4=1
				if (arr[i].compareTo(arr[i + 1]) > 0) { // agar 1 element is bigger than the i+1 element then swap shift
														// the 1 element to right
					T temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;

				}
				// address compare nai ho sakta hai that is why this line is showing error
				// aisa waisa koi bhi t nai ayega vohi ayega jo implement kar rakha hoga this is
				// called setting bound

			}
		}
	}

	private static <T> void Display(cars[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + "  ");
		}
		System.out.println();
	}

}
