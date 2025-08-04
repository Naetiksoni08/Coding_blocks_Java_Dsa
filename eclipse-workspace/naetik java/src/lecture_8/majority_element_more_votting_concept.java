package lecture_8;



public class majority_element_more_votting_concept {

	public static void main(String[] args) {
	
		int arr[]= {2,2,1,1,1,2,2};
		System.out.println(moore_voting(arr));
		

		}

	public static int moore_voting(int arr[] ) {
		int c = arr[0];
		int vote = 1;
		for(int i  = 1 ; i<arr.length; i++) {
			if(arr[i] == c) {
				vote++;
			}
			else {
				vote--;
				
			}
			if(vote == 0) {
				c = arr[i];
				vote=1;
				
			}
			
		}
		return c;
	}

}
