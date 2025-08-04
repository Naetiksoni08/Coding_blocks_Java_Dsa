package lecture_6;

public class linear_search {

	public static void main(String[] args) {
		int arr []= {3, 5 ,1 ,7 , 8 };
		int item = 7;
		System.out.println(search(arr,item)); // calling and printing the statement together

	}
	public static int search( int[] arr , int item) {
		int i;
		for(i = 0 ; i<arr.length; i++) {
			if(arr[i]==item) {
				return i;   // we are using int in function that is why we can write return i;
			}
			
			}
		return - 1;
		}
		
	}
// loop ke bhar -1 lagega and else statement nai print hogi because index  0  par 
//  0 =! item so it will directly go to the else statement and print -1 which is wrong




// find the item 7 in the array and return the index value that is 3 and
// if u do not find then return -1;