package strings;

public class palindrome2 {

	public static void main(String[] args) {
		String s = "127";
		substring(s);
	}
	
	public static void substring(String str) {
		int c = 0;
		boolean[] visited = new boolean[str.length()];
		for(int len = 1; len<=str.length(); len++) {
			for(int j = len; j<=str.length(); j++) {
				int i = j-len;
				String s = str.substring(i, j);
				if(iscbnumber(Long.parseLong(s))==true && isvisited(visited,i,j-1)==true) {
					c++;
					for(int k = i;k<j; k++) {
						visited[k] = true;
					}
				}
			}
		}
		System.out.println(c);
	}

	public static boolean isvisited(boolean[] visited, int i, int j) {
		for(int k = i;k<=j; k++) {
			if(visited[k]==true) {
				return false;
			}
		}
		return true;
	}

	public static boolean iscbnumber(long num) {
		if (num == 0 || num == 1) {
			return false;
		}

		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29 };
		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				return true;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (num % arr[i]==0) {
				return false;
			}
		}
		return true;
		
	}
}
