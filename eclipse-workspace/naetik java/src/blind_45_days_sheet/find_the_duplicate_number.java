package blind_45_days_sheet;

public class find_the_duplicate_number {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 4, 2, 2 };
		int slow = arr[0];
		int fast = arr[0];

		// find break point at which slow and fast meet
		do {
			slow = arr[slow];
			fast = arr[arr[fast]];
		} while (slow != fast); // jaise hi slow aur fast equal hue hai toh ruk jayega

		// once break point mil gaya ab element dhundte hai konsa duplicate hai
		int slow2 = arr[0]; // and slow is on arr of 4 ie 2 theke
		while (slow != slow2) { // jaise hi slow and slow2 equal hue toh stop
			slow2 = arr[slow2];
			slow = arr[slow];
		}
		System.out.println(slow); // ya fir slow 2 dono same no par honge
	}

}
