package blind_45_days_sheet;

public class limit_occurences_in_sorted_array {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 1, 2, 2, 3 };
		int k = 2;
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (j < k) {
				arr[j] = arr[i];
				j++;
			} else if (arr[i] == arr[j - k]) { // arr[2] = 1 and arr[j-k] = 2-2 = 0 so arr[2]=1 and arr[0] = 1 so 1==1
												// but j-k mtlb 0 sai j-1 mltb 2-1 = 1 tk 1 fill hogaya hai so arr[0] =
												// 1 and arr[1] = 1 so k =-2 meet hogaya hai so simply continue karo i =
												// 3 ho jayega and j = 2 hi rahega
				continue;
			} else {
				arr[j] = arr[i];
				j++;
			}
		}
		for (int i = 0; i < j; i++) {
			System.out.print(arr[i] + " ");
		}
		//Arrays.copyOfRange(nums, 0, j) 0 sai 5 so 0 sai 4 print hoga so 1 1 2 2 3
	}

}
// i=0,j = 0, condition j < k → 0 < 2 → TRUE
//nums[j] = nums[i]
//nums[0] = nums[0] = 1   (same position pe likha)
//
//array = [1, 1, 1, 2, 2, 3]
//         ↑
//         j=0 ne likha
//j++ → j = 1

//i=1, j = 1, condition j < k → 1 < 2 → TRUE
//nums[j] = nums[i]
//nums[1] = nums[1] = 1   (same position pe likha)
//
//array = [1, 1, 1, 2, 2, 3]
//            ↑
//            j=1 ne likha
//j++ → j = 2

//i = 2
//j = 2, condition j < k → 2 < 2 → FALSE
//ab check karo nums[i] == nums[j-k]
//nums[2] == nums[2-2]
//nums[2] == nums[0]
//  1     ==    1      → TRUE → SKIP! ❌
//
//array = [1, 1, 1, 2, 2, 3]
//                ↑
//            i=2 skip hua, kuch nahi likha
//            j abhi bhi = 2



//i = 3
//j = 2, condition j < k → 2 < 2 → FALSE
//ab check karo nums[i] == nums[j-k]
//nums[3] == nums[2-2]
//nums[3] == nums[0]
//  2     ==    1      → FALSE → WRITE! ✅
//
//nums[j] = nums[i]
//nums[2] = nums[3] = 2
//
//array = [1, 1, 2, 2, 2, 3]
//                ↑
//            j=2 ne 2 likha! (pehle 1 tha yahan)
//j++ → j = 3