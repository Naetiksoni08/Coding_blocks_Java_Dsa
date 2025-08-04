package lecture5;

import java.util.Scanner;

public class declare_variable_globally {
    static int val = 100; // global value 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); // capital s
		int n = sc.nextInt(); 
		System.out.println(val);
			System.out.println("hey");
			int a  = 8;
			int b = 7;
			add(b,a);
			System.out.println("bye");
		}
		public static void add(int a, int b) {
			int c = a+b;
			val = val-5;
			

}
}
//if both local and global variable are given then 
//global will win changes are done in  local but global will win


//but if we write declare_variable_globally.val = declare_variable_globally.val-5;
