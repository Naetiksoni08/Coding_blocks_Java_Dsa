package strings;

public class reverse_a_word_in_string {

	public static void main(String[] args) {
		 String s = " the sky is          blue       "; //use trim method it will trim spaces from backward and forward
		// System.out.println((s)+" ");                    // it will remove leading and trailing elements
		 System.out.println(word(s));

	}
	public static String word(String s) {
		s = s.trim();    // it will remove leading and trailing elements
		String [] arr= s.split(" +");  // basically we created an array and then we split it and gave spaces in between them 
		String ans = ""; // created an empty string named answer to store the reversed answer
	    for(int i = arr.length-1;i>=0; i--) { // loop from back 
	    	ans = ans+arr[i]+" "; // answer variable from above + array[i] which will be 3 in this case which is blue +2+1+0 which are is sky the 
	    }
	    return ans.trim(); // at the end we used trim again if there are few spaces left after reversing the string so if there are left then it will get removed
		
				
			
	}

}

    
