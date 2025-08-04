package assignment_questions;

import java.util.Scanner;

public class string_max_freq_character {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 String s = sc.nextLine();  // input a string
		 char result = freq(s);
	        System.out.println(result);
		 
	}
	public static char freq(String str) {
		char ans = 'a'; // this will sore final answer right now we initialize this as a cuz it is the first element 
	      int maxfreq = 0; //  this looks for the highest freq encountered so far it is a  //  it is like count 
          int n = str.length(); //  goes till the length of the string 
	      int count[] = new int[256];//An array of size 256 is used to store the frequency of characters. 
	      //We use 256 because there are 256 possible ASCII characters.
	      for (int i = 0; i < n; i++) { // loop 
	         count[str.charAt(i)]++; // str.charAt(i): This gets the character at index i of the string.
	         // and increasing the count
	         if (count[str.charAt(i)] > maxfreq) { // if its frequency is greater than the current maxfreq.
	        	 
	            maxfreq = count[str.charAt(i)]; // we update the max freq 
	            ans = str.charAt(i); // and set the answer 
	         }
	      }
	      return ans;
 	}
}