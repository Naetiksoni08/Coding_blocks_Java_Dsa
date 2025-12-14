package blind_45_days_sheet;

public class minimum_moves_to_balance_a_circular_array {
	public static void main(String[] args) {
		int[] arr = { 1, 2, -5, 2 };
		System.out.println(minimummoves(arr));

	}

	public static long minimummoves(int[] arr) {
		int sum = 0;
		int n = arr.length;
		for (long x : arr) {
			sum += x;
		}
		if (sum < 0) {
			return -1;
		}
		int negidx = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				negidx = i;
				break;
			}

		}
		if (negidx == -1) {
			return 0;
		}
		long need = -arr[negidx];
		long moves = 0;

		for (int dis = 1; dis < n && need > 0; dis++) {

			int left = (negidx - dis + n) % n;
			if (arr[left] > 0 && need > 0) {
				long take = Math.min(arr[left], need);
				moves += take * dis;
				need -= take;
			}

			int right = (negidx + dis) % n;
			if (arr[right] > 0 && need > 0 && right != left) {
				long take = Math.min(arr[right], need);
				moves += take * dis;
				need -= take;
			}

		}
		return moves;

	}
}

//	public static long minimummoves(int[] arr) {
//		int n = arr.length;
//		long sum = 0;
//		for (long x : arr) {
//			sum += x;
//		}
//		if (sum < 0) {
//			return -1;
//		}
//
//		int negidx = -1;
//		for (int i = 0; i < n; i++) {
//			if (arr[i] < 0) {
//				negidx = i;
//				break;
//			}
//
//		}
//		if (negidx == -1) {
//			return 0;
//		}
//
//		long need = -arr[negidx];
//
//		long leftmoves = 0;
//		long remaining = need;
//		int dist = 1;
//		int i = (negidx - 1 + n) % n;
//		while (remaining > 0 && i != negidx) {
//			if (arr[i] > 0) {
//				long take = Math.min(arr[i], remaining);
//				leftmoves += take * dist;
//				remaining -= take;
//			}
//			i = (i - 1 + n) % n;
//			dist++;
//		}
//
//		long rightmoves = 0;
//		remaining = need;
//		dist = 1;
//		i = (negidx + 1) % n;
//		while (remaining > 0 && i != negidx) {
//			if (arr[i] > 0) {
//				long take = Math.min(arr[i], remaining);
//				rightmoves += take * dist;
//				remaining -= take;
//			}
//			i = (i + 1) % n;
//			dist++;
//		}
//		return Math.min(leftmoves, rightmoves);
//
//	}
//}
