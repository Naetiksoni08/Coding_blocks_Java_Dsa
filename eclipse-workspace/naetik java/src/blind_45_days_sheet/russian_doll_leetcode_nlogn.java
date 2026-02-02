package blind_45_days_sheet;
//question is same as nlogn longest increasing subsequence
import java.util.*;

public class russian_doll_leetcode_nlogn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] envelopes = { { 5, 4 }, { 6, 4 }, { 6, 7 }, { 2, 3 } };
		Arrays.sort(envelopes, new Comparator<>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[0] == o2[0]) {
					return o2[1] - o1[1];
				}
				return o1[0] - o2[0];
			}
		});

		System.out.println(russian(envelopes));
	}

	public static int russian(int[][] arr) {
		if (arr.length == 0) {
			return 0;
		}

		int[] lis = new int[arr.length];
		int len = 0;
		for (int[] a : arr) {
			int h = a[1];
			int idx = BinarySearch(lis, 0, len - 1, h);
			lis[idx] = h;
			if (idx == len) { // 3==3 yes so increase length below explaination
				len++;
			}
		}
		return len;

	}

	public static int BinarySearch(int[] lis, int si, int ei, int item) {
		int idx = ei + 1; // “If no valid position is found, insert at the end.” 3,5,7 target = 10 then
							// nothing is 3>=10 no 5>=10 and so on so ei+1 = 2+1 = 3rd idx par 10 rakhdo
		while (si <= ei) {
			int mid = (si + ei) / 2;
			if (lis[mid] >= item) {
				idx = mid;
				ei = mid - 1;
			} else {
				si = mid + 1;
			}

		}
		return idx;
	}
}

//bro ayah par hum binary search mai yehi toh check kr rahe hai ki like jaise array hai 3,4,7 theke so hum aaye height ab 4 aai toh hum check karte hai ki already mainted lis mai 4 sai just bada element kya hai usse dundo aur bas uspar binary searhc lagake usse find karo aur replace kardo element ko that is lis[idx]=h

//why idx==len
//lis = [3, 5, 7]
//len = 3
//h = 10
//Binary search:
//idx = 3   // ei + 1
//Replace:
//lis = [3, 5, 7, 10]
// Kya LIS extend hui?
// YES
//Isliye:
//
//len++

// when will idx==len wont work 
//lis = [3, 5, 7]
//len = 3
//h = 4 sai just bigger element is 5 so binary search lagaya toh idx mila 1 so bas replace karo 
//Binary search:
//idx = 1
//Replace:
//lis = [3, 4, 7]