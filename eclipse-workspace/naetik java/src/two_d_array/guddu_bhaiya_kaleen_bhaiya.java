package two_d_array;

import java.util.Scanner;

public class guddu_bhaiya_kaleen_bhaiya {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		String name  =  sc.nextLine();
		StringBuilder sb = new StringBuilder(name);
		
		int n = sc.nextInt();
		for(int i = 0 ; i< n ; i ++ ) {
			int j = sc.nextInt()-1;
			int k = sc.nextInt()-1;
			int rotations = sc.nextInt();
			String substring = sb.substring(j,k+1);
			rotations = rotations % substring.length();
			String rotatedsubstring = substring.substring(substring.length()-rotations) + substring.substring(0,substring.length()-rotations);
			sb.replace(j, k+1, rotatedsubstring);
			
		}
		System.out.println(sb.toString());

	}

}
