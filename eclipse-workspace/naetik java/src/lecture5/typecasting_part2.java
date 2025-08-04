package lecture5;

import java.util.Scanner;

public class typecasting_part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      float f = (float) 8.9; // f = 8.9f; float is 32 bit and double is 64 bit
      double d = 8.9;
      Scanner sc= new Scanner(System.in); 
      f = sc.nextFloat();
      d = sc.nextDouble();
	}

}
//agar (float) = 8.9 we write like thus then this means we are changing the number or the data but
// we are writing like this 8.9f then this means that we are changing literal type not the number 