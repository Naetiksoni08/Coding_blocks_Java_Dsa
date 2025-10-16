package blind_45_days_sheet;

public class last_occurrence_recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 2, 4, 3, 5, 6, 3 };
		int item = 3;
		System.out.println(last_occ(arr, item, 0));

	}

	public static int last_occ(int[] arr, int item, int idx) { 
		// the only diff in first and last occ will be that we will in last occ first check in rest idx if now found then we will check in the current idx
		// and in the first occ we will first check in the current idx and if not found then we will check in the rest idx
		if (idx == arr.length) {
			return -1; 
		}

		int restidx = last_occ(arr, item, idx + 1);

		if (restidx != -1) {
			return restidx;
		}

		if (item == arr[idx]) {
			return idx;
		}
		return -1;

	}

}
