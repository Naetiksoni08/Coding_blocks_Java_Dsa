package blind_45_days_sheet;

public class count_subarrays_with_cost_less_than_or_equal_to_k {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2 };
		long k = 4;
		System.out.println(subarrays(arr, k));
	}

	public static int subarrays(int[] arr, long k) {
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i; j < arr.length; j++) {
				long cost = 0;
				long max = Integer.MIN_VALUE;
				long min = Integer.MAX_VALUE;
				for (int k1 = i; k1 <= j; k1++) {
					max = Math.max(max, arr[k1]);
					min = Math.min(min, arr[k1]);
				}
				cost = (max - min) * (j - i + 1);
				if (cost <= k) {
					count++;
				}

			}
		}
		return count;
	}

}


//class Solution {
//    public long countSubarrays(int[] nums, long k) {
//        int n = nums.length;
//        long count = 0;
//        Deque<Integer> maxQ = new ArrayDeque<>();
//        Deque<Integer> minQ = new ArrayDeque<>();
//        int l = 0;
//        
//        for (int r = 0; r < n; r++) {
//            // max deque
//            while (!maxQ.isEmpty() && nums[maxQ.peekLast()] <= nums[r])
//                maxQ.pollLast();
//            maxQ.offerLast(r);
//            
//            // min deque
//            while (!minQ.isEmpty() && nums[minQ.peekLast()] >= nums[r])
//                minQ.pollLast();
//            minQ.offerLast(r);
//            
//            // shrink window if cost > k
//            while (!maxQ.isEmpty() && !minQ.isEmpty() &&
//                   (long)(nums[maxQ.peekFirst()] - nums[minQ.peekFirst()]) * (r - l + 1) > k) {
//                l++;
//                if (maxQ.peekFirst() < l) maxQ.pollFirst();
//                if (minQ.peekFirst() < l) minQ.pollFirst();
//            }
//            
//            count += (r - l + 1);
//        }
//        return count;
//    }
//} // optimized one but i have not done it .. its a sliding window approach
