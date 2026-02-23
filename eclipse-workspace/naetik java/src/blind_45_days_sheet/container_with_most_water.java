package blind_45_days_sheet;

public class container_with_most_water {

	public static void main(String[] args) {
		int[] heights = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(container(heights));
	}

	public static int container(int[] arr) {
		int maxArea = 0;
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int area = (right - left) * Math.min(arr[left], arr[right]);// left aur right ke beech ka distance into why
																		// min because Paani 3 se upar gir jaayega bahar
																		// — choti deewar bottleneck hai! Isliye min
																		// liya! ex left 8 hai and right 3 toh pani sirf
																		// 3 tk aah sakta hai isliye min lia
			maxArea = Math.max(maxArea, area);

			if (arr[left] < arr[right]) { // Choti deewar bottleneck ya limit hai //Use move karo — chance hai aage badi
											// mile
				left++;
			} else {
				right--;
			}

		}
		return maxArea;
	}

}
