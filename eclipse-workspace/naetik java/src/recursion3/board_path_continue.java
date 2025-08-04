package recursion3;

public class board_path_continue {

	public static void main(String[] args) {
		int n = 4;
		print(n,"", 0);

	}
	public static void print(int n , String ans , int curr) {
		if(curr == n) {
			System.out.println(ans);
			return;
		}
		if(curr>n) {
			return;
		}
		for(int dice = 1; dice<=3; dice++) {
			print(n, ans+dice, curr+dice);
		}
	}

	
}




//1st way to count the number of possible answers through recursion
//public static void main(String[] args) {
//	// TODO Auto-generated method stub
//	int n = 4;
//	String ans = "";
////	printans(n, "", 0);
//	System.out.println(countans(n,"",0));
//
//}
//
//public static void printans(int n, String ans, int curr) {
//	if (curr == n) {
//		System.out.println(ans);
//		return;
//	}
//	if (curr > n) {
//		return;
//	}
//	printans(n, ans+1, curr + 1);
//	printans(n, ans+2, curr + 2);
//	printans(n, ans+3, curr + 3);
//
//}
//public static int countans(int n, String ans, int curr) {
//	if (curr == n) {
//		System.out.println(ans);
//		return 1;
//	}
//	if (curr > n) {
//		return 0;
//	}
//	int a1 = countans(n, ans+1, curr + 1);
//	int a2= countans(n, ans+2, curr + 2);
//	int a3 =countans(n, ans+3, curr + 3);
//	return a1+a2+a3;
//
//}
//
//
//}






//next way to count the number of possible outcomes using static count is 

//public static void main(String[] args) {

//int n = 4;
//	String ans = "";
//	printans(n, "", 0);
//	System.out.println(count);
//	
//
//}
//static int count = 0;
//public static void printans(int n, String ans, int curr) {
//	if (curr == n) {
//		System.out.println(ans);
//		count++;
//		return;
//	}
//	if (curr > n) {
//		return;
//	}
//	printans(n, ans+1, curr + 1);
//	printans(n, ans+2, curr + 2);
//	printans(n, ans+3, curr + 3);
//
//}
//
//}

