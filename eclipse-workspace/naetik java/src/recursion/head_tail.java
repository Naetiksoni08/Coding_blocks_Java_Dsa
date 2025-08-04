package recursion;

public class head_tail {

	public static void main(String[] args) {
		int n = 3;
		print(n, "");

	}
	public static void print(int n , String ans) {
		if(n == 0) {
			System.out.println(ans);
			return;
		
	}
		if(ans.length()==0 ||ans.charAt(ans.length()-1) != 'H') { // if last char == h then call na jaye  and ans.length agar 0 hai toh na chale 
			print(n-1, ans+"H");
		}
		
		print(n-1, ans+"T");
	

	}

}
