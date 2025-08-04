package lecture_8;

public class bubble_sort {

	public static void main(String[] args) {
		int arr[]= {4,5,3,2,1};
		sort(arr);
		for(int i = 0 ; i <arr.length; i++) {
			System.out.print(arr[i] +  "  ");
		}
		
	}

	public static void sort(int arr[]) {
		for(int turn = 1 ; turn<arr.length; turn++) {
			for(int i=0 ; i<arr.length-turn; i++) {  // 5-1 = 4 //5-2 = 3// 5-3 = 2//5-4=1
				if(arr[i] > arr[i+1]) { // agar 1 element is bigger than the i+1 element then swap shift the 1 element to right 
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
					
				}
				
				
			}
		}
	}

}
