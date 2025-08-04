package lecture5;

import java.util.Scanner;

public class typecasting_3 {

	public static void main(String[] args) {
		char ch ='a';
		System.out.println((int) (ch));
		ch++;//implicit Typecasting 
		System.out.println(ch);
		// but if i write like this ch++;
		//and syso((int) (ch));
		//this will give me 98;
		//ch = (char) (ch+1);
		ch = (char) (ch+1); // explicit typecasting 
		System.out.println(ch);
		Scanner sc= new Scanner(System.in); 
		ch=sc.next().charAt(0);
		System.out.println(ch);

	}

}

// ascii code of a is 97 whereas ascii code of A is 65