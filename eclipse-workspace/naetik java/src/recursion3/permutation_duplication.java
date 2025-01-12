package recursion3;

public class permutation_duplication {


		public static void main(String[] args) {
		   String ques = "abca";
		   String ans = "";
		   permutation(ques,"");

		}

		public static void permutation(String ques,String ans) {
			if(ques.length() == 0) {
				System.out.println(ans+" ");
				return;
			}
			for(int i = 0 ; i<ques.length();i++) {
				char ch = ques.charAt(i); 
				boolean val = true;
				for(int j = i+1 ; j < ques.length(); j++) { //  we have to check whether a is present in the ending of the string abc or no if it is then we will ignore that a and if now then we will continue 
					if(ques.charAt(j) == ch) {
						val = false;
						break;
					}
					
				}
				if(val == true) {
				String s1 = ques.substring(0, i); 
				String s2 = ques.substring(i+1);
				permutation(s1+s2,ans+ch);
				}
				
				// if char.at is == the character a or the duplicate character then break but the thing is how will we get to know that we found a duplicate character and we did not run that 
				// in order to know that we made a new variable boolean val as true and before break we wrote val = false so if the value got change from true to false then that means that we found a variable a and i
				// and if we found the variable a then call wont go recursive call wont go 
				// and for that humne ek if aur laga dia ki only when val === true then only the string s1 and s2 should concat
				
				
				
			}


	}
		

}
