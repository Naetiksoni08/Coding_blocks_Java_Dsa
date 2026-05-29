package blind_45_days_sheet;

public class check_if_an_array_is_sorted_and_rotated {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 1, 2 };
		int first = arr[0];
		int last = arr[arr.length - 1];
		int drops = 0;
		// consecutive element check karo ek ke baad ek wale
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] > arr[i + 1]) {
				drops++;
			}

		}
		if (last > first) { // this is a seperate condition kyuki hum 1st and last element ko upar wlai condition sai check nai kar skate hai toh isliye alag sai handle karna padega also first aur last element mai bhi drop ho skata hai isssliye need to handle this edge case as welljase 2,1,3,5,4 so 4>2 so drop++;
			drops++; // also arr.length - 1 tak ja raha hai, matlab last element ka next check hi nahi hoga!
		}
		System.out.println(drops <= 1); // toh fir true else fals ekyuki 2 drops mai rotated sorted array is not possible 
	}

}
