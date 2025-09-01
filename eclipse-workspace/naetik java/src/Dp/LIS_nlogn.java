package Dp;

public class LIS_nlogn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15 };
		System.out.println(lis(arr));

	}

	public static int lis(int[] arr) {
		// concept is simple
//		joh ending element hai agar mera data uss ending element sai bada hai toh simply hum bolenge ki joh mera data hai usko list ke ya array ke end mai add ya push kardo aur array ka size 1 sai bada do
//		agar mera element joh hai voh chota hai ending element sai toh mai bolunga ki bhai array pr binary search laga aur yeh check kar ki mera joh element hai usse just bada konsa element hai uski jagahr pr mera element daal de
		int[] dp = new int[arr.length];
		dp[0] = arr[0]; // har element apna toh lis banega hi aur len = 1 karde
		int len = 1;
		for (int i = 1; i < arr.length; i++) { // loop lagega 1 sai
			if (arr[i] >= dp[len - 1]) { // mera array ka joh data hai agar voh bada hai len-1 wale data sai ek kam hoga
											// kyuki len ek aage chal rahi hogi jaise dp of zero pr maine 0 rakhdia len
											// = 1
											// kardia toh ab mai 1 sai loop lagunga aur 0 index pr joh element tha ussi
											// sai
											// toh check karunga na toh kya 8>0 yes
				dp[len] = arr[i]; // agar hai toh 8 joh mera element tha usko dp ke andar add karde aur len ++
									// karde
				len++;
			} else {
				int idx = BinarySearch(dp, 0, len - 1, arr[i]);
				dp[idx] = arr[i];

			}

		}
		return len;
	}

	private static int BinarySearch(int[] dp, int low, int hi, int item) {
		int idx = 0;
		while (low <= hi) { // yeh loop u re familiar
			int mid = (low + hi) / 2; // //mid nikal te hai
			if (dp[mid] >= item) { // humne kaha ki yrr joh dp mai humare mid aaya kya voh bada hai ya fir equal to
									// hai uss element ke just aage wale elemnt sai mtlb ki say 9 tha so mujhe nikal
									// ne yeh tha ki yrr 9 sai just bada konsa element hai so i said kya 9 >= apne
									// aage wale element sai if yes then voh element ko hum replace karenge but aisa
									// bhi toh ho skata hai na ki voh element sai bhi chota element exist karta ho
									// jisse hume replace karna hai so for that hum hi ko mid-1 karnege
				idx = mid;
				hi = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return idx;
	}

}//n log n ka most optimized solution h yeh
