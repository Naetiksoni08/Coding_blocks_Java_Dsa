package blind_45_days_sheet;

public class next_permutation {

	public static void main(String[] args) {
		int[] nums = { 1, 5, 3, 2 }; // 4 len
		int i = nums.length - 2; // 4-2 is 2 so 3 sai check karo 3<2 no 5 < 3 no 1 < 5 yes
		while (i >= 0 && nums[i] >= nums[i + 1]) { // Yeh loop khatam hone ke baad, i ya toh woh index hoga jaha nums[i]
													// < nums[i+1] mila,
			i--;
		}
//		System.out.println(i); 0 is the break point element
		if (i >= 0) {
			int j = nums.length - 1; // sabse right wale index se start
			while (nums[j] <= nums[i]) {
				j--;
			}
//			System.out.println(nums[j]); 2

			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
		}

		int left = i + 1; // 1 sai end tk ko reverse karo mtlb i= 0+1 = 1 se end tk ko reverse
		int right = nums.length - 1;
		while (left <= right) {
			int temp = nums[left];
			nums[left] = nums[right];
			nums[right] = temp;

			left++;
			right--;
		}
		for (int j = 0; j < nums.length; j++) {
			System.out.print(nums[j] + " ");
		}

	}

}

// 3 step hai dekh ek example sai samjh le 
// 1,5,3,2 yeh array hai theke ab hum inplace mtlb bina new array banaye hume next permuation chahiye theke 
// next permuation ka mtlb ki dekh ek array ke mutiple permuation ho sakte hai theke jaise 1 2 3 ka 1 3 2  3 2 1 etc but joh immediate next hai joki lets say 1 2 3  -> 3 2 1 hai voh answer hoga 
// ab dekh 3 steps 
// 1. break point dhundo
// 1 5 3 2 mai hum search karenge ki current element joh hai voh kya uske aage wale element sai chota hai mtlb num[i]<num[i+1] yeh find karo yeh conditon milegi 1<5 yes so break point hua 1 
// 2. if break point exist then right sai left scan karo aur find karo ki 1 sai just bada konsa element hai 
// 1 is break point 5 3 2 mai 2 is just bada from 1 but isko oth hum dekh ke bata rahe hai code mai hum bolte hai ki num[i] = 1 right hum 5 3 2 left sai right dekhte hai toh voh descending hua agar hum rigtt sai left dekhe toh ascending ka first element hi hoga 1 sai just bada so same 
// jab tk num[j]<num[i] mtlb ki jab tk i sai just bada 1 sai just bada nai mil jaata tab tk dhund te raho as soon as 2 mila swap kardo 1 aur 2 ko so array becomes 2 5 3 1 
// 3. ab 2 alag 5 3 1 hai ab dekh hume sabse chota chahiye mtlb just bada permutation so hum 5 3 1 array ko reverse kardenge kyuki again left sia right descending left sai right is ascending so left wale agar aage aah jayegnge toh fir automatically just bada milega so bana 
// 1 5 3 2 -> 2 1 3 5