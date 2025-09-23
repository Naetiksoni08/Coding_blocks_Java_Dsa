package assignment_questions;

import java.util.*;

public class Frequent_Elements_in_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int[] result = frequentelements(arr, k);
		Arrays.sort(result); // sort the k elements
		for (int num : result) {
			System.out.print(num + " ");
		}
	}

	public static int[] frequentelements(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				int old_value = map.get(arr[i]);
				map.put(arr[i], old_value + 1);
			} else {
				map.put(arr[i], 1);
			}//frequency nikal li sari

		}
		List<Integer> list = new ArrayList<>(map.keySet()); // map.keyset ko list mai concert kardia taki sort kar sakein
		list.sort((a, b) -> map.get(b) - map.get(a)); // descending order mai data chahiye
		//sort the frequency in descending order 3 2 1 milega usse descending order mai sort kardo bas

		int[] topk = new int[k]; // now make a k size ka arr
 		for (int i = 0; i < k; i++) { // loop lagay 2 element honge bas according to the input it can vary as per k
			topk[i] = list.get(i); // list mai sai get karke topk mai daldo bas

		}

		return topk;

	}

}




//
//import java.util.*;
//
//public class TopKFrequent {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int k = sc.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//
//        int[] result = topKFrequent(arr, k);
//        Arrays.sort(result); // sort output in ascending order
//        for (int num : result) {
//            System.out.print(num + " ");
//        }
//    }
//
//    public static int[] topKFrequent(int[] arr, int k) {
//        Map<Integer, Integer> freqMap = new HashMap<>();
//        for (int num : arr) {
//            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
//        }
//
//        // Min-heap by frequency
//        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> freqMap.get(a) - freqMap.get(b));
//
//        for (int num : freqMap.keySet()) {
//            pq.add(num);
//            if (pq.size() > k) {
//                pq.poll(); // remove the element with smallest frequency
//            }
//        }
//
//        // Extract top k elements from heap
//        int[] topk = new int[k];
//        int index = 0;
//        while (!pq.isEmpty()) {
//            topk[index++] = pq.poll();
//        }
//
//        return topk;
//    }
//}

