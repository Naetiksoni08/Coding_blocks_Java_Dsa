package lecture_6;

import java.util.Scanner;

public class lcm{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		int n1= sc.nextInt(); 
		int n2= sc.nextInt(); 
		System.out.println(LCM(n1 ,n2));

	}
	public static int LCM(int n1 ,int n2) {
		int max = Math.max(n1, n2);
		int LCM = max;
		
		while(LCM % n1 != 0 || LCM % n2 != 0) {
			LCM = LCM+max;
		}
		return LCM;
	}

}
