package blind_45_days_sheet;

public class maximum_total_subarray_value_1 {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2 };
		int k = 2;
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		for (int a : arr) {
			max = Math.max(a, max);
			min = Math.min(a, min);

		}
		long best = (long) max - min;
		System.out.println(best * k);

	}

}

//When you will read the description of this problem now, you will understand that you will feel like this problem is so complex and so difficult but the solution is very simple. I will tell you and I'll guide you with the whole process of thinking and whole intuition building here in the comments 
//So when we just read the description of the problem that says that we have to choose k subarrays, the key point is that the same subarrays can be taken repeatedly, and we just need to maximize the total value 
// So here the light bulb is that we can choose the same subarray again and again repeatedly.So what I'll simply do is that I'll choose the best subarray in the whole array and I'll take that array k times, right 
//What does best subarray mean? It simply means, in the whole array, we will globally choose the maximum and the minimum element and subtract them. We will add the value after subtraction inside a sum variable K times 
//best value = global_max - global_min
//k baar lo  = best * k
