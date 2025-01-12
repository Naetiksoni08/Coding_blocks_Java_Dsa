package recursion3;

public class permutation_count {

	

		public static void main(String[] args) {
		   String ques = "abc";
		   String ans = "";
//		   permutation(ques,"");
		   System.out.println(count_permutation(ques,""));

		}


			public static int count_permutation(String ques,String ans) {
				if(ques.length() == 0) {
					System.out.println(ans+" ");
					return 1;
				}
				int count = 0 ;
				for(int i = 0 ; i<ques.length();i++) {
					char ch = ques.charAt(i); // ith character nikal lia
					String s1 = ques.substring(0, i); // string ka ith character nikal ne ke baad humne 0 se i character tak value nikal li
					//aur usse string mai bhar dia 
					String s2 = ques.substring(i+1);
					//aur fir ith character ke baad ke jitne elements bache hai humne voh nikal lia
					count+=count_permutation(s1+s2,ans+ch);
					
			
			}
				return count;

          }
	}
