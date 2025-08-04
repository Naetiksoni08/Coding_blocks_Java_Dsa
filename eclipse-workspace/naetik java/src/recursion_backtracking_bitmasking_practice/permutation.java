package recursion_backtracking_bitmasking_practice;
import java.util.*;


public class permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ques = "abc";
		String ans = "";
		List<String> ll = new ArrayList<>();
		permutation(ques,"" ,ll);
		System.out.println(ll);
		System.out.println(count);
		

		
	}
	static int count = 0;
	public static void permutation(String ques , String ans,List<String> ll) {
		if(ques.length() == 0) {
			ll.add(ans);
//			System.out.println(ans);
			count++;
			return;
		}
		for(int i = 0 ; i <ques.length(); i++) {
			char ch = ques.charAt(i);
			String s1 = ques.substring(0,i);
			String s2 = ques.substring(i+1);
			permutation(s1+s2,ans+ch,ll);
		}
		
	}

}
