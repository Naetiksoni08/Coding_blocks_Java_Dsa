package assignment_questions;

import java.util.*;
public class pattern_with_zeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter the number of rows:- ");
		        int number = sc.nextInt();
		        int rowNumber = 1;
		        while (rowNumber <= number) {
		            int column = 1;
		            while (column <= rowNumber) {
		                if (column == 1 || column == rowNumber) {
		                    System.out.print(rowNumber + "\t");
		                } else {
		                    System.out.print(0 + "\t");
		                }
		                column++;
		            }
		            rowNumber++;
		            System.out.println();
		        }
		

	}

}
