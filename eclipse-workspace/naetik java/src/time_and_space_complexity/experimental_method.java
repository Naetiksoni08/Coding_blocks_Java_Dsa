package time_and_space_complexity;

public class experimental_method {

	public static void main(String[] args) {
		// so there are 2 cases to find the time complexity of any code 
		// 1st is the experimental method
		// 2nd is the asymptotic method 
		
		// so first the experimental method
		long start = System.currentTimeMillis(); // calculates the milli second of a loop before it is not written
		for(int i = 0 ; i < 1000000; i++) {
			
		}
		 long end = System.currentTimeMillis(); // after the loop how much time the loop is taking to run 
		 System.out.println(end - start);
 // but this method is not write to calculate the time complexity because this method is dependent upon the hardware which is the computer so if a person has a super computer then the code will maybe give lesser time complexity  
	}

}
