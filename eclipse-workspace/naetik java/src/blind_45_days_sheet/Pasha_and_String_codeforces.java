package blind_45_days_sheet;

import java.util.Scanner;

public class Pasha_and_String_codeforces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length(); // length of string
		
		int days = sc.nextInt(); // m
		
		char []arr = s.toCharArray(); // converts our 1 based index array to 0 based index array 
		
		int [] flip = new int[n+2]; // for safety and convenience we took n+2
		
		for (int i = 0; i < days; i++) {
			int a = sc.nextInt(); // starting index position at each day
			flip[a]++; // always start flip from position a  similar to flip[a] = flip[a]+1; increments a 
		}
		//calculated prefix sum
		for (int i = 1; i <=n; i++) {
			flip[i]+=flip[i-1];
		}
		
		// apply swaps on first half if flip count is odd
		for (int i = 1; i <= n/2; i++) { // 6/2 = 3 so 1 sai 3 
			if(flip[i]%2==1) { // odd flip
				char temp = arr[i-1]; 
				arr[i-1] = arr[n-i]; 
				arr[n-i] = temp; 
			}
			
		}
		System.out.println(new String(arr)); // converted char array into string object and printed it 
		

	}

}
