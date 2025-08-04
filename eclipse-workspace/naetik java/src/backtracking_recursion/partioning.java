package backtracking_recursion;

public class partioning {

	public static void main(String[] args) {
		String s ="nitin";
		partition(s,"");
		

	}
	public static void partition(String ques , String ans ) {
		if(ques.length()==0) {
			System.out.println(ans);
			return;
		}
		for(int cut = 1; cut<=ques.length(); cut++) {
			String s = ques.substring(0,cut);
			partition(ques.substring(cut),ans+s+"|");
		}
	}

}
