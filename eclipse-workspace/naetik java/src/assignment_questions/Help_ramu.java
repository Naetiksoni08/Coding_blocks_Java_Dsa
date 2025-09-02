package assignment_questions;

import java.util.Scanner;

public class Help_ramu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0) {
		int c1 = sc.nextInt(); //1
		int c2 = sc.nextInt();//3
		int c3 = sc.nextInt();//7
		int c4 = sc.nextInt();//19
		int rickshawused = sc.nextInt(); // 2
		int cabused = sc.nextInt(); // //3
		int [] rickshawarray = new int[rickshawused];
		for (int i = 0; i < rickshawarray.length; i++) {
			rickshawarray[i] = sc.nextInt(); // 2,5
		}
		int [] cabarray = new int[cabused]; // 4,4,4
		for (int i = 0; i < cabarray.length; i++) {
			cabarray[i] = sc.nextInt();
		}
		int rickshawcost = 0;
		for (int i = 0; i < rickshawarray.length; i++) {
			rickshawcost +=Math.min(rickshawarray[i]*c1,c2);
		}
		rickshawcost = Math.min(rickshawcost, c3);		
		
		
		
		//same for cab cost
		int cabcost = 0;
		for (int i = 0; i < cabarray.length; i++) {
			cabcost +=Math.min(cabarray[i]*c1,c2);
		}
		cabcost = Math.min(cabcost, c3);		
		
		
		int finalcost = Math.min(rickshawcost+cabcost, c4);
		System.out.println(finalcost);
		t--;
		
	
		}
	}

}
